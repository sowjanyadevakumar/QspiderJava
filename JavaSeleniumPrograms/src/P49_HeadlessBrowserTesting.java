import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class P49_HeadlessBrowserTesting {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- Headless Chrome ---");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");

        WebDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://the-internet.herokuapp.com/");

        System.out.println("Chrome Title: " + chromeDriver.getTitle());
        System.out.println("Chrome URL: " + chromeDriver.getCurrentUrl());

        WebElement heading = chromeDriver.findElement(By.tagName("h1"));
        System.out.println("Heading Text: " + heading.getText());

        java.util.List<WebElement> links = chromeDriver.findElements(By.cssSelector("ul li a"));
        System.out.println("Total links found (headless): " + links.size());

        chromeDriver.quit();
        System.out.println("Headless Chrome test complete.");

        System.out.println("\n--- Headless Firefox ---");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("-headless");

        WebDriver firefoxDriver = new FirefoxDriver(firefoxOptions);
        firefoxDriver.get("https://the-internet.herokuapp.com/login");

        System.out.println("Firefox Title: " + firefoxDriver.getTitle());
        firefoxDriver.findElement(By.id("username")).sendKeys("tomsmith");
        firefoxDriver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        firefoxDriver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(1500);

        WebElement flash = firefoxDriver.findElement(By.id("flash"));
        System.out.println("Login message (headless Firefox): " + flash.getText().trim());

        firefoxDriver.quit();
        System.out.println("Headless Firefox test complete.");
    }
}
