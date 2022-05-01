package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Returnpractice {
	
	public static WebDriver dropdown()
	{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=16904727197041045014&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiAkNiMBhCxARIsAIDDKNXSAUso5LQcTxTnRfPKTNawzGPjtvmLqIqIwhfxs6-dYCj0e1EzL4kaAup7EALw_wcB");
		driver.manage().window().minimize();
	return driver;
		
		
		
	}
	

}
