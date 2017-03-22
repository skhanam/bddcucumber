package com.quidco.app.helper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by thadeus on 28/06/16.
 */
public class Constants {

    //chromebinaries
    public static final String chromeWindowsdriver = "/src/test/resources/OS/Windows/Chrome/32/chromedriver.exe";
    public static final String chromeLinuxdriver = "/src/test/resources/OS/Linux/Chrome/32/chromedriver";
    public static final String chromeMacdriver = "/src/test/resources/OS/Mac/Chrome/chromedriver";
    public static final String firefoxWindowsdriver = "/src/test/resources/OS/Windows/Firefox/64/geckodriver.exe";
    public static final String firefoxLinuxdriver = "/src/test/resources/OS/Linux/Firefox/64/geckodriver";
    public static final String firefoxMacdriver = "/src/test/resources/OS/Mac/Firefox/geckodriver";

    public static final String discoverPageURL = "https://www.quidco.com/discover/test-page-101";


    /*  Below are the username and passwords for our tests */
    public static final String NORMAL_USER_EMAIL= "quidco.tester@gmail.com";
    public static final String NORMAL_USER_PWD= "quidcotester@9";
    public static final String PREMIUM_USER_EMAIL= "quidco.tester+premium@gmail.com";
    public static final String PREMIUM_USER_PWD= "quidcotester@01";
    public static final String FACEBOOK_USER_EMAIL= "quidco.tester@gmail.com";
    public static final String FACEBOOK_USER_PWD= "quidcotester@01";
    public static final String PAYPAL_USER_EMAIL= "cannotfind@quidco.com";
    public static final String PAYPAL_USER_PWD= "notused";

    public final static String SIGN_IN_URL = "https://ml.cashbacksrv.com/auth/login?token=true";
    public final static String JOIN_US_URL = "https://ml.cashbacksrv.com/auth/register-user";

    public static final Map<String, Integer> countMap = createMap();

    private static Map<String, Integer> createMap() {
        Map<String, Integer> result = new HashMap<>();
        result.put("first", 1);
        result.put("second", 2);
        result.put("third", 3);
        return Collections.unmodifiableMap(result);
    }
}
