package Podium.Core;

import static Podium.Core.DriverFactory.getDriver;

public class Link extends BasePage1 {

    public void accessHomePage() {

        getDriver().get("https://www.podium.com/");
    }
}
