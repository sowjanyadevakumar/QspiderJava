import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P50_KeyboardActions {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/key_presses");
        Thread.sleep(2000);

        WebElement inputField = driver.findElement(By.id("target"));
        Actions actions = new Actions(driver);

        actions.click(inputField).sendKeys("Selenium").perform();
        Thread.sleep(500);
        System.out.println("Typed: Selenium");

        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        Thread.sleep(500);

        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        System.out.println("Selected all and copied text");

        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.sendKeys(Keys.DELETE).perform();
        Thread.sleep(500);
        System.out.println("Cleared input with CTRL+A + DELETE");

        String[] specialKeys = {
                Keys.ENTER.toString(), Keys.TAB.toString(),
                Keys.ESCAPE.toString(), Keys.ARROW_UP.toString(), Keys.ARROW_DOWN.toString()
        };
        String[] keyNames = {"ENTER", "TAB", "ESCAPE", "ARROW_UP", "ARROW_DOWN"};

        for (int i = 0; i < specialKeys.length; i++) {
            actions.click(inputField).sendKeys(specialKeys[i]).perform();
            Thread.sleep(600);
            WebElement result = driver.findElement(By.id("result"));
            System.out.println("Key pressed - " + keyNames[i] + ": " + result.getText());
        }

        driver.get("https://the-internet.herokuapp.com/inputs");
        Thread.sleep(1000);
        WebElement numInput = driver.findElement(By.cssSelector("input[type='number']"));
        numInput.click();
        actions.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP).perform();
        Thread.sleep(500);
        System.out.println("\nNumber input after 3 ARROW_UP presses: " + numInput.getAttribute("value"));

        driver.quit();
    }
}
