import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P47_WebTableBasic {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/tables");
        Thread.sleep(2000);

        WebElement table = driver.findElement(By.id("table1"));

        List<WebElement> headers = table.findElements(By.cssSelector("thead th"));
        System.out.println("Table Headers:");
        for (WebElement header : headers) {
            System.out.print(header.getText() + "\t");
        }
        System.out.println();

        List<WebElement> rows = table.findElements(By.cssSelector("tbody tr"));
        System.out.println("Total rows: " + rows.size());

        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            System.out.print("Row " + (i + 1) + ": ");
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t");
            }
            System.out.println();
        }

        System.out.println("\nCell at Row 2, Col 3: " +
                rows.get(1).findElements(By.tagName("td")).get(2).getText());

        driver.quit();
    }
}
