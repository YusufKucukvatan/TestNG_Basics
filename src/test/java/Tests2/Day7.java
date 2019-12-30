package Tests2;

import org.testng.annotations.Test;

public class Day7 {
    @Test
    public void webLoginPersonalLoan() {

        System.out.println("Personal web-7");
    }
    @Test(dependsOnMethods = {"mobileLoginPersonalLoan3"})
    public void mobileLoginPersonalLoan1(){
        System.out.println("Personal mobile-7.1");
    }@Test
    public void mobileLoginPersonalLoan2(){
        System.out.println("Personal mobile-7.2");
    }@Test
    public void mobileLoginPersonalLoan3(){
        System.out.println("Personal mobile-7.3");
    }
    @Test(groups = {"Smoke"})
    public void APILoginPersonalLoan(){
        System.out.println("Personal API-7+Smoke");
    }
}
