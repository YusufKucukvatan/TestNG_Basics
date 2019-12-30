package Tests;

import org.testng.annotations.*;

public class Day2 {
    @Parameters({"URL", "Username", "Password"})
    @Test(priority = 3)
    public void webLoginHomeLoan(String urlName, String userName, String password) {
        System.out.println("Home web-2");
        System.out.println(urlName);
        System.out.println("Use "+userName+" as username in this test case.");
        System.out.println("Use "+password+" as password in this test case.");
    }
    @Parameters({"URL"})
    @Test(priority = 2)
    public void mobileLoginHomeLoan(String urlName){
        System.out.println("Home mobile-2");
        System.out.println(urlName);
    }
    @Parameters({"URL"})
    @Test(groups = {"Smoke"})
    public void APILoginHomeLoan(String urlName){
        System.out.println("Home API-2 + Smoke");
        System.out.println(urlName);
    }
    @BeforeSuite
    public void preConditionSuite(){
        System.out.println("Day-2 Precondition for Suite");
    }
    @BeforeTest
    public void preConditionTest(){
        System.out.println("Day-2 Precondition for Test");
    }
    @BeforeClass
    public void preConditionClass(){
        System.out.println("Day-2 Precondition for Class Day-2");
    }
    @BeforeMethod
    public void preConditionMethod(){
        System.out.println("Day-2 Precondition for Method Day-2");
    } @AfterSuite
    public void postConditionSuite(){
        System.out.println("Day-2 Post condition for Suite");
    }
    @AfterTest
    public void postConditionTest(){
        System.out.println("Day-2 Post condition for Test");
        //Mostly used for:
        // -Deleting cookies
        // -Close connection for API
        // -Close service calls for API
    }
    @AfterClass
    public void postConditionClass(){
        System.out.println("Day-2 Post condition for Class Day-2");
    }
    @AfterMethod
    public void postConditionMethod(){
        System.out.println("Day-2 Post condition for Method Day-2");
    }

}
