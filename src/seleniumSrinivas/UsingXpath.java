package seleniumSrinivas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UsingXpath extends LaunchBrowser{

	public static void main(String[] args) throws Exception {
		
		UsingXpath obj = new UsingXpath();
		obj.browserLaunch("chrome", "https://www.amazon.com/");
		obj.xpathDemo();
	}
	
		public void xpathDemo() {
			
			String sxpath = "//input[@id = 'twotabsearchtextbox']";     //  in future if we make changes it's good to use variables
			
			//driver.findElement(By.xpath("//input[@id = 'c'])).sendKeys("T-Shirts") -- need to make changes in all places if we have to
			
			driver.findElement(By.xpath(sxpath)).sendKeys("Electronics");
			driver.findElement(By.xpath(sxpath)).sendKeys(Keys.ENTER);

			
			
			// /html/body/div[2]/header/div[2]/div[2]/form/div/div/input ---  absolute path
			
			// relative paths
			// input[@id = 'search']    ---- with one attribute
			// input[@id = 'search'] [@name = 'q']   ---- with two attributes
	
			//	String searchX = "//input[@id = 'c'][@name = 'q']" ;
			 // System.out.println(searchX);
			// input[ contains(@name, 'login')][@id = 'email ]  ---- using contains
			// input[ contains(@name, 'login') and (@id = 'email') ]  ---- using and & contains
			// input[ starts-with(@name, 'login') and (@id = 'email') ]  ---- using starts-with
			
			// input[ contains(@name, 'username') or (@id = 'email') ]  ---- using or & contains
			// input[ contains(@name, 'username') or (@id = 'email') and (@type = 'email') ]  ---- using or, and  & contains

			// a[text() = 'Create an Account']  ----- using text()
			// span[text() = 'Customer Login' ] --------------using text()
			// a[contains(text(), 'Sign In')] ------ using contains and text()
			// div[contains(text(), 'If you have an account')] ------ using partial text
			
			// a[normalize-space(text() = 'Sign In']  ------- normalize space --> to ignore the leading and 
													// trailing spaces
			// input[ contains(@name, 'login') and not (@id = 'pass') ]  ---- using not  & contains
			//input[not@id = 'pass') ]   ------- using not
			//input[not(contains(@type, 'text'') )]   ----- using not and contains
				
			}

}
