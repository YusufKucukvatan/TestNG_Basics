package Tests3;

import org.testng.annotations.*;

public class Day10 {
    @Parameters({"URL", "username", "password"})
    @Test
    public void webLoginHomeLoan(String urlName, String username, String password) {
        System.out.println("Home web-2");
        System.out.println(urlName);
        System.out.println("Use "+username+" as username in this test case.");
        System.out.println("Use "+password+" as password in this test case.");
    }
    @Parameters({"URL","Username","Password"})
    @Test
    public void mobileLoginHomeLoan(String urlName, String user, String pass){
        System.out.println("Home mobile-10");
        System.out.println(urlName);
    }
    @Parameters({"URL"})
    @Test
    public void APILoginHomeLoan(String urlName){
        System.out.println("Home API-10");
        System.out.println(urlName);
    }

}
