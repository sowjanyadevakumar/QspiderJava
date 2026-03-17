import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P39_RightClickContextMenu {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/context_menu");
        Thread.sleep(2000);

        WebElement hotSpot = driver.findElement(By.id("hot-spot"));
        System.out.println("Target element found: " + hotSpot.isDisplayed());

        Actions actions = new Actions(driver);
        actions.contextClick(hotSpot).perform();
        Thread.sleep(1000);

        try {
            org.openqa.selenium.Alert alert = driver.switchTo().alert();
            System.out.println("Alert text: " + alert.getText());
            alert.accept();
            System.out.println("Alert accepted");
        } catch (Exception e) {
            System.out.println("No alert appeared: " + e.getMessage());
        }

        actions.contextClick(hotSpot).perform();
        Thread.sleep(1000);

        try {
            org.openqa.selenium.Alert alert = driver.switchTo().alert();
            alert.dismiss();
            System.out.println("Alert dismissed on second right-click");
        } catch (Exception e) {
            System.out.println("No alert: " + e.getMessage());
        }

        driver.quit();
    }
}
