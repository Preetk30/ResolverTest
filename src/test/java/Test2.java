import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class Test2 extends CommonFunction {

    public static void Test() {
      try{

        loginPage page = new loginPage(driver());

        //Assert that there are three values in the listgroup
        Assert.assertEquals(page.list_group.size(),3);

        // Assert that second list item's value is set to "List Item 2"
        JavascriptExecutor js = (JavascriptExecutor) driver();
        String output = (String) js.executeScript("return arguments[0].firstChild.textContent", page.txt_list_Item2);
        Assert.assertEquals(output.trim(),"List Item 2");

        //Assert that the second list item's badge value is 6
        Assert.assertEquals(Integer.parseInt(page.txt_listItem2_Badge.getText()),6);
        }
        catch(Exception e) {
            Assert.fail("Exception: " + e);
        }
    }
    }

