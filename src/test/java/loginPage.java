import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class loginPage {
        public loginPage(WebDriver driver) {
                try{
                        this.driver = driver;
                        PageFactory.initElements(driver, this);
                }
                catch(Exception e) {
                        e.printStackTrace();
                }
        }
        WebDriver driver;
        @FindBy(id = "inputEmail")
        public WebElement emailInput;

        @FindBy(id = "inputPassword")
        public WebElement pwdInput;

        @FindBy(xpath = "//button[text()='Sign in']")
        public WebElement loginButton;

        @FindAll(@FindBy(xpath = "//*[@id='test-2-div']/ul/li"))
        public List<WebElement> list_group;

        @FindBy(xpath = "//*[@id='test-2-div']/ul/li[2]")
        public WebElement txt_list_Item2;

        @FindBy(xpath = "//*[@id='test-2-div']/ul/li[2]/span")
        public WebElement txt_listItem2_Badge;

        @FindBy(xpath = "//*[@id='dropdownMenuButton']")
        public WebElement default_option;

        @FindAll(@FindBy(xpath = "//*[@id='test-3-div']/div/div/a"))
        public List<WebElement> list_options_test3;

        @FindBy(xpath = "//*[@id='test-4-div']/button[1]")
        public WebElement Button1_test4;

        @FindBy(xpath = "//*[@id=\"test-4-div\"]/button[2]")
        public WebElement Button2_test4;

        @FindBy(xpath = "//*[@id='test5-button']")
        public WebElement Button_test5;

        @FindBy(xpath = "//*[@id='test5-alert']")
        public WebElement success_message;

        @FindBy(xpath = "//*[@id='test-6-div']/div/table/tbody/tr/td")
        public WebElement cell;
        public void select_option(String option) {
                try {
                        default_option.click();
                        for (int i = 0; i < list_options_test3.size(); i++) {
                                if (list_options_test3.get(i).getText().contains(option)) {
                                        list_options_test3.get(i).click();
                                        break;}}
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}

