import org.testng.Assert;
import static org.testng.AssertJUnit.assertEquals;


public class Test1 extends CommonFunction {
    public static void Test() {

        try{

                loginPage page = new loginPage(driver());

                //Assert Email Input is present
                Boolean verifyEmailInput = page.emailInput.isDisplayed();
                assertEquals(true, verifyEmailInput.booleanValue());

                //Assert Password Input is present
                Boolean verifyPwdInput = page.pwdInput.isDisplayed();
                assertEquals(true, verifyPwdInput.booleanValue());

                //Assert Login Button is present
                Boolean verifyLoginbutton = page.loginButton.isDisplayed();
                assertEquals(true, verifyLoginbutton.booleanValue());

                //Enter Email Address
                enterText(page.emailInput,"abc@test.com");
                //Enter Password
                enterText(page.pwdInput,"123456");

        }
        catch(Exception e) {
            Assert.fail("Exception: " + e);
        }
        }
    }

