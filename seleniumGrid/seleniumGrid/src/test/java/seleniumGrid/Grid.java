package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {

	public static void main(String[] args) throws MalformedURLException {
		
	
	DesiredCapabilities des = new DesiredCapabilities();
	des.setBrowserName("chrome");
   des.setPlatform(Platform.WINDOWS);
   
   ChromeOptions opt = new ChromeOptions();
   
   opt.merge(des);
   String HubURL = "http://192.168.1.7:4444/wd/hub/";
   
   try {
   
   
   WebDriver driver = new RemoteWebDriver(new URL(HubURL), opt);
   driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=13350215484922789676&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301240&hvtargid=kwd-10573980&hydadcr=14453_2371562");
   
   System.out.println(driver.getTitle());
   }
   catch(Exception e) {
	   
   }
		    
	
}
}