package Tests2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day5 {
    @Test @Parameters({"URL"})
    public void webLoginCarLoan(String urlName) {
        System.out.println("Car web-5");
        System.out.println(urlName);
    }
    @Test(groups = {"Smoke"})
    public void mobileLoginCarLoan(){

        System.out.println("Car mobile-5+Smoke");
    }
    @Test(enabled = false)
    public void APILoginCarLoan(){

        System.out.println("Car API-5");
    }
}
