import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\eyo\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement nameField = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(nameField);
        nameField.sendKeys("Idongesit Francis");

        WebElement dateField = driver.findElement(By.id("date"));
        dateField.sendKeys("03/03/2023");

        Thread.sleep(1000);

        driver.quit();
    }
}
