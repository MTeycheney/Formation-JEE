package fr.dta.spring.jv;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.jolbox.bonecp.BoneCPDataSource;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class DatabaseConfiguration
{

	@Autowired
	private Environment environment;

	@Bean(destroyMethod="close", name="datasource")
	public DataSource dataSource()
	{
		BoneCPDataSource dataSource = new BoneCPDataSource();

		dataSource.setJdbcUrl(environment.getProperty("url"));
		dataSource.setDriverClass(environment.getProperty("driver"));
		dataSource.setUsername(environment.getProperty("login"));
		dataSource.setPassword(environment.getProperty("password"));

		/*
		 * dataSource.setIdleConnectionTestPeriodInMinutes(20);
		 * dataSource.setIdleMaxAgeInMinutes(idleMaxAgeInMinutes);
		 * dataSource.setMaxConnectionsPerPartition(10);
		 * dataSource.setMinConnectionsPerPartition(5);
		 * dataSource.setPartitionCount(partitionCount);
		 * dataSource.setAcquireIncrement(acquireIncrement);
		 * dataSource.setStatementsCacheSize(statementsCacheSize);
		 */
		
		return dataSource;
	}

	@Bean
	@Autowired
	public LocalContainerEntityManagerFactoryBean entityManagerFactory()
	{
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setPackagesToScan(new String[] { "fr.dta.spring.jv" });
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		emf.setJpaVendorAdapter(vendorAdapter);
		emf.setJpaProperties(additionalProperties());
		return emf;
	}

	Properties additionalProperties()
	{
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "auto");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");
		//properties.setProperty("hibernate.connection.provider_class", "org.hibernate.hikaricp.internal.HikariCPConnectionProvider");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		properties.setProperty("hibernate.cache.use_second_level_cache", "true");
		
		//hibernate.show_sql = false
		//		hibernate.format_sql = false
		//		hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
		//		hibernate.hbm2ddl.auto = create
		//		hibernate.cache.use_second_level_cache = true

		return properties;
	}
	
	@Bean
	@Autowired
	public PlatformTransactionManager txManager(DataSource datasource)
	{
		return new JpaTransactionManager();
	}
}

