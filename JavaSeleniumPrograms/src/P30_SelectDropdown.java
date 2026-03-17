import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P30_SelectDropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);

        System.out.println("Default selected: " + select.getFirstSelectedOption().getText());

        select.selectByVisibleText("Option 1");
        System.out.println("Selected by text: " + select.getFirstSelectedOption().getText());
        Thread.sleep(1000);

        select.selectByValue("2");
        System.out.println("Selected by value: " + select.getFirstSelectedOption().getText());
        Thread.sleep(1000);

        select.selectByIndex(1);
        System.out.println("Selected by index: " + select.getFirstSelectedOption().getText());

        System.out.println("Is multiple: " + select.isMultiple());

        System.out.println("All options:");
        for (WebElement option : select.getOptions()) {
            System.out.println("  - " + option.getText() + " (value=" + option.getAttribute("value") + ")");
        }

        driver.quit();
    }
}
