package Tests4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    WebDriver driver=null;
    @BeforeClass
    public void logIn() throws IOException {
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("//Users//yusufkucukvatan//IdeaProjects//TestNG//src//test//java//Tests4//dataDriven.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
        System.out.println(prop.getProperty("url"));


    }
    @Test
    public void webLoginCarLoan() throws IOException {
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("//Users//yusufkucukvatan//IdeaProjects//TestNG//src//test//java//Tests4//dataDriven.properties");
        prop.load(fis);
        System.out.println("Car web");
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
        System.out.println(prop.getProperty("url"));

        if (prop.getProperty("browser").contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(prop.getProperty("browser").contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            WebDriverManager.iedriver();
            driver = new SafariDriver();
        }
        driver.get(prop.getProperty("url"));

    }
    @Test
    public void mobileLoginCarLoan(){
        System.out.println("Car mobile");

    }
    @Test
    public void APILoginCarLoan(){

        System.out.println("Car API");
    }
}
