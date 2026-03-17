import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P40_DoubleClick {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);

        WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));

        Actions actions = new Actions(driver);

        actions.click(addButton).perform();
        Thread.sleep(500);
        actions.click(addButton).perform();
        Thread.sleep(500);
        actions.click(addButton).perform();
        Thread.sleep(500);

        java.util.List<WebElement> deleteButtons = driver.findElements(By.className("added-manually"));
        System.out.println("Elements added: " + deleteButtons.size());

        actions.doubleClick(addButton).perform();
        Thread.sleep(500);

        deleteButtons = driver.findElements(By.className("added-manually"));
        System.out.println("Elements after double-click add: " + deleteButtons.size());

        if (!deleteButtons.isEmpty()) {
            actions.doubleClick(deleteButtons.get(0)).perform();
            Thread.sleep(500);
        }

        deleteButtons = driver.findElements(By.className("added-manually"));
        System.out.println("Elements after double-click delete: " + deleteButtons.size());

        for (WebElement btn : deleteButtons) {
            actions.click(btn).perform();
            Thread.sleep(300);
        }

        deleteButtons = driver.findElements(By.className("added-manually"));
        System.out.println("Final count: " + deleteButtons.size());

        driver.quit();
    }
}
