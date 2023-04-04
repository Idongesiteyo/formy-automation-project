import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "\\Users\\eyo\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
         WebElement autoComplete = driver.findElement(By.id("autocomplete"));
         autoComplete.sendKeys("1555 Park Blvd, Palo Alto, CA ");


        driver.quit();
    }
}
