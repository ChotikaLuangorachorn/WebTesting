/** Chotika Luangorachorn 5810404928*/
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class FirefoxTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:/Users/computer/Documents/WebTesting/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }@Test
    public void test01(){
        driver.navigate().to("https://www.bing.com");
        assertEquals("Bing", driver.getTitle());
    }

    @Test
    public void test02(){
        driver.navigate().to("https://www.bing.com");
        driver.findElement(By.id("sb_form_q")).sendKeys("software engineering");
        driver.findElement(By.name("go")).click();
        assertEquals(true, true);
        driver.findElement(By.className("b_logoArea")).click();
        assertEquals("Bing", driver.getTitle());
    }

    @Test
    public void test03(){
        driver.navigate().to("https://www.bing.com");
        driver.findElement(By.id("scpl1")).click();
        assertEquals("Bing Image Feed", driver.getTitle());

        driver.findElement(By.id("sb_form_q")).sendKeys("software");
        driver.findElement(By.name("go")).click();
        assertEquals("software - Bing images", driver.getTitle());
        assertEquals(true, true);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
