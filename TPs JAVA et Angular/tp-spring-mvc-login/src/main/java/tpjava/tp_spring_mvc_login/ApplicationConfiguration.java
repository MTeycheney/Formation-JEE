package tpjava.tp_spring_mvc_login;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.jpa.JpaTransactionManager;
import com.jolbox.bonecp.BoneCPDataSource;

@Configuration
@EnableTransactionManagement
public class ApplicationConfiguration
{
	@Primary
	@Bean
	public DataSource dataSource()
	{
      BoneCPDataSource dataSource = new BoneCPDataSource();
		
		
		dataSource.setDriverClass("org.postgresql.Driver");
		dataSource.setJdbcUrl("jdbc:postgresql://localhost/tp_json");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres");
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
	public PlatformTransactionManager txManager(DataSource datasource)
	{		
		return new JpaTransactionManager();
	}

	@Bean
	@Autowired
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource datasource)
	{		
	
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
	
		emf.setDataSource(datasource);
		
		emf.setPackagesToScan( "tpjava.tp_spring_mvc_login");
		
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		
		emf.setJpaVendorAdapter(vendorAdapter);
	
		emf.setJpaProperties(additionalProperties());
		
		return emf;
	}

	Properties additionalProperties()
	{
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");
		// Oh oh !
		// properties.setProperty("hibernate.connection.provider_class", "org.hibernate.hikaricp.internal.HikariCPConnectionProvider");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		return properties;
	}

}
