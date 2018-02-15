package bdd.argos.functional.utility;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FullLengthScreenshot {
    public  void takeFullScreenshot()
    {

// This code will capture screenshot of current screen
        BufferedImage image = null;
        try {
            image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (AWTException e) {
            e.printStackTrace();
        }

// This will store screenshot on Specific location
        try {
            ImageIO.write(image, "png", new File("./target/screenshots/"+System.currentTimeMillis()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
