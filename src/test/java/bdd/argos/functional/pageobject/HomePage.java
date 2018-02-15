package bdd.argos.functional.pageobject;

import bdd.argos.functional.driver.DriverHelper;

public class HomePage extends DriverHelper {

    public boolean isOnHomePage() {
        return driver.getCurrentUrl().endsWith("co.uk/");
    }
}
