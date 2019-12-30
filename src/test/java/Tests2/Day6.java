package Tests2;

import org.testng.annotations.Test;

public class Day6 {
    @Test(groups = {"Smoke"})
    public void webLoginHomeLoan() {
        System.out.println("Home web-6+Smoke");
    }
    @Test(timeOut = 20_000)
    public void mobileLoginHomeLoan(){
        System.out.println("Home mobile-6");
    }
    @Test(dependsOnMethods = {"mobileLoginHomeLoan"})
    public void APILoginHomeLoan(){
        System.out.println("Home API-6");
    }
}
