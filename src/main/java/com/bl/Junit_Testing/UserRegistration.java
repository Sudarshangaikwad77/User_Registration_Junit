package com.bl.Junit_Testing;
import java.util.Scanner;
import java.util.function.Predicate;
class InvalidUserException extends Exception{
    public InvalidUserException(String message){
        super(message);
    }
}
public class  UserRegistration {
    private final Predicate<String> validateFirstName = firstName -> firstName.matches("^[A-Z]{1}+[a-z]{3,}");
    private final Predicate<String> validateLastName = lastName -> lastName.matches("[A-Z]{1}+[a-z]{3,}");
    private final Predicate<String> validateEmail = email -> email.matches("^[a-z]+([.][a-z]+)*@[a-z]+.[a-z]{2,3}([.][a-z]{2,3})*$");
    private final Predicate<String> validateMobile = mobile -> mobile.matches("^[0-9]{2,3} +[0-9]{10}");
    private final Predicate<String> validatePassword = password -> password.matches("^(?=.*[A-Z])(?=.*[a-z][0-9])(?=.*[@#$%^&+=!]).{8,}$");

    public boolean validateInput(String input, Predicate<String> validator) {
        return validator.test(input);
    }

    public boolean validateFirstName(String firstName) {
        return validateInput(firstName, validateFirstName);
    }

    public boolean validateLastName(String lastName) {
        return validateInput(lastName, validateLastName);
    }

    public boolean validateEmail(String email) {
        return validateInput(email, validateEmail);
    }

    public boolean validateMobile(String mobile) {
        return validateInput(mobile, validateMobile);
    }

    public boolean validatePassword(String password) {
        return validateInput(password, validatePassword);
    }

    public static void main(String[] args) {
        UserRegistration validator = new UserRegistration();


        validator.validateFirstName("Sudarshan");
        validator.validateLastName("Gaikwad");
        validator.validateMobile("91 8308622248");
        validator.validateEmail("abc.xyz@bl.co.in");
        validator.validatePassword("Sudarshan123@");
    }


}