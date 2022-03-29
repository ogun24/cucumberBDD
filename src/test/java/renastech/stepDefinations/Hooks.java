package renastech.stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks extends BrowserUtils {


    @Before
    public void setup() {
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        driver.manage().window().maximize();
        driver.get(ConfigurationsReader.getProperties("url99"));
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[]data= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png", scenario.getName());
        }
    }
}