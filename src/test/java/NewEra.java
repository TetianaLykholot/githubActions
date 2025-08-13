import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewEra {

    @BeforeClass
    public void setupBrowser(){
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.neweracap.eu/");
       driver.manage().window().maximize();
       driver.close();
    }

    @Test
    public void open() {

    }
}
