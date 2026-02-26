import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P24_TagNameAndCssValue {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.actitime.com/");

        WebElement button = driver.findElement(By.linkText("Try actiTIME for free"));

        // tagname
        System.out.println(button.getTagName());

        // cssvalue
        System.out.println(button.getCssValue("font-family"));
    }
}
