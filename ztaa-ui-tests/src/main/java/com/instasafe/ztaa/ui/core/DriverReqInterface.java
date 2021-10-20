package com.instasafe.ztaa.ui.core;

  interface DriverReqInterface {

	
	// Drivers
	  static final String CHROME_WEBDRIVER =  "webdriver.chrome.driver";
	  static final String FIREFOX_WEBDRIVER = "webdriver.gecko.driver";
	  static final String IE_WEBDRIVER = 	   "webdriver.ie.driver";
	  static final String OPERA_WEBDRIVER =   "webdriver.opera.driver";
	
	static final String USER_DIR = "user.dir";
	
	//path for webdrivers
	  static final String CHROME_PATH  =  System.getProperty(USER_DIR) + "//src//test//java//drivers//windows//chromedriver.exe"; 
	  static final String FIREFOX_PATH = System.getProperty(USER_DIR) + "//src//test//java//drivers//windows//geckodriver.exe"; 
	  static final String IE_PATH      =	  System.getProperty(USER_DIR) + "//src//test//java//drivers//windows//IEDriverServer.exe"; 
	  static final String OPERA_PATH  =   System.getProperty(USER_DIR) + "//src//test//java//drivers//windows//operadriver.exe"; 
	
	
	static final String WINDOWS = "windows";
	static final String MAC = "mac";
	static final String LINUX = "linux";
	
	void launchFireFox();
	void launchChrome();
	void launchIE();
	void launchOpera();
	
}
