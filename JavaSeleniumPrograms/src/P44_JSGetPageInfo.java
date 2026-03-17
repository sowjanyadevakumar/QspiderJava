import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P44_JSGetPageInfo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        String title = (String) js.executeScript("return document.title;");
        String url = (String) js.executeScript("return document.URL;");
        String domain = (String) js.executeScript("return document.domain;");
        String readyState = (String) js.executeScript("return document.readyState;");

        System.out.println("=== Page Info via JS ===");
        System.out.println("Title: " + title);
        System.out.println("URL: " + url);
        System.out.println("Domain: " + domain);
        System.out.println("Ready State: " + readyState);

        Long totalLinks = (Long) js.executeScript("return document.querySelectorAll('a').length;");
        Long totalElements = (Long) js.executeScript("return document.querySelectorAll('*').length;");
        System.out.println("\nTotal links: " + totalLinks);
        System.out.println("Total DOM elements: " + totalElements);

        Long pageHeight = (Long) js.executeScript(
                "return Math.max(document.body.scrollHeight, document.documentElement.scrollHeight);");
        Long viewportHeight = (Long) js.executeScript("return window.innerHeight;");
        Long viewportWidth = (Long) js.executeScript("return window.innerWidth;");
        System.out.println("\nPage height: " + pageHeight + "px");
        System.out.println("Viewport: " + viewportWidth + "x" + viewportHeight);

        String bodyText = (String) js.executeScript(
                "return document.body.innerText.substring(0, 200);");
        System.out.println("\nBody text (first 200 chars):\n" + bodyText);

        driver.get("https://the-internet.herokuapp.com/status_codes");
        Thread.sleep(1000);

        String newTitle = (String) js.executeScript("return document.title;");
        String referrer = (String) js.executeScript("return document.referrer;");
        String characterSet = (String) js.executeScript("return document.characterSet;");
        System.out.println("\n=== Second Page ===");
        System.out.println("Title: " + newTitle);
        System.out.println("Referrer: " + referrer);
        System.out.println("Character Set: " + characterSet);

        driver.quit();
    }
}
