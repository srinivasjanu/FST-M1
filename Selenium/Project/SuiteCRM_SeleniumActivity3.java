import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SuiteCRM_SeleniumActivity3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://alchemy.hguy.co/crm");
        String copyRightText = driver.findElement(By.xpath("//a[@id='admin_options']")).getText();
        System.out.println(copyRightText);
        driver.close();
    }

}
