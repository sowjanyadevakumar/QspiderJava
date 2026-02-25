import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09_WindowManagement {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");
        System.out.println("=== Window Management ===");

        driver.manage().window().maximize();
        System.out.println("Window maximized");
        System.out.println("Size after maximize: " + driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().minimize();
        System.out.println("Window minimized");
        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        System.out.println("Window fullscreen");
        Thread.sleep(1000);

        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
        System.out.println("Window size set to: " + driver.manage().window().getSize());
        Thread.sleep(1000);

        Point position = new Point(100, 100);
        driver.manage().window().setPosition(position);
        System.out.println("Window position set to: " + driver.manage().window().getPosition());
        Thread.sleep(1000);

        System.out.println("Window Handle: " + driver.getWindowHandle());
        System.out.println("All Handles: " + driver.getWindowHandles());

        driver.quit();
        System.out.println("Browser closed.");
    }
}
