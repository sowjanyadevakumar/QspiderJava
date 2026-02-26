import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P23_InvalidLoginProgram {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("wrongUser");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("wrongPass123");

        WebElement loginBtn = driver.findElement(By.id("submit"));
        loginBtn.click();

        Thread.sleep(2000);

        try {
            WebElement errorMsg = driver.findElement(By.id("error"));
            if (errorMsg.isDisplayed()) {
                System.out.println("Invalid credentials");
            }
        } catch (Exception e) {
            System.out.println("Error element not found: " + e.getMessage());
        }

        driver.quit();
    }
}
