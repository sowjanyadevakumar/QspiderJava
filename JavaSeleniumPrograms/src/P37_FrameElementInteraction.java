import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P37_FrameElementInteraction {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");
        Thread.sleep(2000);

        WebElement iframeElement = driver.findElement(By.tagName("iframe"));
        System.out.println("iFrame id: " + iframeElement.getAttribute("id"));
        System.out.println("iFrame width: " + iframeElement.getAttribute("width"));

        driver.switchTo().frame(iframeElement);

        WebElement body = driver.findElement(By.id("tinymce"));
        System.out.println("Before clear: " + body.getText());

        body.clear();

        String[] lines = {
                "Line 1: Selenium Frame Test",
                "Line 2: Switched using WebElement",
                "Line 3: Interacting inside iframe"
        };

        StringBuilder content = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            if (i > 0)
                content.append("\n");
            content.append(lines[i]);
        }
        body.sendKeys(content.toString());

        System.out.println("After typing: " + body.getText());

        driver.switchTo().defaultContent();

        WebElement menuBar = driver.findElement(By.className("tox-menubar"));
        java.util.List<WebElement> menuItems = menuBar.findElements(By.tagName("button"));
        System.out.println("\nMenu items found: " + menuItems.size());
        for (WebElement item : menuItems) {
            System.out.println("  Menu: " + item.getText());
        }

        driver.quit();
    }
}
