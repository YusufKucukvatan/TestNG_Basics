package Tests3;

//ITestListener is an interface which implements TestNG listeners

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Here we gooooo...");

    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting Test Case...");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case is successful...");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //Screenshots
        //Response if aPI is failed
        System.out.println("Oooopppsss. Test Case is failed..."+result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Astalavista...");
    }

}
