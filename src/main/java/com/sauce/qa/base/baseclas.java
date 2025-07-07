package com.sauce.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.sauce.qa.Util.TestUtil;

public class baseclas {

	public static WebDriver driver;
	public static Properties prop;


	public baseclas(){
	 prop=new Properties();
	try {
		FileInputStream fis=new FileInputStream("C:\\Users\\Aathvika\\eclipse-workspace\\"
				+ "PageObjectModelTest\\src\\main\\java\\com\\sauce\\qa\\config\\configuration.properties");
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}
	public void Initilization() {
		 //driver=new ChromeDriver();
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
	    	driver=new ChromeDriver();
	    	driver.get(prop.getProperty("url"));
	    }
	    else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
	    	driver=new EdgeDriver();
	    	driver.get(prop.getProperty("url"));
	    }
	    	else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
		    	driver=new EdgeDriver();
		    	driver.get(prop.getProperty("url"));

	    }

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

	}
}


