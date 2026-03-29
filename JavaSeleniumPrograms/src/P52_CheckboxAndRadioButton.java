import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P52_CheckboxAndRadioButton {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(2000);

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println("Total checkboxes: " + checkboxes.size());

        for (int i = 0; i < checkboxes.size(); i++) {
            System.out.println("Checkbox " + (i + 1) + " initial state: " + checkboxes.get(i).isSelected());
        }

        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
                System.out.println("Checked a checkbox");
            }
        }
        Thread.sleep(500);

        checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (int i = 0; i < checkboxes.size(); i++) {
            System.out.println("Checkbox " + (i + 1) + " after ensuring checked: " + checkboxes.get(i).isSelected());
        }

        checkboxes.get(0).click();
        System.out.println("\nUnchecked checkbox 1. New state: " + checkboxes.get(0).isSelected());

        driver.get("https://demoqa.com/radio-button");
        Thread.sleep(2000);

        String[] radios = {"yesRadio", "impressiveRadio"};
        String[] labels = {"Yes", "Impressive"};

        for (int i = 0; i < radios.length; i++) {
            WebElement radio = driver.findElement(By.id(radios[i]));
            System.out.println("\nRadio '" + labels[i] + "' enabled: " + radio.isEnabled());
            if (radio.isEnabled()) {
                radio.click();
                Thread.sleep(500);
                WebElement successText = driver.findElement(By.cssSelector(".mt-3 span"));
                System.out.println("Selected: " + successText.getText());
            }
        }

        WebElement noRadio = driver.findElement(By.id("noRadio"));
        System.out.println("\n'No' radio enabled: " + noRadio.isEnabled());

        driver.quit();
    }
}
