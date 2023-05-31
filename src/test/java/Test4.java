import org.testng.Assert;
import static org.testng.AssertJUnit.assertEquals;


public class Test4 extends CommonFunction{
    public static void Test() {

     try{
        loginPage page = new loginPage(driver());
                //Assert that the first button is enabled
                Boolean button1_enabled = page.Button1_test4.isEnabled();
                assertEquals(true, button1_enabled.booleanValue());

                //Assert that the second button is disabled
                Boolean button2_disabled = page.Button2_test4.isEnabled();
                assertEquals(false, button2_disabled.booleanValue());
        }
        catch(Exception e) {
            Assert.fail("Exception: " + e);
        }
    }

    }



