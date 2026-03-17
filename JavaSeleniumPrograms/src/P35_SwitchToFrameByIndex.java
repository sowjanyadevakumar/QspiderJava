import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P35_SwitchToFrameByIndex {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        Thread.sleep(2000);

        driver.switchTo().frame(0);
        System.out.println("Switched to first frame (top)");

        driver.switchTo().frame(0);
        WebElement leftContent = driver.findElement(By.tagName("body"));
        System.out.println("Left frame content: " + leftContent.getText());

        driver.switchTo().parentFrame();

        driver.switchTo().frame(1);
        WebElement middleContent = driver.findElement(By.id("content"));
        System.out.println("Middle frame content: " + middleContent.getText());

        driver.switchTo().parentFrame();

        driver.switchTo().frame(2);
        WebElement rightContent = driver.findElement(By.tagName("body"));
        System.out.println("Right frame content: " + rightContent.getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement bottomContent = driver.findElement(By.tagName("body"));
        System.out.println("Bottom frame content: " + bottomContent.getText());

        driver.switchTo().defaultContent();
        System.out.println("Back to main page: " + driver.getTitle());

        driver.quit();
    }
}
