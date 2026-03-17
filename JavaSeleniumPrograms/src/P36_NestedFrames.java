import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P36_NestedFrames {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        Thread.sleep(2000);

        driver.switchTo().frame("frame-top");
        System.out.println("Switched to top frame");

        driver.switchTo().frame("frame-left");
        System.out.println("LEFT: " + driver.findElement(By.tagName("body")).getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-middle");
        System.out.println("MIDDLE: " + driver.findElement(By.id("content")).getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-right");
        System.out.println("RIGHT: " + driver.findElement(By.tagName("body")).getText());
        driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");
        System.out.println("BOTTOM: " + driver.findElement(By.tagName("body")).getText());

        driver.switchTo().defaultContent();

        int topFrames = driver.findElements(By.tagName("frame")).size();
        System.out.println("\nTotal top-level frames: " + topFrames);

        driver.switchTo().frame("frame-top");
        int innerFrames = driver.findElements(By.tagName("frame")).size();
        System.out.println("Inner frames in top: " + innerFrames);

        driver.quit();
    }
}
