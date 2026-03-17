import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P26_ImplicitWait {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.cssSelector("#start button")).click();

        WebElement result = driver.findElement(By.cssSelector("#finish h4"));
        System.out.println("Loaded text: " + result.getText());

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.cssSelector("#checkbox-example button")).click();

        try {
            WebElement checkbox = driver.findElement(By.cssSelector("#checkbox"));
            System.out.println("Checkbox still present: " + checkbox.isDisplayed());
        } catch (Exception e) {
            System.out.println("Checkbox removed successfully");
        }

        driver.quit();
    }
}
