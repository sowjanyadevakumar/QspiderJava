import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15_LocatorById {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        System.out.println("=== Locator: By.id() on Facebook ===");
        System.out.println("By.id() finds element using the 'id' HTML attribute");
        System.out.println("Fastest and most reliable locator when id is unique");
        System.out.println();

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("testuser@gmail.com");
        System.out.println("Typed in email field (id='email'): testuser@gmail.com");
        Thread.sleep(500);

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("Password@123");
        System.out.println("Typed in password field (id='pass'): Password@123");
        Thread.sleep(500);

        WebElement loginBtn = driver.findElement(By.id("loginbutton"));
        System.out.println("Login button found (id='loginbutton'): " + loginBtn.getTagName());
        System.out.println("Button displayed: " + loginBtn.isDisplayed());
        System.out.println("Button enabled: " + loginBtn.isEnabled());

        emailField.clear();
        passwordField.clear();
        System.out.println("\nFields cleared.");

        driver.quit();
        System.out.println("Browser closed.");
    }
}
