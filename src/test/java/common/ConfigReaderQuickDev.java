package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReaderQuickDev {
	
	
	public static String getKeyValue(String keyName) throws Exception {
	Properties properties=new Properties();
	FileInputStream fileInputStream=new FileInputStream("C:\\Workspace\\QuickDev\\src\\main\\resources\\main\\resources\\config.properties");
	
//	FileInputStream fileInputStream=new FileInputStream("C:\\Users\\asus\\Documents\\eclipse-workspace\\SeleniumWD\\bin\\config\\properties");
	properties.load(fileInputStream);
	return properties.getProperty(keyName);
	
	}
	public static void main(String[] args) throws Exception {
	      System.out.println(getKeyValue("BROWSERNAME"));
	      
	}
	

}








//C:\Workspace\Umaxx.tvAutomation\src\main\resources
//C:\Workspace\QuickDev\src\main\resources\main\resources