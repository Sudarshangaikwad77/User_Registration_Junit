package com.bl.Junit_Testing;
import org.junit.jupiter.api.*;
public class UserTest
{
   UserRegistration test = new UserRegistration();

   @BeforeAll
    static void beforAll()
   {
       System.out.println("runningg befor all method");
   }
   @BeforeEach
     void beforEach(){
       System.out.println("running beforEach method ");
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
        UserRegistration lastName = new UserRegistration();
        boolean result = lastName.getLastName("Gaikwad");
        Assertions.assertTrue(result);
    }

}
