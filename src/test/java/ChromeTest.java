/** Chotika Luangorachorn 5810404928*/
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ChromeTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:/Users/computer/Documents/WebTesting/chtomedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }@Test
    public void test01(){
        driver.navigate().to("https://www.youtube.com");
        assertEquals("YouTube", driver.getTitle());

    }

    @Test
    public void test02() {
        driver.navigate().to("https://www.youtube.com");
        driver.findElement(By.id("search")).sendKeys("web test");
        driver.findElement(By.id("search-icon-legacy")).click();
        assertEquals("web test - YouTube", driver.getTitle());
    }


    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
