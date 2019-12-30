package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
    @Parameters({"URL"})
    @Test
    public void webLoginCarLoan(String urlName) {
        System.out.println("Car web-4+Smoke");
        System.out.println(urlName);
    }
    @Parameters({"URL"})
    @Test
    public void mobileLoginCarLoan(String urlName){
        System.out.println("Car mobile-4");
        System.out.println(urlName);

    }
    @Test(dependsOnMethods = "mobileLoginCarLoan")
    public void APILoginCarLoan(){
        System.out.println("Car API-4");
    }
}
