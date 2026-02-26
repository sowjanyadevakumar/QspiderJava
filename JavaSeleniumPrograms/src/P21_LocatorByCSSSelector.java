import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class P21_LocatorByCSSSelector {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("=== Locator: By.cssSelector() ===");
        System.out.println("CSS Selectors are faster than XPath and more readable");
        System.out.println("Syntax patterns:");
        System.out.println("  #id          -> element with id");
        System.out.println("  .class       -> element with class");
        System.out.println("  tag          -> element by tag");
        System.out.println("  tag#id       -> tag with id");
        System.out.println("  tag.class    -> tag with class");
        System.out.println("  [attr='val'] -> element with attribute value");
        System.out.println("  tag[attr]    -> tag with attribute present");
        System.out.println();

        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        System.out.println("--- Facebook: CSS Selectors ---");

        WebElement emailInput = driver.findElement(By.cssSelector("#email"));
        emailInput.sendKeys("testuser@gmail.com");
        System.out.println("Email by '#email': entered value");

        WebElement passInput = driver.findElement(By.cssSelector("input#pass"));
        passInput.sendKeys("Pass@123");
        System.out.println("Password by 'input#pass': entered value");

        WebElement loginBtn = driver.findElement(By.cssSelector("button[name='login']"));
        System.out.println("Login button by \"button[name='login']\": " + loginBtn.getText());

        emailInput.clear();
        passInput.clear();

        driver.get("https://www.instagram.com");
        Thread.sleep(2000);
        System.out.println("\n--- Instagram: CSS Selectors ---");

        try {
            WebElement igEmail = driver.findElement(By.cssSelector("input[name='username']"));
            igEmail.sendKeys("test_ig_user");
            System.out.println("Instagram username by \"input[name='username']\": entered value");
            igEmail.clear();

            WebElement igPass = driver.findElement(By.cssSelector("input[name='password']"));
            igPass.sendKeys("Pass@123");
            System.out.println("Instagram password by \"input[name='password']\": entered value");
            igPass.clear();
        } catch (Exception e) {
            System.out.println("Instagram CSS note: " + e.getClass().getSimpleName());
        }

        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        System.out.println("\n--- Amazon: CSS Selectors ---");

        try {
            WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
            searchBox.sendKeys("OnePlus mobile");
            System.out.println("Amazon search by 'input#twotabsearchtextbox': typed 'OnePlus mobile'");
            Thread.sleep(800);
            searchBox.clear();
        } catch (Exception e) {
            System.out.println("Amazon search CSS note: " + e.getClass().getSimpleName());
        }

        try {
            List<WebElement> allNavLinks = driver.findElements(By.cssSelector("a[class*='nav']"));
            System.out.println("Nav links (class contains 'nav'): " + allNavLinks.size() + " found");
        } catch (Exception e) {
            System.out.println("Amazon nav CSS note: " + e.getClass().getSimpleName());
        }

        driver.quit();
        System.out.println("\nBrowser closed.");
    }
}
