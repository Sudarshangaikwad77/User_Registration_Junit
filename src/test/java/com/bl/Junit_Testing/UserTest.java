package com.bl.Junit_Testing;
import org.junit.jupiter.api.*;
public class UserTest {
    @BeforeAll
    static void beforeall() {
        System.out.println("Running Test Cases");
    }

    @BeforeEach
    void beforeEach() {

        System.out.println("Running..........");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test Cases Running Successfully!");
    }

    @Test
    public void checking_First() {
        UserRegistration firstName = new UserRegistration();
        boolean result = firstName.validateFirstName("Sudarshan");
        Assertions.assertTrue(result);
    }


    @Test
    public void checking_Last() {
        UserRegistration lastName = new UserRegistration();
        boolean result = lastName.validateLastName("Gaikwad");
        Assertions.assertTrue(result);
    }


    @Test
    public void checking_Email() {
        UserRegistration email = new UserRegistration();
        boolean result = email.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_PhoneNum() {
        UserRegistration mobile = new UserRegistration();
        boolean result = mobile.validateMobile("91 8308622248");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_Password() {
        UserRegistration passwd = new UserRegistration();
        boolean result = passwd.validatePassword("Sudarshan123@");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_WFirst() {
        UserRegistration firstName = new UserRegistration();
        boolean result = firstName.validateFirstName("sudarshan");
        Assertions.assertTrue(result);
    }
}

