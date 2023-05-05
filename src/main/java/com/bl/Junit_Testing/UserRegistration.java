package com.bl.Junit_Testing;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration
{
    //Adding in UC-1
    public boolean getFirstName(String first){

            String firstRegex = "^[A-Z]{1}+[a-z]{3,}";
            Pattern patternobj = Pattern.compile(firstRegex);

            Matcher matchobj = patternobj.matcher(first);

            boolean result = matchobj.matches();

            return result;
        }

    public boolean getLastName(String last) {

        String lastRegex = "[A-Z]{1}+[a-z]{3,}";
        Pattern patternobj1 = Pattern.compile(lastRegex);

        Matcher matcher1 = patternobj1.matcher(last);
        boolean result = matcher1.matches();

        return result;
    }
    public boolean getEmail(String Email){
        String email = "^[a-z]+([.][a-z]+)*@[a-z]+.[a-z]{2,3}([.][a-z]{2,3})*$";
        Pattern patobj = Pattern.compile(email);

        Matcher match2 = patobj.matcher(Email);
        boolean result = match2.matches();

        return result;
    }
    public boolean getMobile(String Number){
        String mobile = "^[0-9]{2,3} +[0-9]{10}";
        Pattern mob_num = Pattern.compile(mobile);

        Matcher match3 = mob_num.matcher(Number);
        boolean result = match3.matches();

        return result;
    }
    public boolean getPasswd(String Passwd){
        String password = "^[a-z]{8,}$";
        Pattern pass= Pattern.compile(password);

        Matcher matcher = pass.matcher(Passwd);
        boolean result = matcher.matches();

        return result;
    }
}

