package com.quidco.app.utility;

import java.util.Random;

/**
 * Created by amohindroo on 19/11/16.
 */
public class JavaUtils {

    public static String getTestEmail(){
        Random random = new Random(System.nanoTime());
        int randomInt = random.nextInt(1000000000);
        return  "quidco-tester"+randomInt+"@quidco.com";
    }
}
