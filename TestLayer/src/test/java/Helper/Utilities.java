package Helper;

import common.Log;
import uiFramework.WebDriver;

public class Utilities {

	
	static WebDriver _driver = null;

	 public static WebDriver WebDriver(Log logger) {
	       if(_driver == null){
	    	   _driver = new WebDriver(logger);
	       }
	       return _driver;
	    }
	
}
