import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipkart {

    @Test
    public void getFlipkartUP() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/tv/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
       Assert.assertEquals(driver.getTitle().endsWith("Best Offers!"), true);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("//input[@class='_3704LK']"))
                .sendKeys("Apple iPhone XR (128GB) - Coral");
        driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    String b =driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
      System.out.println("price of apple iPhone xr (128gb) coral is" + "-->" + b);

      String details=driver.findElement(By.xpath("//div[@class='col col-7-12']")).getText();
        System.out.println("price of apple iPhone xr (128gb) coral is" + "-->" + details);
    }
}
