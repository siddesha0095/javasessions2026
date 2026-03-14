package networkInterception;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumNetworkInterception {
    public static void main(String[] args) {

        WebDriver wd = new ChromeDriver();
        wd.get("http://mock-api.techwithjatin.com/");

        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("jatin123");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("jatin123");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("registerBtn"))).click();

        System.out.println("Register button clicked successfully.");
    }
}