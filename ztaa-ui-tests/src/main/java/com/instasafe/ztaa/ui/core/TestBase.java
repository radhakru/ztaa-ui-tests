package com.instasafe.ztaa.ui.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;

/*
 * @author Pradip Bisoi
 *
 */

public class TestBase {

	public static WebDriver driver;
	private static Properties properties;
	
	// Drivers
	public static final String CHROME_WEBDRIVER =  "webdriver.chrome.driver";
	public static final String FIREFOX_WEBDRIVER = "webdriver.gecko.driver";
	public static final String IE_WEBDRIVER = 	   "webdriver.ie.driver";
	public static final String OPERA_WEBDRIVER =   "webdriver.opera.driver";
	
	private static final String USER_DIR = "user.dir";
	
	//path for webdrivers
	public static final String CHROME_PATH  =  System.getProperty(USER_DIR) + "//src//test//java//drivers//windows//chromedriver.exe"; 
	public static final String FIREFOX_PATH = System.getProperty(USER_DIR) + "//src//test//java//drivers//windows//geckodriver.exe"; 
	public static final String IE_PATH      =	  System.getProperty(USER_DIR) + "//src//test//java//drivers//windows//IEDriverServer.exe"; 
	public static final String OPERA_PATH  =   System.getProperty(USER_DIR) + "//src//test//java//drivers//windows//operadriver.exe"; 
	
	
	private static final String WINDOWS = "windows";
	private static final String MAC = "mac";
	private static final String LINUX = "linux";
	private static String qaPropertiesFilePath = "qaEnvironment.properties";
	private static String consoleURL = "";
	private static String CONSOLEURL_PROPERTY_NAME = "ConsoleURL";
	private static String userName = "";
	private static String userNameInvalid = "";
	private static String adminusersName = "";
	private static String adminusersUserName = "";
	private static String USERNAME_PROPERTY_NAME = "username";
	private static String USERNAME_INVALID_PROPERTY_NAME = "usernameinvalid";
	private static String pwd = "";
	private static String PWD_PROPERTY_NAME = "pwd";
	private static String usersName = "";
	private static String userGroupsName = "";
	private static String userUpdatedGroupsName = "";
	private static String userGroupsSearch = "";
	private static String usersEmail = "";
	private static String usersUserName = "";
	private static String usersPhone = "";
	private static String usersadminEmail = "";
	private static String adminusersPhone = "";
	private static String ADMIN_USERS_NAME = "adminusername";
	private static String ADMIN_USERS_USERNAME_PROPERTY = "adminusersusername";
	private static String ADMIN_USERS_EMAIL_PROPERTY = "adminuseremail";
	private static String USERGROUPS_NAME_PROPERTY_NAME = "usergroupsName";
	private static String USERGROUPS_NAMESEARCH_PROPERTY = "usergroupnamesearch";
	private static String USERGROUPS_UPDATENAME_PROPERTY = "updatenameusergroup";
	private static String USERS_NAME_PROPERTY_NAME = "usersname";
	private static String USERS_EMAIL_PROPERTY_NAME = "usersemail";
	
	private static String searchadminusername = "";
	private static String SEARCH_ADMINNAME_PROPERTY_NAME = "searchadminusername";
	
	
	private static String USERS_USERNAME_PROPERTY_NAME = "usersusername";
	private static String USERS_PHONE_PROPERTY_NAME = "usersphone";
	private static String access = "";
	private static String ACCESS_CODE_PROPERTY_NAME = "access";
	private static String gatewaysearchip = "";
	private static String GATEWAY_SEARCH_PROPERTY_NAME = "gatewaysearchip";
	private static String gatewaysearchapp = "";
	private static String GATEWAY_SEARCHAPP_PROPERTY_NAME = "gatewaysearchapp";
	private static String PERIMTR_APPNAME_PROPERTY_NAME = "appnameaddperimtr";
	private static String appnameaddperimtr = "";
	private static String PERIMTR_APPURL_PROPERTY_NAME = "appurladdperimtr";
	private static String appurladdperimtr = "";
	private static String PERIMTR_APPSEARCH_PROPERTY_NAME = "appSearchperimtr";
	private static String appSearchperimtr = "";
	private static String PERIMTR_APPCIDR_PROPERTY_NAME = "appcidrperimtr";
	private static String appcidrperimtr = "";
	private static String PERIMTR_APPNAMEADD_PROPERTY_NAME = "appsnameenter";
	private static String appsnameenter = "";
	private static String PERIMTR_APPHOSTNAME_PROPERTY_NAME = "appsHostname";
	private static String appsHostname = "";
	private static String FILESHARE_FOLDERPATH_PROPERTY_NAME = "filesharefolderpath";
	private static String filesharefolderpath = "";
	private static String NETWORKAPP_IP_PROPERTY_NAME = "networkappIP";
	private static String networkappIP = "";
	private static String NETWORKAPP_PORT_PROPERTY_NAME = "networkappPort";
	private static String networkappPort = "";

	private static String enteridpName = "";
	private static String ENTER_IDPNAME_PROPERTY_NAME = "enteridpName";

	private static String ascurl = "";
	private static String ENTER_ASCURL_PROPERTY_NAME = "ascurl";

	private static String idpentity = "";
	private static String ENTER_IDPENTITY_PROPERTY_NAME = "idpentity";

	private static String spentityid = "";
	private static String ENTER_SPENTITYID_PROPERTY_NAME = "spentityid";

	private static String attributenameofIDP = "";
	private static String ENTER_ATRRIBUTENAME_IDP_PROPERTY_NAME = "attributenameofIDP";

	private static String searchIDPname = "";
	private static String ENTER_IDPNAMEFORSEARECH_PROPERTY_NAME = "searchIDPname";

	private static String searchappnameunderIDP = "";
	private static String ENTER_APP_NAMEINIDP_SEARECH_PROPERTY_NAME = "searchappnameunderIDP";

	private static String searchinvalidappnameunderIDP = "";
	private static String ENTER_INVALID_APP_FOR_SEARCH = "searchinvalidappnameunderIDP";

	private static String searchmincharwithappnameunderIDP = "";
	private static String ENTER_MINI_CHAR_FOR_SEARCH_IDPAPP_PROPERTY_NAME = "searchmincharwithappnameunderIDP";

	private static String searchappnamewithminicharunderIDP = "";
	private static String ENTER_MINI_CHAR_FOR_SEARCH_APPUNDERIDP_PROPERTY_NAME = "searchappnamewithminicharunderIDP";

	private static String searchgtwaystatusAudits = "";
	private static String ENTER_GATEWAYNAME_FORSEARCHAUDITS_PROPERTY_NAME = "searchgtwaystatusAudits";

	private static String searchunameAuthLogsAudits = "";
	private static String ENTER_AUTHENTICATIONLOGS_FORSEARCHUNAME_PROPERTY_NAMES = "searchunameAuthLogsAudits";

	private static String searchunameUserLoginsAudits = "";
	private static String ENTER_USERNAMELOGINS_FORSEARCHUNAMEAUDITS_PROPERTY_NAMES = "searchunameUserLoginsAudits";

	private static String searchunameUsernameLookupsAudits = "";
	private static String ENTER_USERNAMELOGINS_FORSEARCHUNAMELoOOKUPS_PROPERTY_NAMES = "searchunameUsernameLookupsAudits";

	private static String searcheventnameineventbarselecteventTab = "";
	private static String ENTER_EVENTNAME_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES = "searcheventnameineventbarselecteventTab";

	private static String searcheventnameUserbindUnbinddeviceineventbarselecteventTab = "";
	private static String ENTER_EVENTNAMEUSERBINDUNBINDDEVICE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES = "searcheventnameUserbindUnbinddeviceineventbarselecteventTab";

	private static String searcheventnameuserDeviceblockunblockineventbarselecteventTab = "";
	private static String ENTER_EVENTNAMEUSERDEVICEBLOCKUNBLOCK_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES = "searcheventnameuserDeviceblockunblockineventbarselecteventTab";

	private static String searcheventnameuserDeviceDeleteineventbarselecteventTab = "";
	private static String ENTER_EVENTNAMEUSERDEVICEDELETE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES = "searcheventnameuserDeviceDeleteineventbarselecteventTab";

	private static String searcheventnameuserGroupCraeteineventbarselecteventTab = "";
	private static String ENTER_EVENTNAMEUSERGROUPCREATE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES = "searcheventnameuserGroupCraeteineventbarselecteventTab";

	private static String searcheventnameuserGroupCraetewithMembersineventbarselecteventTab = "";
	private static String ENTER_EVENTNAMEUSERGROUPCREATEWITHMMBERS_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES = "searcheventnameuserGroupCraetewithMembersineventbarselecteventTab";

	
	private static String searcheventnameuserRoleUpdateineventbarselecteventTab = "";
	private static String ENTER_EVENTNAMEUSERROLEUPDATE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES = "searcheventnameuserGroupCraetewithMembersineventbarselecteventTab";

	
	
	
	private static String searcheventnameuserGroupAddMembersineventbarselecteventTab="";
	private static String ENTER_EVENTNAMEUSERGroupAddMembers_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameuserGroupAddMembersineventbarselecteventTab";
		
		private static String searcheventnameuserGroupDeleteineventbarselecteventTab="";
		private static String ENTER_EVENTNAMEUSERGroupDelete_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameuserGroupDeleteineventbarselecteventTab";

		private static String searcheventnameuserGroupUpdateineventbarselecteventTab="";
		private static String ENTER_EVENTNAMEUSERGroupUpdate_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameuserGroupUpdateineventbarselecteventTab";

		private static String searcheventnameuserGroupMemberdeleteineventbarselecteventTab="";
		private static String ENTER_EVENTNAMEUSERGGROUPDELETEMEMBER_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameuserGroupMemberdeleteineventbarselecteventTab";



	private static String searcheventnameuserAuthProfileUpdateineventbarselecteventTab="";
	private static String ENTER_EVENTNAMEUSERAUTHPROFILEUPDATE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameuserAuthProfileUpdateineventbarselecteventTab";


	private static String searcheventnameuserAuthProfileDelteineventbarselecteventTab="";
	private static String ENTER_EVENTNAMEUSERAUTHPROFILEDELETE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameuserAuthProfileDelteineventbarselecteventTab";

	
	
	private static String searcheventnameuserProfileEnableDisable="";
	private static String ENTER_EVENTNAMEUSERPROFILEENABLE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameuserProfileEnableDisable";

	private static String searcheventnameuserLogoutineventbarselecteventTab="";
	private static String ENTER_EVENTNAMEUSERLOGOUT_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameuserLogoutineventbarselecteventTab";
	
	private static String searcheventnameusersetPswrdlinkCreateineventbarselecteventTab="";
	private static String ENTER_EVENTNAMEUSERPSWLINKCREATE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameusersetPswrdlinkCreateineventbarselecteventTab";
	
	
	private static String searcheventnameuserResetPswrdineventbarselecteventTab="";
	private static String ENTER_EVENTNAMEUSERRESETPSWRD_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameuserResetPswrdineventbarselecteventTab";
	
	
	private static String searcheventnameuserTokenRefereshineventbarselecteventTab="";
	private static String ENTER_EVENTNAMEUSERTOCKENREFRESH_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES="searcheventnameuserTokenRefereshineventbarselecteventTab";
	

	
	
	
	
	private static String datasetnameadd = "";
	private static String ADD_DATASET_NAME_PROPERTY_NAME = "datasetnameadd";

	private static String datasetsearch = "";
	private static String SEARCH_DATASET_PROPERTY_NAME = "datasetsearch";

	private static String datasetrecordvalue = "";
	private static String ADD_DATASET_RECORD_PROPERTY_NAME = "datasetrecordvalue";

	private static String datastimeStarttime = "";
	private static String DATETIME_DATASET_STARTTIME_PROPERTY_NAME = "datastimeStarttime";

	private static String datastimeEndtime = "";
	private static String DATETIME_DATASET_ENDTIME_PROPERTY_NAME = "datastimeEndtime";

	private static String env = "";
	private static String osName = "";

	public TestBase() {

		osName = System.getProperty("os.name").toLowerCase();
//		System.out.print(osName);

		String propertiesFilePath = "";
		env = System.getProperty("env");
		if (env == null || env.isEmpty()) {
			propertiesFilePath = qaPropertiesFilePath;

		} else {
			System.out.println("No environment file found");
		}

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFilePath);
		properties = new Properties();
		try {
			properties.load(inputStream);
			consoleURL = properties.getProperty(CONSOLEURL_PROPERTY_NAME).trim();
			userName = properties.getProperty(USERNAME_PROPERTY_NAME).trim();
			userNameInvalid = properties.getProperty(USERNAME_INVALID_PROPERTY_NAME).trim();
			pwd = properties.getProperty(PWD_PROPERTY_NAME).trim();
			usersName = properties.getProperty(USERS_NAME_PROPERTY_NAME).trim();
			usersEmail = properties.getProperty(USERS_EMAIL_PROPERTY_NAME).trim();
			usersUserName = properties.getProperty(USERS_USERNAME_PROPERTY_NAME).trim();
			usersPhone = properties.getProperty(USERS_PHONE_PROPERTY_NAME).trim();
			userUpdatedGroupsName = properties.getProperty(USERGROUPS_UPDATENAME_PROPERTY).trim();
			userGroupsSearch = properties.getProperty(USERGROUPS_NAMESEARCH_PROPERTY).trim();
			userGroupsName = properties.getProperty(USERGROUPS_NAME_PROPERTY_NAME).trim();
			access = properties.getProperty(ACCESS_CODE_PROPERTY_NAME).trim();
			gatewaysearchip = properties.getProperty(GATEWAY_SEARCH_PROPERTY_NAME).trim();
			gatewaysearchapp = properties.getProperty(GATEWAY_SEARCHAPP_PROPERTY_NAME).trim();
			adminusersName = properties.getProperty(ADMIN_USERS_NAME).trim();
			// adminusersPhone=properties.getProperty(ADMIN_USERS_PHONE_PROPERTY).trim();
			searchadminusername=properties.getProperty(SEARCH_ADMINNAME_PROPERTY_NAME).trim();
			usersadminEmail = properties.getProperty(ADMIN_USERS_EMAIL_PROPERTY).trim();
			adminusersUserName = properties.getProperty(ADMIN_USERS_USERNAME_PROPERTY).trim();
			appnameaddperimtr = properties.getProperty(PERIMTR_APPNAME_PROPERTY_NAME).trim();
			appurladdperimtr = properties.getProperty(PERIMTR_APPURL_PROPERTY_NAME).trim();
			appSearchperimtr = properties.getProperty(PERIMTR_APPSEARCH_PROPERTY_NAME).trim();
			appcidrperimtr = properties.getProperty(PERIMTR_APPCIDR_PROPERTY_NAME).trim();
			appsnameenter = properties.getProperty(PERIMTR_APPNAMEADD_PROPERTY_NAME).trim();
			appsHostname = properties.getProperty(PERIMTR_APPHOSTNAME_PROPERTY_NAME).trim();
			filesharefolderpath = properties.getProperty(FILESHARE_FOLDERPATH_PROPERTY_NAME).trim();
			networkappIP = properties.getProperty(NETWORKAPP_IP_PROPERTY_NAME).trim();
			networkappPort = properties.getProperty(NETWORKAPP_PORT_PROPERTY_NAME).trim();

			enteridpName = properties.getProperty(ENTER_IDPNAME_PROPERTY_NAME).trim();
			idpentity = properties.getProperty(ENTER_IDPENTITY_PROPERTY_NAME).trim();
			spentityid = properties.getProperty(ENTER_SPENTITYID_PROPERTY_NAME).trim();
			attributenameofIDP = properties.getProperty(ENTER_ATRRIBUTENAME_IDP_PROPERTY_NAME).trim();

			ascurl = properties.getProperty(ENTER_ASCURL_PROPERTY_NAME).trim();
			searchIDPname = properties.getProperty(ENTER_IDPNAMEFORSEARECH_PROPERTY_NAME).trim();
			searchappnameunderIDP = properties.getProperty(ENTER_APP_NAMEINIDP_SEARECH_PROPERTY_NAME).trim();
			searchinvalidappnameunderIDP = properties.getProperty(ENTER_INVALID_APP_FOR_SEARCH).trim();
			searchmincharwithappnameunderIDP = properties.getProperty(ENTER_MINI_CHAR_FOR_SEARCH_IDPAPP_PROPERTY_NAME)
					.trim();
			searchappnamewithminicharunderIDP = properties
					.getProperty(ENTER_MINI_CHAR_FOR_SEARCH_APPUNDERIDP_PROPERTY_NAME).trim();

			searchgtwaystatusAudits = properties.getProperty(ENTER_GATEWAYNAME_FORSEARCHAUDITS_PROPERTY_NAME).trim();
			searchunameAuthLogsAudits = properties.getProperty(ENTER_AUTHENTICATIONLOGS_FORSEARCHUNAME_PROPERTY_NAMES)
					.trim();
			searchunameUserLoginsAudits = properties
					.getProperty(ENTER_USERNAMELOGINS_FORSEARCHUNAMEAUDITS_PROPERTY_NAMES).trim();
			searchunameUsernameLookupsAudits = properties
					.getProperty(ENTER_USERNAMELOGINS_FORSEARCHUNAMELoOOKUPS_PROPERTY_NAMES).trim();

			searcheventnameineventbarselecteventTab = properties
					.getProperty(ENTER_EVENTNAME_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES).trim();
			searcheventnameUserbindUnbinddeviceineventbarselecteventTab = properties
					.getProperty(ENTER_EVENTNAMEUSERBINDUNBINDDEVICE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES).trim();
			searcheventnameuserDeviceblockunblockineventbarselecteventTab = properties
					.getProperty(ENTER_EVENTNAMEUSERDEVICEBLOCKUNBLOCK_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES)
					.trim();
			searcheventnameuserDeviceDeleteineventbarselecteventTab = properties
					.getProperty(ENTER_EVENTNAMEUSERDEVICEDELETE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES).trim();
			searcheventnameuserGroupCraeteineventbarselecteventTab = properties
					.getProperty(ENTER_EVENTNAMEUSERGROUPCREATE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES).trim();
			searcheventnameuserRoleUpdateineventbarselecteventTab = properties
					.getProperty(ENTER_EVENTNAMEUSERROLEUPDATE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES).trim();
			searcheventnameuserGroupCraetewithMembersineventbarselecteventTab = properties
					.getProperty(ENTER_EVENTNAMEUSERGROUPCREATEWITHMMBERS_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES)
					.trim();
			
			searcheventnameuserGroupAddMembersineventbarselecteventTab=properties
					.getProperty(ENTER_EVENTNAMEUSERGroupAddMembers_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES).trim();
			searcheventnameuserGroupDeleteineventbarselecteventTab=properties
					.getProperty(ENTER_EVENTNAMEUSERGroupDelete_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES).trim();
			searcheventnameuserGroupUpdateineventbarselecteventTab=properties
					.getProperty(ENTER_EVENTNAMEUSERGroupUpdate_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES).trim();
			searcheventnameuserGroupMemberdeleteineventbarselecteventTab=properties
					.getProperty(ENTER_EVENTNAMEUSERGGROUPDELETEMEMBER_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES).trim();
			
			searcheventnameuserAuthProfileUpdateineventbarselecteventTab=properties
                     .getProperty(ENTER_EVENTNAMEUSERAUTHPROFILEUPDATE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES)
                     .trim();

			searcheventnameuserAuthProfileDelteineventbarselecteventTab=properties
					.getProperty(ENTER_EVENTNAMEUSERAUTHPROFILEDELETE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES)
					.trim();
			
			
			searcheventnameuserProfileEnableDisable=properties
					.getProperty(ENTER_EVENTNAMEUSERPROFILEENABLE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES)
					.trim();
			
			searcheventnameuserLogoutineventbarselecteventTab=properties
					.getProperty(ENTER_EVENTNAMEUSERLOGOUT_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES)
					.trim();
			
			searcheventnameusersetPswrdlinkCreateineventbarselecteventTab=properties
					.getProperty(ENTER_EVENTNAMEUSERPSWLINKCREATE_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES)
			       .trim();
			
			
			searcheventnameuserResetPswrdineventbarselecteventTab=properties
					.getProperty(ENTER_EVENTNAMEUSERRESETPSWRD_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES)
					 .trim();
			
			searcheventnameuserTokenRefereshineventbarselecteventTab=properties
					.getProperty(ENTER_EVENTNAMEUSERTOCKENREFRESH_FORSEARCH_INSELECTEVENTTAB_PROPERTY_NAMES)
					.trim();

			
			datasetnameadd = properties.getProperty(ADD_DATASET_NAME_PROPERTY_NAME).trim();
			datasetsearch = properties.getProperty(SEARCH_DATASET_PROPERTY_NAME).trim();
			datasetrecordvalue = properties.getProperty(ADD_DATASET_RECORD_PROPERTY_NAME).trim();
			datastimeStarttime = properties.getProperty(DATETIME_DATASET_STARTTIME_PROPERTY_NAME).trim();
			datastimeEndtime = properties.getProperty(DATETIME_DATASET_ENDTIME_PROPERTY_NAME).trim();

		} catch (IOException e) {
			e.printStackTrace();

		}
		// launchChrome();

	}

	public static void init() {
		//launchChrome();
		
		launchFireFox();
		
		//launchIE();
		
		//launchOpera();
		
	}
	
	//firefox
	public static void launchFireFox() {

		if (osName.contains(MAC)) {

			System.setProperty(CHROME_WEBDRIVER,
					System.getProperty(USER_DIR) + "//src//test//java//drivers//mac//chromedriver");
		} else if (osName.contains(WINDOWS)) {

			System.setProperty(FIREFOX_WEBDRIVER,FIREFOX_PATH);
			
		} else if (osName.contains(LINUX)) {

			System.setProperty(CHROME_WEBDRIVER,
					System.getProperty(USER_DIR) + "//src//test//java//drivers//linux//chromedriver");
		}

		  driver = new FirefoxDriver();
		// below code is for headless chrome execution
/*
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("headless");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("window-size=1920x1080");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");

		driver = new ChromeDriver(options);
*/
	}
	//Internet explorer
	public static void launchIE() {

		if (osName.contains(MAC)) {

			System.setProperty(CHROME_WEBDRIVER,
					System.getProperty(USER_DIR) + "//src//test//java//drivers//mac//chromedriver");
		} else if (osName.contains(WINDOWS)) {

			System.setProperty(IE_WEBDRIVER,IE_PATH);
			
		} else if (osName.contains(LINUX)) {

			System.setProperty(CHROME_WEBDRIVER,
					System.getProperty(USER_DIR) + "//src//test//java//drivers//linux//chromedriver");
		}

		  driver = new InternetExplorerDriver();
		// below code is for headless chrome execution
/*
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("headless");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("window-size=1920x1080");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");

		driver = new ChromeDriver(options);
*/
	}
	//Opera 
	public static void launchOpera() {

		if (osName.contains(MAC)) {

			System.setProperty(CHROME_WEBDRIVER,
					System.getProperty(USER_DIR) + "//src//test//java//drivers//mac//chromedriver");
		} else if (osName.contains(WINDOWS)) {

			System.setProperty(OPERA_WEBDRIVER,OPERA_PATH);
		} else if (osName.contains(LINUX)) {

			System.setProperty(CHROME_WEBDRIVER,
					System.getProperty(USER_DIR) + "//src//test//java//drivers//linux//chromedriver");
		}

		  driver = new OperaDriver();
		// below code is for headless chrome execution
/*
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("headless");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("window-size=1920x1080");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");

		driver = new ChromeDriver(options);
*/
	}
	
	
	
	
	//chrome
	public static void launchChrome() {

		if (osName.contains(MAC)) {

			System.setProperty(CHROME_WEBDRIVER,
					System.getProperty(USER_DIR) + "//src//test//java//drivers//mac//chromedriver");
		} else if (osName.contains(WINDOWS)) {

			System.setProperty(CHROME_WEBDRIVER,
					System.getProperty(USER_DIR) + "//src//test//java//drivers//windows//chromedriver.exe");
		} else if (osName.contains(LINUX)) {

			System.setProperty(CHROME_WEBDRIVER,
					System.getProperty(USER_DIR) + "//src//test//java//drivers//linux//chromedriver");
		}

		  driver = new ChromeDriver();
		// below code is for headless chrome execution
/*
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("headless");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("window-size=1920x1080");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");

		driver = new ChromeDriver(options);
*/
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public String getConsoleUrl() {
		return consoleURL;
	}

	public String getUsername() {
		return userName;
	}
	public String getAdminUsernameforsearch() {
		return searchadminusername;
	}
	
	
	public String getUsernameInvalid() {
		return userNameInvalid;
	}

	public String getPwd() {
		return pwd;
	}

	public String getUsersName() {
		return usersName;
	}

	public String getUserGroupsName() {
		return userGroupsName;
	}

	public String getUserGroupsSearch() {
		return userGroupsSearch;
	}

	public String getuserUpdatedGroupsName() {
		return userUpdatedGroupsName;
	}

	public String getUsersEmail() {
		return usersEmail;
	}

	public String getUsersUserName() {
		return usersUserName;
	}

	public String getUsersPhone() {
		return usersPhone;
	}

	public String getAccess() {
		return access;
	}

	public String getGatewaysearch() {
		return gatewaysearchip;
	}

	public String getGatewaysearchApp() {
		return gatewaysearchapp;
	}

	public String getAdminUserName() {
		return adminusersName;
	}

	public String getAdminUserPhone() {
		return adminusersPhone;
	}

	public String getAdminUserEmail() {
		return usersadminEmail;
	}

	public String getAdminUsersUserName() {
		return adminusersUserName;
	}

	public String getAppnameaddperimtr() {
		return appnameaddperimtr;
	}

	public String getAppurladdperimtr() {
		return appurladdperimtr;
	}

	public String getAppsearchperimtr() {
		return appSearchperimtr;
	}

	public String getAppcidrperimtr() {
		return appcidrperimtr;
	}

	public String getAppsnameenter() {
		return appsnameenter;
	}

	public String getApphostname() {
		return appsHostname;
	}

	public String getfilesharefolderpath() {
		return filesharefolderpath;
	}

	public String getnetworkappIP() {
		return networkappIP;
	}

	public String getnetworkappPort() {
		return networkappPort;
	}

	public String getIDPName() {
		return enteridpName;
	}

	public String getIDPEntityName() {
		return idpentity;
	}

	public String getSpEntityid() {
		return spentityid;
	}

	public String getAttributeName() {
		return attributenameofIDP;
	}

	public String getSearchIDPName() {
		return searchIDPname;
	}

	public String getSearchAppnameunderIDP() {
		return searchappnameunderIDP;
	}

	public String getASCurl() {
		return ascurl;
	}

	public String getSearchInvalidIDP() {
		return searchinvalidappnameunderIDP;
	}

	public String getSearchMinicharIDP() {
		return searchmincharwithappnameunderIDP;

	}

	public String getSearchappnameMinicharIDP() {
		return searchappnamewithminicharunderIDP;

	}

	public String getDatasetname() {
		return datasetnameadd;
	}

	public String getDatasetsearch() {
		return datasetsearch;
	}

	public String getDatasetRecordvalue() {
		return datasetrecordvalue;
	}

	public String getdatastimeStarttime() {
		return datastimeStarttime;
	}

	public String getdatastimeEndtime() {
		return datastimeEndtime;
	}

	public String getSearchgtwaynmAudits() {
		return searchgtwaystatusAudits;

	}

	public String getSearchunameAuthLogsAudits() {
		return searchunameAuthLogsAudits;

	}

	public String getSearchunameUserNameLoginsAudits() {
		return searchunameUserLoginsAudits;

	}

	public String getSearchunameUserNamELookupsAudits() {
		return searchunameUsernameLookupsAudits;

	}

	public String getSearchEventnameinselectEventBar() {
		return searcheventnameineventbarselecteventTab;

	}

	public String getSearchEventnameUserBindUnbindDeviceinselectEventBar() {
		return searcheventnameUserbindUnbinddeviceineventbarselecteventTab;

	}

	public String getSearchEventnameUserDeviceBlockUnblockinselectEventBar() {
		return searcheventnameuserDeviceblockunblockineventbarselecteventTab;

	}

	public String getSearchEventnameUserDeviceDeleteinselectEventBar() {
		return searcheventnameuserDeviceDeleteineventbarselecteventTab;

	}

	public String getSearchEventnameUserGroupCreateinselectEventBar() {
		return searcheventnameuserGroupCraeteineventbarselecteventTab;

	}

	public String getSearchEventnameUserRoleUpdateinselectEventBar() {
		return searcheventnameuserRoleUpdateineventbarselecteventTab;

	}

	public String getSearchEventnameUserGroupCreateWithMembersEventBar() {
		return searcheventnameuserGroupCraetewithMembersineventbarselecteventTab;

	}

	
	public String getSearchEventnameUserGroupAddMembersEventBar() {
		return searcheventnameuserGroupAddMembersineventbarselecteventTab;
	
	}
	
	public String getSearchEventnameUserGroupDeleteEventBar() {
		return searcheventnameuserGroupDeleteineventbarselecteventTab;
	
	}
	
	public String getSearchEventnameUserGroupUpdateEventBar() {
		return searcheventnameuserGroupUpdateineventbarselecteventTab;
	
	}
	
	public String getSearchEventnameUserGroupDeleteMemberEventBar() {
		return searcheventnameuserGroupMemberdeleteineventbarselecteventTab;
	
	}
	
	public String getSearchEventnameUserAuthProfileUpdateEventBar() {
		return searcheventnameuserAuthProfileUpdateineventbarselecteventTab;
	
	}
	
	public String getSearchEventnameUserAuthProfileDeleteEventBar() {
		return searcheventnameuserAuthProfileDelteineventbarselecteventTab;
	
	}
	
	public String getSearchEventnameUserProfileEnableDisableEventBar() {
		return searcheventnameuserProfileEnableDisable;
	
	}
	
	public String getSearchEventnameUserLogoutEventBar() {
		return searcheventnameuserLogoutineventbarselecteventTab;
	
	}
	
	public String getSearchEventnameUsersetPswrdLinkCreateEventBar() {
		return searcheventnameusersetPswrdlinkCreateineventbarselecteventTab;
	
	}
	
	public String getSearchEventnameUserResetPswrdEventBar() {
		return searcheventnameuserResetPswrdineventbarselecteventTab;
	}
	
	public String getSearchEventnameUserTokenRefreshEventBar() {
		return searcheventnameuserTokenRefereshineventbarselecteventTab;
	}
	
	/*
	 * This method returns page object instance
	 */
	public static <TPage> TPage getPageInstance(Class<TPage> pageClass) {
		return PageFactory.initElements(driver, pageClass);
	}
}
