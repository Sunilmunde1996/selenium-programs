package demo;
     import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Facebooklogin {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			WebElement user=driver.findElement(By.id("email"));
			user.sendKeys("Sunilmunde1996@gmail.com");
			WebElement pass=driver.findElement(By.id("pass"));
	         pass.sendKeys("Sunil12@");
	         WebElement login=driver.findElement(By.name("login"));
	         login.click();
	         
	         
		}

	}



