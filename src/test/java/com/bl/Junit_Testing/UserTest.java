package com.bl.Junit_Testing;
import org.junit.jupiter.api.*;
public class UserTest
{
   UserRegistration test = new UserRegistration();

   @BeforeAll
    static void
   beforeAll()
   {
       System.out.println("running before all method");
   }
   @BeforeEach
     void beforeEach(){
       System.out.println("running beforeEach method ");
   }
   @AfterAll
        static   void afterAll(){
       System.out.println("running afterAll method");
   }
   @Test
    public void checkingName(){
       boolean result = test.getFirstName("Sudarshan");
       Assertions.assertTrue(result);
   }

    @Test
    public void checking_Last(){

        boolean result = test.getLastName("Gaikwad");;
        Assertions.assertTrue(result);
    }
    @Test
    public void checkingEmail(){
        boolean result = test.getEmail("xyz.abc@bl.co.in");
        Assertions.assertTrue(result);
    }

}
