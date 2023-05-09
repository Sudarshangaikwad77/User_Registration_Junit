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
    public void  checking_First(){
        boolean result = firstName.getFirstName("Sudarshan");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_Last(){
     UserRegistration lastName = new UserRegistration();
        boolean result = lastName.getLastName("Gaikwad");
        Assertions.assertTrue(result);
    }


    @Test
    public  void  checking_Email(){
        UserRegistration email = new UserRegistration();
        boolean result = email.getEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_PhoneNum(){
        UserRegistration mobile = new UserRegistration();
        boolean result = mobile.getMobile("91 9308622248");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_Password(){
        UserRegistration passwd = new UserRegistration();
        boolean result = passwd.getPasswd("Sudarshan123@");
        Assertions.assertTrue(result);
    }


}
