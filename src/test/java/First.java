import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    @Test
    public void run() throws InterruptedException {

        Boolean data = Init.StartTest();
        Assert.assertTrue(data);
    }

    @Test
    public void run2(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\demir\\projects\\java\\testselenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://a101.com.tr");
//        driver.findElement(By.xpath("")).isDisplayed();
        WebElement object = driver.findElement(By.cssSelector("button[class='kampanyalar']"));
        System.out.println(object.getText());
        driver.close();
    }

}
