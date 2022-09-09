import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First {

    public WebDriver driver;
    static String url = "https://google.com";

    @Before
    public void name(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\demir\\projects\\java\\testselenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void run(){
        driver.get(url);
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @After
    public void end(){
        driver.quit();
    }
}
