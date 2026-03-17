import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P43_JSClickHiddenElement {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        Thread.sleep(2000);

        WebElement startBtn = driver.findElement(By.cssSelector("#start button"));
        js.executeScript("arguments[0].click();", startBtn);
        System.out.println("Clicked start button via JS");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement result = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));
        System.out.println("Result: " + result.getText());

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(1000);

        java.util.List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (WebElement cb : checkboxes) {
            System.out.println("Before JS click - checked: " + cb.isSelected());
            js.executeScript("arguments[0].click();", cb);
        }
        Thread.sleep(500);

        checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (WebElement cb : checkboxes) {
            System.out.println("After JS click - checked: " + cb.isSelected());
        }

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(1000);

        WebElement addBtn = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        for (int i = 0; i < 5; i++) {
            js.executeScript("arguments[0].click();", addBtn);
        }
        Thread.sleep(500);

        java.util.List<WebElement> deleteButtons = driver.findElements(By.className("added-manually"));
        System.out.println("Added " + deleteButtons.size() + " elements via JS click");

        driver.quit();
    }
}
