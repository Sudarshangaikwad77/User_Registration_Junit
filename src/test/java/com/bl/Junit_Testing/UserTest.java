package com.bl.Junit_Testing;
import org.junit.jupiter.api.*;
public class UserTest
{
   UserRegistration firstName = new UserRegistration();

    @BeforeAll
    static void beforeall(){
        System.out.println("Running Test Cases");
    }

    @BeforeEach
    void beforeEach(){

        System.out.println("Running..........");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Test Cases Running Successfully!");
    }

    @Test
    public void  checking_First() throws InvalidUserException{
        boolean result = firstName.getFirstName("Sudarshan");
        if (!result){
            throw new InvalidUserException("Invalid FirstName");
        }
    }

    @Test
    public void checking_Last() throws InvalidUserException{
       UserRegistration lastName = new UserRegistration();
        boolean result = lastName.getLastName("Gaikwad");
        if (!result){
            throw new InvalidUserException("Invalid Lastname!");
        }
    }


    @Test
    public  void  checking_Email() throws  InvalidUserException {
       UserRegistration email = new UserRegistration();
        boolean result = email.getEmail("abc.xyz@bl.co.in");
        if (!result) throw new InvalidUserException("Invalid Email");
    }

    @Test
    public void checking_PhoneNum() throws InvalidUserException {
        UserRegistration mobile = new UserRegistration();
        boolean result = mobile.getMobile("91 9865678765");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_Password() throws InvalidUserException{
        UserRegistration passwd = new UserRegistration();
        boolean result = passwd.getPasswd("Sudarshan123@");
        if (!result){
            throw new InvalidUserException("Invalid Password");
        }
    }


}
