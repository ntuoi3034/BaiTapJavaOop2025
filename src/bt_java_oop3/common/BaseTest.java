package bt_java_oop3.common;

public class BaseTest {
    public void createDriver(){
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }
    public void closeDriver(){
        System.out.println("Closed browser: " + Constants.browser);
    }
}
