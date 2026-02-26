import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class P14_CookieHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
        System.out.println("=== Cookie Handling on Flipkart ===");

        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Number of cookies: " + cookies.size());
        System.out.println("\n--- Existing Cookies ---");
        for (Cookie cookie : cookies) {
            System.out.println("Name: " + cookie.getName() + " | Value: " + cookie.getValue()
                    + " | Domain: " + cookie.getDomain());
        }

        Cookie myCookie = new Cookie("user_pref", "dark_mode");
        driver.manage().addCookie(myCookie);
        System.out.println("\nAdded cookie: user_pref = dark_mode");

        Cookie fetched = driver.manage().getCookieNamed("user_pref");
        System.out.println("Fetched cookie: " + fetched.getName() + " = " + fetched.getValue());

        driver.manage().deleteCookieNamed("user_pref");
        System.out.println("\nDeleted cookie: user_pref");
        System.out.println("Cookies after delete: "
                + (driver.manage().getCookieNamed("user_pref") == null ? "not found" : "still exists"));

        driver.manage().deleteAllCookies();
        System.out.println("All cookies deleted. Count: " + driver.manage().getCookies().size());

        driver.quit();
        System.out.println("Browser closed.");
    }
}
