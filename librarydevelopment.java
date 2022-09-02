package librarydevelopment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class libraryclass {
	
	public static WebDriver driver;
	
	public static void launchbrowser() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\krish\\OneDrive\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(5000);
	}
	
	public static void idElementLocator() throws InterruptedException{
		driver.findElement(By.id("benzradio")).click();
		Thread.sleep(5000);
		WebElement id1 = driver.findElement(By.id("hondaradio"));
		id1.click();
		Thread.sleep(5000);
		boolean id2 = id1.isSelected();
		if (id2==true) {
			System.out.println("is selected");
		}
		else {
			System.out.println("is not selected");
		}
	}
	
	public static void nameElementLocator() throws InterruptedException {
		driver.findElement(By.name("show-hide")).click();
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.name("enter-name"));
		name.click();
		Thread.sleep(5000);
		boolean name1 = name.isEnabled();
		if (name1==true) {
			System.out.println("is selected");
		}
		else {
			System.out.println("is not selected");
		}
	}
	
	public static void classNameElementLocator() throws InterruptedException {
		driver.findElement(By.className("inputs")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		WebElement className = driver.findElement(By.className("dropbtn"));
		className.click();
		Thread.sleep(5000);
		boolean className1 = className.isEnabled();
		if (className1==true) {
			System.out.println("is selected");
		}
		else {
			System.out.println("is not selected");
		}
	}
	
	public static void newtab() {
	    ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tab.get(1));
	}
	
	
	public static void linkTextElementLocator() throws InterruptedException {
		driver.get("https://www.geeksforgeeks.org/python-programming-language/");
		driver.findElement(By.linkText("Data Structures")).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.linkText("Competitive Programming"));
		element.click();
		boolean linkText1 = driver.findElement(By.linkText("Competitive Programming")).isDisplayed();
		if (linkText1) {
			System.out.println("is displayed");
		}
		else {
			System.out.println("is not displayed");
		}
		Thread.sleep(5000);
		
		
	}
	
	public static void partialLinkTextElementLocator() throws InterruptedException {
		newtab();
		ArrayList<String> tab1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(2));
		driver.get("https://www.w3schools.com/java/default.asp");
		
		driver.findElement(By.partialLinkText("Booleans")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Methods")).click();
	
		Thread.sleep(5000);
		boolean partialLinkText = driver.findElement(By.partialLinkText("Methods")).isDisplayed();
		if (partialLinkText) {
			System.out.println("is displayed");
		}
		else {
			System.out.println("is not displayed");
		}
		
	}
	
	public static void cssSelectorElementLocator() throws InterruptedException {
		driver.findElement(By.cssSelector("#topnav > div > div.w3-bar.w3-left > a:nth-child(5)")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#topnav > div > div.w3-bar.w3-left > a:nth-child(4)")).click();
	
		Thread.sleep(5000);
		boolean cssSelector = driver.findElement(By.cssSelector("#topnav > div > div.w3-bar.w3-left > a:nth-child(4)")).isDisplayed();
		if (cssSelector==true) {
			System.out.println("is displayed");
		}
		else {
			System.out.println("is not displayed");
		}
		
	}
	
	public static void xpathElementLocator() throws InterruptedException {
		ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(0));
		driver.findElement(By.xpath("//*[@id=\"benzradio\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hondacheck\"]")).click();
	
		Thread.sleep(5000);
		boolean xpath = driver.findElement(By.xpath("//*[@id=\"hondacheck\"]")).isSelected();
		if (xpath==true) {
			System.out.println("is selected");
		}
		else {
			System.out.println("is not selected");
		}
		
	}
	
	public static void closeBrowser() {
		driver.quit();
	}

}
