import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Amazon {
    @Test
    public void getAmazonUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/tv/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle().endsWith("Amazon.in"), true);

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone XR (128GB) - Coral");
        driver.findElement(By.id("nav-search-submit-button")).click();

        String a = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
        System.out.println("price of apple iPhone xr (128gb) coral is" + "-->" + a);

        driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();

        Thread.sleep(2000);
        Set<String>s=driver.getWindowHandles();
        Iterator<String>it=s.iterator();
        it.next();
        String w2nd=it.next();
        driver.switchTo().window(w2nd);
        Thread.sleep(2000);
       String detailsFromAmazon= driver.findElement(By.xpath("//div[@id='feature-bullets']")).getText();
        System.out.println("details of apple iphone xr (128gb) coral is"+"-->"+detailsFromAmazon);

    }
}


