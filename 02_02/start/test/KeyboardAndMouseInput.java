import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\eyo\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

//        WebElement keyboardName = driver.findElement(By.linkText("Key and Mouse Press"));
//        keyboardName.click();

        WebElement fullName = driver.findElement(By.id("name"));
        fullName.click();
        Thread.sleep(200);
        fullName.sendKeys("Idongesit Eyo");

        WebElement submitButton = driver.findElement(By.id("button"));
        submitButton.click();


        driver.quit();
        System.out.println("TEST COMPLETE");
    }
}
