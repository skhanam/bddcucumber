package com.quidco.app.utility;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by amohindroo on 19/11/16.
 */
public class JavaUtils {

    public static String getTestEmail() {
        Random random = new Random(System.nanoTime());
        int randomInt = random.nextInt(1000000000);
        return "quidco-tester" + randomInt + "@quidco.com";
    }

    public static String getSubstringWithPattern(String pattern, String line) throws Exception {
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if(m.groupCount()>1){
            System.out.println("More than one matches found");
            throw new  Exception("More than one matches found");
        }
        m.find();
        return m.group(0);
        }
    }

