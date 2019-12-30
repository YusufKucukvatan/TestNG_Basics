package Tests3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day9 {
    @Parameters({"URL", "username", "password"})
    @Test
    public void webLoginCarLoan(String urlName, String username, String password) {
        System.out.println("Car web-9");
        System.out.println(urlName);
        System.out.println("Use "+username+" as username in this test case.");
        System.out.println("Use "+password+" as password in this test case.");
    }
    @Test(dataProvider = "getData")
    public void mobileLoginCarLoan(String username, String password, String fatih){
        System.out.println("Car mobile-9");
        System.out.println(username);
        System.out.println(password);
        System.out.println(fatih);
    }
    @Test
    public void APILoginCarLoan(){

        System.out.println("Car API-9");
    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data=new Object[3][3];
        data[0][0]="user-1";
        data[0][1]="password-1";
        data[0][2]="fatih-1";
        data[1][0]="user-2";
        data[1][1]="password-2";
        data[1][2]="fatih-2";
        data[2][0]="user-3";
        data[2][1]="password-3";
        data[2][2]="fatih-3";

        return data;
    }

}
