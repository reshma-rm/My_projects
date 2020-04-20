package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertiesFilelog4jEx {

	static Logger logger=Logger.getLogger(PropertiesFilelog4jEx.class);
	
public static void main(String[] args) {
		
	PropertyConfigurator.configure("log4j.properties");
	
	 logger.debug("This is debug message");
	 logger.info("This is info message");
	 logger.warn("This is a warning");
	 logger.error("This is an error");
	 logger.fatal("This is fatal");

	}

}
