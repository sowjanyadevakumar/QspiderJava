import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P34_SwitchToFrameById {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");
        Thread.sleep(2000);

        System.out.println("Page title: " + driver.getTitle());

        driver.switchTo().frame("mce_0_ifr");

        WebElement editor = driver.findElement(By.id("tinymce"));
        System.out.println("Default text: " + editor.getText());

        editor.clear();
        editor.sendKeys("This text was typed inside an iframe using Selenium");

        System.out.println("New text: " + editor.getText());

        driver.switchTo().defaultContent();

        WebElement heading = driver.findElement(By.tagName("h3"));
        System.out.println("Heading outside iframe: " + heading.getText());

        driver.quit();
    }
}
