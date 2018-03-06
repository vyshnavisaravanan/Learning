package bdd.argos.functional.utility;

import bdd.argos.functional.driver.DriverHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot extends DriverHelper {
    public void takeScreenSHOT()
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        try {
            FileUtils.copyFile(src,new File("./target/screenshots/"+dateName+System.currentTimeMillis()+".png"));
        } catch (IOException e) {
            System.out.println("Error while taking Screenshot"+e.getMessage());
        }

    }
}
