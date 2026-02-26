import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class P22_RelativeLocatorProgram {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        WebElement ref = driver.findElement(By.xpath("//input[@type='submit']"));

        driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(ref)).sendKeys("mobile");
    }

}
