import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dev {
    protected String path = "C:\\Users\\demir\\projects\\java\\testselenium\\chromedriver.exe";
    public static WebDriver driver;
    public ChromeOptions options = new ChromeOptions();

    public Dev(){
        options.addArguments("--disable-notifications"); // bildirimleri engelleme
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver(options);
    }
}
