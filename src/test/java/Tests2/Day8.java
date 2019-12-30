package Tests2;

import org.testng.annotations.*;

public class Day8 {
    @Parameters({"URL", "Username", "Password"})
    @Test
    public void webLoginCarLoan(String urlName, String userName, String password) {
        System.out.println("Car web-8");
        System.out.println(urlName);
        System.out.println("Use "+userName+" as username in this test case.");
        System.out.println("Use "+password+" as password in this test case.");
    }
    @Test(groups = {"Smoke"})
    public void mobileLoginCarLoan(){
        System.out.println("Car mobile-8+Smoke");
    }
    @Test(timeOut = 20_000)
    public void APILoginCarLoan(){
        System.out.println("Car API-8");
    }
    @BeforeSuite
    public void preConditionSuite(){
        System.out.println("Day-8 Precondition for Suite");
    }
    @BeforeTest
    public void preConditionTest(){
        System.out.println("Day-8 Precondition for Test");
    }
    @BeforeClass
    public void preConditionClass(){
        System.out.println("Day-8 Precondition for Class Day-8");
    }
    @BeforeMethod
    public void preConditionMethod(){
        System.out.println("Day-8 Precondition for Method Day-8");
    } @AfterSuite
    public void postConditionSuite(){
        System.out.println("Day-8 Post condition for Suite");
    }
    @AfterTest
    public void postConditionTest(){
        System.out.println("Day-8 Post condition for Test");
    }
    @AfterClass
    public void postConditionClass(){
        System.out.println("Day-8 Post condition for Class Day-8");
    }
    @AfterMethod
    public void postConditionMethod(){
        System.out.println("Day-8 Post condition for Method Day-8");
    }
}
