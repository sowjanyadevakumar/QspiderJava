import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P46_FileUpload {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);

        File tempFile = File.createTempFile("selenium_upload_test", ".txt");
        tempFile.deleteOnExit();
        java.nio.file.Files.writeString(tempFile.toPath(), "Selenium file upload test content");

        WebElement uploadInput = driver.findElement(By.id("file-upload"));
        uploadInput.sendKeys(tempFile.getAbsolutePath());
        System.out.println("File path set: " + tempFile.getAbsolutePath());

        Thread.sleep(1000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(2000);

        WebElement result = driver.findElement(By.cssSelector("h3"));
        System.out.println("Upload result: " + result.getText());

        WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
        System.out.println("Uploaded file name: " + uploadedFile.getText());

        driver.quit();
    }
}
