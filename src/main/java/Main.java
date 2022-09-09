import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Main extends Dev{

    public Main(){}

    public WebDriver driver = Dev.driver;

    public void StartBrowser(String url){
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void Navigate(String css, String text) throws InterruptedException {
        WebElement menu = driver.findElement(By.cssSelector(css));
        Actions builder = new Actions(driver);
        builder.moveToElement(menu).build().perform();
        Thread.sleep(1000);

        WebElement category = driver.findElement(By.linkText(text));
        builder.moveToElement(category).build().perform();
        category.click();
    }

    public void Click(String xpath) throws InterruptedException {
        Thread.sleep(1000);
        try{
            WebElement object = driver.findElement(By.xpath(xpath));
            object.click();
        } catch (Exception e) {
            ClosePopup();
            Click(xpath);
            e.printStackTrace();
        }
    }

    public void Write(String xpath, String data) throws InterruptedException {
        Thread.sleep(1000);
        WebElement object = driver.findElement(By.xpath(xpath));
        object.sendKeys(data);
    }

    public String Check(String xpath) throws InterruptedException {
        Thread.sleep(1000);
        WebElement object = driver.findElement(By.xpath(xpath));
        return object.getText();
    }

    public void StopBrowser() throws InterruptedException {
        Thread.sleep(50000); // Programın kapanmaması için
        driver.close();
    }

    public void ClosePopup(){
        try{
            WebElement object = driver.findElement(By.xpath("/html/body/div[1]/div[1]"));
            object.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
