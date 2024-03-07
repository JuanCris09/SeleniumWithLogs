package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void mastersetUp() {
        Logs.debug("Inicializando mi driver");
        driver = new ChromeDriver();

        Logs.debug("Maximizo el driver");
        driver.manage().window().maximize();

        Logs.debug("Borrando las cookies");
        driver.manage().deleteAllCookies();

        Logs.debug("Aplicando implicit wait");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        new WebDriverProvider().set(driver);
    }

    @AfterMethod
    public void mastertearDown() {
        Logs.debug("Matando mi driver");
        driver.quit();
    }
}
