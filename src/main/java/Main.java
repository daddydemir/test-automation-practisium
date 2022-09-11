import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
            e.printStackTrace();
        }
    }

    public void ClickCss(String css) throws InterruptedException {
        Thread.sleep(500);
        try{
            WebElement object = driver.findElement(By.cssSelector(css));
            object.click();
        } catch (Exception e) {
            ClosePopup();
            Click(css);
            e.printStackTrace();
        }
    }

    public void Write(String xpath, String data) throws InterruptedException {
        Thread.sleep(1000);
        try{
            WebElement object = driver.findElement(By.xpath(xpath));
            object.sendKeys(data);
        }catch (Exception e){
            Write(xpath , data);
        }
    }

    public Boolean Check(String xpath) throws InterruptedException {
        Thread.sleep(1000);
        if(!driver.findElement(By.xpath(xpath)).isDisplayed()){
            return false;
        }else{
            return true;
        }
    }

    public void SelectBox(String xpath, String data) throws InterruptedException {
        Thread.sleep(500);
        try{
            WebElement object = driver.findElement(By.xpath(xpath));
            Select select = new Select(object);
            select.selectByVisibleText(data);
        }catch (Exception ex){
            SelectBox(xpath,data);
        }
    }

    public void StopBrowser() throws InterruptedException {
        Thread.sleep(10); // Programın kapanmaması için
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
