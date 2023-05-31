import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import static org.testng.AssertJUnit.assertEquals;
public class Test5 extends CommonFunction {
    public static void Test() {
      try{
        loginPage page = new loginPage(driver());
        //Wait for a button to be displayed (note: the delay is random) and then click it
        WebDriverWait wait = new WebDriverWait(driver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page.Button_test5)).click();

        //Once you've clicked the button, assert that a success message is displayed
        Boolean verifyingSuccessMessage = page.success_message.isDisplayed();
        assertEquals(true, verifyingSuccessMessage.booleanValue());
        Assert.assertEquals(page.success_message.getText(),"You clicked a button!");

        //Assert that the button is now disabled
        Boolean button_disabled = page.Button_test5.isEnabled();
          assertEquals(false, button_disabled.booleanValue());
        }
        catch(Exception e) {
            Assert.fail("Exception: " + e);
        }
     }
    }




