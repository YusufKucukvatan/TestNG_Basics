package Tests3;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day12 {
    @Parameters({"URL","username","password"})
    @Test
    public void webLoginCarLoan(String urlName, String username, String password) {
        System.out.println("Car web-12");
        System.out.println(urlName);
        System.out.println("Use "+username+" as username in this test case.");
        System.out.println("Use "+password+" as password in this test case.");
    }
    @Test
    public void mobileLoginCarLoan(){
        System.out.println("Car mobile-12");

    }
    @Test
    public void APILoginCarLoan(){
        System.out.println("Car API-12");
        Assert.assertTrue(false);
    }
}
