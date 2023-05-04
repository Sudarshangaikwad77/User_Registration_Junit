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
    }
