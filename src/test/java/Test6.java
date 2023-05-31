import org.openqa.selenium.By;
import org.testng.Assert;

public class Test6 extends CommonFunction {

    public static void Test() {
        try {

            //Method to find the value of the cell at coordinates 2, 2 (staring at 0 in the top left corner)
            String value = getCellValue(2, 2);
            //Assert that the value of the cell is "Ventosanzap"
            Assert.assertEquals(value, "Ventosanzap");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Method that allows you to find the value of any cell on the grid
    public static String getCellValue(int row, int column) {
        String value="";
        try {
            row = row + 1;
            column = column + 1;
            if(row>3 || column >3){
                System.out.println("These cells do not exist in the table");
                throw new IllegalArgumentException();
            }else {
                String xpath = ".//table[@class='table table-bordered table-dark']/tbody/tr[" + row + "]/td[" + column + "]";
                value = driver().findElement(By.xpath(xpath)).getText();
            }
        }
        catch (Exception e) {
            Assert.fail("Exception: " + e);
        }
        return value;
    }
}

