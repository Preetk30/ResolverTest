import org.testng.Assert;
public class Test3 extends CommonFunction {
    public static void Test() {
     try{
        loginPage page = new loginPage(driver());

        //Assert that "Option 1" is the default selected value
        Assert.assertEquals(page.default_option.getText(), "Option 1");

        //Select "Option 3" from the select list
        page.select_option("Option 3");

        }
        catch(Exception e) {
            Assert.fail("Exception: " + e);
        }
    }
    }
