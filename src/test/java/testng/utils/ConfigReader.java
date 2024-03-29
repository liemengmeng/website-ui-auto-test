package testng.utils;

import log4j.LoggerControler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import static log4j.LoggerControler.getLogger;

/**
 * Read config properties file.
 * 
 * @author kevinkong
 * 
 */
public class ConfigReader {
	final static LoggerControler logger= getLogger( ConfigReader.class);
	private static ConfigReader cr;
	private int retryCount = 0;
	private String sourceCodeDir = "src";
	private String sourceCodeEncoding = "UTF-8";

	private static final String RETRYCOUNT = "retrycount";
	private static final String SOURCEDIR = "sourcecodedir";
	private static final String SOURCEENCODING = "sourcecodeencoding";

	static String path=System.getProperty("user.dir");
	private static final String CONFIGFILE =path+ "/configs/config.properties";

	private ConfigReader() {
		readConfig(CONFIGFILE);
	}
	
	public static ConfigReader getInstance() {
		if(cr == null) {
			cr = new ConfigReader();
		}
		return cr;
	}
	
	private void readConfig(String fileName) {
		Properties properties = getConfig(fileName);
		if (properties != null) {
			String sRetryCount = null;
			
			Enumeration<?> en = properties.propertyNames();
			while (en.hasMoreElements()) {
				String key = (String) en.nextElement();
				if(key.toLowerCase().equals(RETRYCOUNT)) {
					sRetryCount = properties.getProperty(key);
				}
				if(key.toLowerCase().equals(SOURCEDIR)) {
					sourceCodeDir = properties.getProperty(key);
				}
				if(key.toLowerCase().equals(SOURCEENCODING)) {
					sourceCodeEncoding = properties.getProperty(key);
				}
			}
			if (sRetryCount != null) {
				sRetryCount = sRetryCount.trim();
				try {
					retryCount = Integer.parseInt(sRetryCount);
				} catch (final NumberFormatException e) {
					throw new NumberFormatException("Parse " + RETRYCOUNT + " [" + sRetryCount + "] from String to Int Exception");
				}
			}
		}
	}

	public int getRetryCount() {
		return retryCount;
	}
	
	public String getSourceCodeDir() {
		return this.sourceCodeDir;
	}

	public String getSrouceCodeEncoding() {
		return this.sourceCodeEncoding;
	}

	/**
	 * 
	 * @param propertyFileName
	 * 
	 * @return
	 */
	private Properties getConfig(String propertyFileName) {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(propertyFileName));
		} catch (FileNotFoundException e) {
			properties = null;
			logger.warn("FileNotFoundException:" + propertyFileName);
		} catch (IOException e) {
			properties = null;
			logger.warn("IOException:" + propertyFileName);
		}
		return properties;
	}
}
