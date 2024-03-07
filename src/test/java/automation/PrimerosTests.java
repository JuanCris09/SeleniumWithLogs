package automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class PrimerosTests extends BaseTest {


    @Test
    public void primerTest() {
        // minuto 34:30
        Logs.info("navegar a la pagina");
        driver.get("https://www.saucedemo.com/");

        var url = driver.getCurrentUrl();
        Logs.info("verificando la url");
        Assert.assertEquals(url, "https://www.saucedemo.com/");

    }

    @Test
    public void segundoName() {
        Logs.info("navego la HEROKU APP");
        driver.get("https://the-internet.herokuapp.com/");

        Logs.info("Navego a GitHub");
        driver.get("https://github.com/");

        Logs.info("Regresando a la pagina HEROKU APP");
        driver.navigate().back();

        var url = driver.getCurrentUrl();
        Logs.info("verificando la url");
        Assert.assertEquals(url, "https://the-internet.herokuapp.com/");

    }
}

