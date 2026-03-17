import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P45_JSModifyDomStyle {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);

        WebElement heading = driver.findElement(By.tagName("h1"));
        System.out.println("Original heading text: " + heading.getText());

        js.executeScript(
                "arguments[0].style.color='#ff5722';" +
                        "arguments[0].style.fontSize='48px';" +
                        "arguments[0].style.textShadow='2px 2px 4px rgba(0,0,0,0.3)';" +
                        "arguments[0].style.fontFamily='Georgia, serif';",
                heading);
        System.out.println("Heading styled via JS");
        Thread.sleep(1000);

        java.util.List<WebElement> links = driver.findElements(By.cssSelector("ul li a"));
        for (int i = 0; i < Math.min(5, links.size()); i++) {
            String color = (i % 2 == 0) ? "#1565c0" : "#e91e63";
            js.executeScript(
                    "arguments[0].style.backgroundColor=arguments[1];" +
                            "arguments[0].style.color='white';" +
                            "arguments[0].style.padding='5px 10px';" +
                            "arguments[0].style.borderRadius='4px';" +
                            "arguments[0].style.display='inline-block';" +
                            "arguments[0].style.marginBottom='4px';",
                    links.get(i), color);
        }
        System.out.println("Styled first 5 links");
        Thread.sleep(1000);

        js.executeScript("arguments[0].setAttribute('data-custom', 'selenium-test');", heading);
        String customAttr = (String) js.executeScript(
                "return arguments[0].getAttribute('data-custom');", heading);
        System.out.println("Custom attribute set: " + customAttr);

        js.executeScript("arguments[0].setAttribute('title', 'Modified by Selenium JS');", heading);
        String titleAttr = (String) js.executeScript(
                "return arguments[0].getAttribute('title');", heading);
        System.out.println("Title attribute: " + titleAttr);

        js.executeScript(
                "var div = document.createElement('div');" +
                        "div.id = 'js-injected';" +
                        "div.style.cssText = 'background:#4caf50; color:white; padding:15px; margin:10px; border-radius:8px; text-align:center; font-size:18px;';"
                        +
                        "div.textContent = 'This element was injected by JavascriptExecutor';" +
                        "document.querySelector('.row').prepend(div);");
        Thread.sleep(1000);

        WebElement injected = driver.findElement(By.id("js-injected"));
        System.out.println("Injected element text: " + injected.getText());
        System.out.println("Injected element displayed: " + injected.isDisplayed());

        driver.quit();
    }
}
