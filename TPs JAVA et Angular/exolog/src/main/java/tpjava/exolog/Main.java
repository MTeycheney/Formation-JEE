package tpjava.exolog;

import org.slf4j.*;

import ch.qos.logback.classic.Level;

public class Main
{
	
	private static final Logger monlog = LoggerFactory.getLogger(Main.class); // On initialise un logger de la classe Logger de SLF4J (ou Logback)

	public static void main(String[] args)
	{

		// On fait appel au logger créé au-dessus et on lui donne un contexte.
		monlog.info("Exemple de log de {}", Main.class.getSimpleName());

		
		// Exemple donné
		ch.qos.logback.classic.Logger parentLogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.baeldung.logback");

		parentLogger.setLevel(Level.INFO);

		Logger childlogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.baeldung.logback.tests");

		parentLogger.warn("This message is logged because WARN > INFO.");
		parentLogger.debug("This message is not logged because DEBUG < INFO.");
		childlogger.info("INFO == INFO");
		childlogger.debug("DEBUG < INFO");
		
		/*	We start by retrieving a Logger named com.baeldung.logback and cast it to a ch.qos.logback.classic.Logger.

			A Logback context is needed to set the level in the next statement; note that the SLF4J’s abstract logger does not implement setLevel().
			
			We set the level of our context to INFO; we then create another logger named com.baeldung.logback.tests.
			
			We log two messages with each context to demonstrate the hierarchy. Logback logs the WARN, and INFO messages and filters the DEBUG messages.
		=================================================================================================================================================
		*/
		
		ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger)LoggerFactory.getLogger("com.baeldung.logback");
		logger.debug("Hi there!");
		 
		Logger rootLogger = (ch.qos.logback.classic.Logger)LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
		logger.debug("This message is logged because DEBUG == DEBUG.");
		 
		((ch.qos.logback.classic.Logger) rootLogger).setLevel(Level.ERROR);
		 
		logger.warn("This message is not logged because WARN < ERROR.");
		logger.error("This is logged.");

		/*  To conclude, we started with a Logger context and printed a DEBUG message.

			We then retrieved the root logger using its statically defined name and set its level to ERROR.
			
			And finally, we demonstrated that Logback actually does filter any statement less than an error. */

	}

}
