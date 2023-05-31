import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunction {

    public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static WebDriver driver(){
        return threadDriver.get();
    }
    public static void enterText (WebElement element, String input){
        try {
            element.sendKeys(input);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    }

