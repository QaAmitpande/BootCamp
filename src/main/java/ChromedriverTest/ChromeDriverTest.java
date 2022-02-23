package ChromedriverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeDriverTest {

    @Test
    public void getAmazonUp(){
        try{
            System.setProperty("webdriver.chrome.driver","/Users/tv/Downloads/chromedriver");

            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in/");
            Thread.sleep(5000);
            System.out.println(driver.getTitle());
            Assert.assertEquals(driver.getTitle().endsWith("Amazon.in"), true);
            driver.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
