package mycode;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class orangelogin {

	WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass
	public void Close() {
	//	driver.close();
	}
	@Test
	public void LoginHRM() throws InterruptedException {
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("Admin");
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("admin123");
	driver.findElement(By.tagName("Button")).click();

	}
}