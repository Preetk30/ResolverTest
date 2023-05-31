import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class runner extends CommonFunction {
    @BeforeMethod
    //Navigate to the home page
    public void launchUrl() {
        try {
            threadDriver.set(new ChromeDriver());
            driver().manage().window().maximize();
            //Navigate to Homepage
            driver().get("file://C:/Users/preet/Downloads/QE-index.html");
            Assert.assertEquals(driver().getTitle(),"Home");
        } catch (Throwable t) {
            t.printStackTrace();
            driver().quit();
        }
    }

    @Test
    //Execute Test
    public static void executeTest1() {
        try {
            Test1.Test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void executeTest2() {
            try {
                Test2.Test();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    @Test
    public static void executeTest3() {
        try {
            Test3.Test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public static void executeTest4() {
        try {
            Test4.Test();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    @Test
    public static void executeTest5() {
        try {
            Test5.Test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public static void executeTest6() {
        try {
            Test6.Test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @AfterMethod
    //Close the browser
    public void teardown() {
        try {

            driver().quit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
