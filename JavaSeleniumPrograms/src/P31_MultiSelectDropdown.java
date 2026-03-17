import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class P31_MultiSelectDropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://output.jsbin.com/osebed/2");

        WebElement multiSelect = driver.findElement(By.id("fruits"));
        Select select = new Select(multiSelect);

        System.out.println("Is multiple: " + select.isMultiple());

        select.selectByVisibleText("Banana");
        select.selectByVisibleText("Apple");
        select.selectByVisibleText("Orange");

        System.out.println("Selected options:");
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement opt : selectedOptions) {
            System.out.println("  - " + opt.getText());
        }

        select.deselectByVisibleText("Apple");
        System.out.println("\nAfter deselecting Apple:");
        for (WebElement opt : select.getAllSelectedOptions()) {
            System.out.println("  - " + opt.getText());
        }

        select.deselectAll();
        System.out.println("\nAfter deselecting all:");
        System.out.println("Selected count: " + select.getAllSelectedOptions().size());

        select.selectByIndex(0);
        select.selectByIndex(3);
        System.out.println("\nAfter selecting by index 0 and 3:");
        for (WebElement opt : select.getAllSelectedOptions()) {
            System.out.println("  - " + opt.getText());
        }

        driver.quit();
    }
}
