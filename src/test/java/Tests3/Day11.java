package Tests3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day11 {
    @Parameters({"URL", "username", "password"})
    @Test
    public void webLoginPersonalLoan(String urlName, String username, String password) {
        System.out.println("Personal web-11");
        System.out.println(urlName);
        System.out.println("Use "+username+" as username in this test case.");
        System.out.println("Use "+password+" as password in this test case.");
    }
    @Test
    public void mobileLoginPersonalLoan1(){
        System.out.println("Personal mobile-11");
    }@Test
    public void mobileLoginPersonalLoan2(){
        System.out.println("Personal mobile-11");
    }@Test
    public void mobileLoginPersonalLoan3(){
        System.out.println("Personal mobile-11");
    }
    @Test(groups = {"Smoke"})
    public void APILoginPersonalLoan(){
        System.out.println("Personal API-11");
    }
}
