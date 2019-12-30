package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Day1 {
    @Parameters({"URL", "Username", "Password"})
    @Test(groups = {"Smoke", "Regression"})
    public void webLoginCarLoan(String urlName, String userName, String password) {
        System.out.println("Car web-1 + Smoke");
        System.out.println(urlName); //==> Normally we should use with driver.get("urlName") to call web site.
        // We use to show how @Parameter annotation works and brings the URL from xml file.
        System.out.println("Use "+userName+" as username in this test case.");
        System.out.println("Use "+password+" as password in this test case.");
    }
    @Test(priority = 1)
    public void mobileLoginCarLoan(){

        System.out.println("Car mobile-1");
    }
    @Test(dependsOnMethods = "mobileLoginCarLoan")
    public void APILoginCarLoan(){

        System.out.println("Car API-1");
    }

}
