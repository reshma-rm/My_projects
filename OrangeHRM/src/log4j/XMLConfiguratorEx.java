package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfiguratorEx {

	static Logger logger=Logger.getLogger(XMLConfiguratorEx.class);
	
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		
		 logger.debug("This is debug message");
		 logger.info("This is info message");
		 logger.warn("This is a warning");
		 logger.error("This is an error");
		 logger.fatal("This is fatal");

	}

}
