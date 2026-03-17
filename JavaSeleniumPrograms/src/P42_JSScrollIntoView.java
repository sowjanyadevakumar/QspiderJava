import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P42_JSScrollIntoView {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://the-internet.herokuapp.com/large");
        Thread.sleep(2000);

        WebElement lastRow = driver.findElement(By.id("large-table"));
        java.util.List<WebElement> rows = lastRow.findElements(By.tagName("tr"));
        WebElement targetRow = rows.get(rows.size() - 1);

        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", targetRow);
        Thread.sleep(1500);
        System.out.println("Scrolled to last row: "
                + targetRow.getText().substring(0, Math.min(50, targetRow.getText().length())));

        js.executeScript(
                "arguments[0].style.border='3px solid red';" +
                        "arguments[0].style.backgroundColor='#ffffcc';",
                targetRow);
        System.out.println("Last row highlighted");
        Thread.sleep(1000);

        WebElement heading = driver.findElement(By.tagName("h3"));
        js.executeScript("arguments[0].scrollIntoView(true);", heading);
        Thread.sleep(1000);

        js.executeScript(
                "arguments[0].style.border='3px solid blue';" +
                        "arguments[0].style.fontSize='28px';",
                heading);
        System.out.println("Heading highlighted: " + heading.getText());

        Long scrollY = (Long) js.executeScript("return window.pageYOffset;");
        System.out.println("Current scroll position: " + scrollY);

        driver.quit();
    }
}
