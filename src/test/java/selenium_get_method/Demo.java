package selenium_get_method;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// to initialized webdriver
		WebDriver driver = new ChromeDriver();
		// get the url
		driver.get("https://omayo.blogspot.com/");
		// to manage the test window either maximize or minimize
		driver.manage().window().maximize();
		// to get the current url and print it
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// to get the title of the web page and print
		String title = driver.getTitle();
		System.out.println(title);
		// to get the page source and print it
		String pageSource = driver.getPageSource(); System.out.println(pageSource);
		//to get the window handle and print it note- the window handle changes every time we load the page
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		//
		driver.findElement(By.linkText("compendiumdev")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		for(String window : windowhandles) 
		{
			System.out.println(window);
		}

	}

}
