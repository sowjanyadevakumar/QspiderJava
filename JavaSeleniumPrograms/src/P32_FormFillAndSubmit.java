import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P32_FormFillAndSubmit {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);

        driver.findElement(By.id("firstName")).sendKeys("Rahul");
        driver.findElement(By.id("lastName")).sendKeys("Sharma");
        driver.findElement(By.id("userEmail")).sendKeys("rahul.sharma@test.com");

        driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();

        driver.findElement(By.id("userNumber")).sendKeys("9876543210");

        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        subjectsInput.sendKeys("Maths");
        Thread.sleep(500);
        subjectsInput.sendKeys("\n");

        driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
        driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();

        driver.findElement(By.id("currentAddress")).sendKeys("123 MG Road, Bangalore");

        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(500);

        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        try {
            WebElement modal = driver.findElement(By.id("example-modal-sizes-title-lg"));
            System.out.println("Form submitted: " + modal.getText());

            java.util.List<WebElement> rows = driver.findElements(By.cssSelector(".table-responsive tbody tr"));
            for (WebElement row : rows) {
                System.out.println(row.getText());
            }
        } catch (Exception e) {
            System.out.println("Submission modal not found: " + e.getMessage());
        }

        driver.quit();
    }
}
