import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "\\Users\\eyo\\Documents\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("IDONGESIT");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("EYO");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("QA Engineer");

        WebElement highestEducation = driver.findElement(By.id("radio-button-1"));
        highestEducation.click();

        WebElement sex = driver.findElement(By.id("checkbox-1"));
        sex.click();

        WebElement yearOfExperience = driver.findElement(By.cssSelector("option[value='1']"));
        yearOfExperience.click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("04/03/2023");
        date.sendKeys(Keys.RETURN);

        WebElement submitButton =driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submitButton.click();

        WebDriverWait wait =  new WebDriverWait(driver,10);
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

        String alertText = alert.getText();
        assertEquals("The form was successfully submitted!",alertText);

        driver.quit();
    }
}
