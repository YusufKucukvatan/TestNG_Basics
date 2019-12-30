package Tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day3 {
    @Ignore
    @Test(enabled = false)
    public void webLoginPersonalLoan() {
        System.out.println("Personal web-3");
    }
    @Test(timeOut = 20_000)
    public void mobileLoginPersonalLoan1(){
        System.out.println("Personal mobile-3.1");
    }@Test(enabled = false)
    public void mobileLoginPersonalLoan2(){
        System.out.println("Personal mobile-3.2");
    }@Test
    public void mobileLoginPersonalLoan3(){
        System.out.println("Personal mobile-3.3");
    }

    @Test(groups = {"Smoke"})
    public void APILoginPersonalLoan(){
        System.out.println("Personal API-3+Smoke");
    }
}
