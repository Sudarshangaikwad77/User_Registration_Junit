package com.bl.Junit_Testing;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class InvalidUserException extends Exception{
    public InvalidUserException(String message){
        super(message);
    }
}
public class  UserRegistration {

    public boolean getFirstName(String first) throws InvalidUserException{

        String firstRegex = "^[A-Z]{1}+[a-z]{3,}";
        Pattern patternobj = Pattern.compile(firstRegex);
        Matcher matchobj = patternobj.matcher(first);
        boolean result = matchobj.matches();

        if (!result){
            throw new InvalidUserException("Invalid FirstName!");
        }
        return result;
    }

    public boolean getLastName(String last) throws InvalidUserException{
        String lastRegex = "[A-Z]{1}+[a-z]{3,}";
        Pattern patternobj1 = Pattern.compile(lastRegex);
        Matcher matcher1 = patternobj1.matcher(last);
        boolean result = matcher1.matches();

        if (!result){
            throw new InvalidUserException("Invalid LastName");
        }
        return result;
    }

    public boolean getEmail(String Email) throws InvalidUserException{
        String email = "^[a-z]+([.][a-z]+)*@[a-z]+.[a-z]{2,3}([.][a-z]{2,3})*$";
        Pattern patobj = Pattern.compile(email);
        Matcher match2 = patobj.matcher(Email);
        boolean result = match2.matches();
        if (!result){
            throw new InvalidUserException("Invalid Email");
        }

        return result;
    }

    public boolean getMobile(String Number) throws InvalidUserException{
        String mobile = "^[0-9]{2,3} +[0-9]{10}";
        Pattern patobj2 = Pattern.compile(mobile);
        Matcher match3 = patobj2.matcher(Number);
        boolean result = match3.matches();

        if (!result){
            throw new InvalidUserException("Invalid Number");
        }
        return result;
    }

    public boolean getPasswd(String Passwd) throws InvalidUserException{
        String password = "^(?=.*[A-Z])(?=.*[a-z][0-9])(?=.*[@#$%^&+=!]).{8,}$";
        Pattern patobj3 = Pattern.compile(password);
        Matcher matcher = patobj3.matcher(Passwd);
        boolean result = matcher.matches();

        if (!result){
            throw new InvalidUserException("Invalid Password Input!");
        }
        return result;
    }
}