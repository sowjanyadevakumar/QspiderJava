import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P48_WebTableSearchAndSort {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/tables");
        Thread.sleep(2000);

        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> rows = table.findElements(By.cssSelector("tbody tr"));

        String searchName = "Smith";
        System.out.println("Searching for last name: " + searchName);
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.get(0).getText().equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + cells.get(1).getText() + " " + cells.get(0).getText()
                        + " | Email: " + cells.get(2).getText()
                        + " | Due: " + cells.get(3).getText());
            }
        }

        List<WebElement> lastNameCells = table.findElements(By.cssSelector("tbody tr td:nth-child(1)"));
        List<String> lastNames = new ArrayList<>();
        for (WebElement cell : lastNameCells) {
            lastNames.add(cell.getText());
        }
        System.out.println("\nLast names as displayed: " + lastNames);

        List<String> sortedNames = new ArrayList<>(lastNames);
        Collections.sort(sortedNames);
        System.out.println("Alphabetically sorted: " + sortedNames);

        driver.findElement(By.linkText("Last Name")).click();
        Thread.sleep(1000);

        List<WebElement> sortedCells = table.findElements(By.cssSelector("tbody tr td:nth-child(1)"));
        List<String> afterSort = new ArrayList<>();
        for (WebElement cell : sortedCells) {
            afterSort.add(cell.getText());
        }
        System.out.println("After clicking sort: " + afterSort);
        System.out.println("Is sorted ascending: " + afterSort.equals(sortedNames));

        driver.quit();
    }
}
