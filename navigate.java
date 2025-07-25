package NavigationCommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigate {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        driver.navigate().to("https://demo.opencart.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        driver.navigate().to("http://www.bing.com");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        
        driver.navigate().to("https://www.freecrm.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        
        driver.navigate().to("http://www.half.ebay.com");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        driver.navigate().back();
        System.out.println("After back: " + driver.getCurrentUrl());
        
        driver.navigate().forward();
        System.out.println("After forward: " + driver.getCurrentUrl());
        
        driver.navigate().refresh();
        System.out.println("Refreshed.");
        
        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());
        
        
        driver.quit();
    }
}