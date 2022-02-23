import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Snapdeal {

    @Test
    public void getSnapdealUP() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/tv/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
         Assert.assertEquals(driver.getTitle().endsWith("Items"), true);

        driver.findElement(By.id("inputValEnter")).sendKeys("Apple iPhone XR (128GB) - Coral");
        driver.findElement(By.xpath("//body/div[@id='sdHeader']/div[4]/div[2]/div[1]/div[2]/button[1]/span[1]")).click();

    }
}

























