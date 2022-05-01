package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class listwebelemnt {
	
public void demo(WebDriver driver)
{     WebElement fff= driver.findElement(By.xpath("//select[@tabindex='0']"));
       Select all=new Select(fff);
       List<WebElement> op=all.getOptions();
       //int size=op.size();
     // System.out.println(size); 
      op.get(41).click();
      System.out.println(op.get(41).getAttribute("value"));
       
}
	
public static void main(String[] args) {
	WebDriver driver=Basicmethod.test1("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462777326&hvpos=&hvnetw=g&hvrand=10048010864476212326&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAiAnO2MBhApEiwA8q0HYdR2WB9XvkACPcPbjlcuqcjO8ZNYzktIrMz7TxytEreOkAF9DrMyDxoC2sAQAvD_BwE");
  listwebelemnt obj=new listwebelemnt();
  obj.demo(driver);
}
}
