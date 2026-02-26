import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_AlertHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.google.com");
        System.out.println("=== Alert Handling ===");

        System.out.println("\n--- Simple Alert ---");
        js.executeScript("alert('Welcome to Flipkart! Please log in.');");
        Thread.sleep(1000);
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Alert text: " + simpleAlert.getText());
        simpleAlert.accept();
        System.out.println("Alert accepted (OK clicked)");

        System.out.println("\n--- Confirm Alert ---");
        js.executeScript("confirm('Do you want to add this item to cart on Amazon?');");
        Thread.sleep(1000);
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirm text: " + confirmAlert.getText());
        confirmAlert.accept();
        System.out.println("Confirm accepted (OK)");

        js.executeScript("confirm('Do you want to proceed with IRCTC booking?');");
        Thread.sleep(1000);
        Alert confirmAlert2 = driver.switchTo().alert();
        confirmAlert2.dismiss();
        System.out.println("Confirm dismissed (Cancel)");

        System.out.println("\n--- Prompt Alert ---");
        js.executeScript("prompt('Enter your IRCTC username:');");
        Thread.sleep(1000);
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt text: " + promptAlert.getText());
        promptAlert.sendKeys("testuser123");
        System.out.println("Typed in prompt: testuser123");
        promptAlert.accept();
        System.out.println("Prompt accepted.");

        driver.quit();
    }
}
