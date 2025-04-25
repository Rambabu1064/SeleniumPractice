package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String str_Title = driver.getTitle();
		System.out.println(str_Title);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement txtElemSearch= driver.findElement(By.id("twotabsearchtextbox"));
		txtElemSearch.sendKeys("electronics");
		String myText = txtElemSearch.toString();
		System.out.println(myText);
		Thread.sleep(4000);
		
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		String btnText = searchButton.toString();
		System.out.println(btnText);
		searchButton.click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		WebElement signbut=driver.findElement(By.id("nav-link-accountList"));
		String myclick=signbut.toString();
		signbut.click();
		System.out.println(myclick);
		driver.navigate().back();
		Thread.sleep(4000);
		
		WebElement Returnbut= driver.findElement(By.id("nav-orders"));
		String myClick=Returnbut.toString();
		Returnbut.click();
		System.out.println(myClick);
		Thread.sleep(4000);
		driver.navigate().back();
		
	
		WebElement cartbut= driver.findElement(By.id("nav-cart"));
		String Click=cartbut.toString();
		cartbut.click();
		System.out.println(Click);
		Thread.sleep(4000);
		driver.navigate().back();
		
		WebElement locationbut= driver.findElement(By.id("nav-global-location-popover-link"));
		String locClick=locationbut.toString();
		locationbut.click();
		System.out.println(locClick);
		Thread.sleep(4000);
		
		String amazonpage = driver.getWindowHandle();
		for(String Applybutton : driver.getWindowHandles()) {
			driver.switchTo().window(Applybutton);
		}
		driver.manage().window().maximize();
		
		WebElement txtElePincode= driver.findElement(By.id("GLUXZipUpdateInput"));
		String ElePincode=txtElePincode.toString();
		txtElePincode.sendKeys("500081");
		String Text=txtElePincode.toString();
		System.out.println(Text);
		Thread.sleep(4000);
		
		WebElement pinbut=driver.findElement(By.className("a-button-input"));
		String pinClick=pinbut.toString();
		pinbut.click();
		System.out.println(pinClick);
		
		driver.close();
		driver.switchTo().window(amazonpage);
		
		driver.quit();
		
	}
}
