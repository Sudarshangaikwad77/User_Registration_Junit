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
    @Test
    public void checkingNumber(){
        boolean result = test.getMobile("91 8308622248");
        Assertions.assertTrue(result);
    }
    @Test
    public void checkingPassword(){
        boolean result = test.getPasswd("sudarshangaik");
        Assertions.assertTrue(result);
    }
    @Test
    public void checkingPassword1(){
        boolean result = test.getPasswd("Passw0rd!");
        Assertions.assertFalse(result);
    }
    @Test
    public void checkingPassword2(){
        boolean result = test.getPasswd("P@ssw0rd");
        Assertions.assertFalse(result);
    }
    @Test
    public void checkingPassword3(){
        boolean result = test.getPasswd3("Sudarshan123@");
        Assertions.assertTrue(result);
    }

}
