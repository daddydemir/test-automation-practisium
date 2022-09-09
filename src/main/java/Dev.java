import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dev {
    protected String path = "C:\\Users\\demir\\projects\\java\\testselenium\\chromedriver.exe";
    public static WebDriver driver;

    public Dev(){
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
    }
}
