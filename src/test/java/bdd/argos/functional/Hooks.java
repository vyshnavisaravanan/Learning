package bdd.argos.functional;

import bdd.argos.functional.driver.DriverHelper;
import bdd.argos.functional.utility.FullLengthScreenshot;
import bdd.argos.functional.utility.Screenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks extends DriverHelper {
    Scenario scenario;

    private DriverHelper driverHelpers = new DriverHelper();
    private Screenshot screenshot=new Screenshot();
    private FullLengthScreenshot fulllenscrshot = new FullLengthScreenshot();
    @Before("@argos")
    public void setUp() {
        System.out.println("Im in hooks");
        driverHelpers.openBrowser();
        driverHelpers.maximiseBrowser();
        driverHelpers.navigateTo("http://www.argos.co.uk");
        driverHelpers.applyImpWaits();
        driverHelpers.applyExpWaits();
        driverHelpers.applyActions();
    }

    @Before("@nop")
    public void setUp1() {
        System.out.println("Im in hooks nop");
        driverHelpers.openBrowser();
        driverHelpers.maximiseBrowser();
        driverHelpers.navigateTo("http://demo.nopcommerce.com/");
        driverHelpers.applyImpWaits();
        driverHelpers.applyActions();
    }
    @Before("@next")
    public void setUpnext() {
        System.out.println("Im in hooks nop");
        driverHelpers.openBrowser();
        driverHelpers.maximiseBrowser();
        driverHelpers.navigateTo("http://www.next.co.uk/");
        driverHelpers.applyImpWaits();
        driverHelpers.applyActions();
    }

    @After
    public void tearDown(Scenario scenario) {
        this.scenario=scenario;
        scenario.write("Test Execution finish");
        if(scenario.isFailed()){
            screenshot.takeScreenSHOT();
            fulllenscrshot.takeFullScreenshot();
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
//            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }

        driverHelpers.closeBrowser();
    }
}
