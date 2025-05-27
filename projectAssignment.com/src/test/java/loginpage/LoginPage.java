package loginpage;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/register");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("xuxameneguel");
		driver.findElement(By.name("password")).sendKeys("Xuxuxu_xaxaxa_123 ");
	
        // Wait until the button is clickable
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sendbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='TO SEND']")));
     // Use JavaScriptExecutor if click() fails
        try {
        sendbutton.click();
        }catch (Exception e) {
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].click();", sendbutton);
		}
        System.out.println("button is click");
        driver.quit();
        
	}

}
