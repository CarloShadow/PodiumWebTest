package Podium.Core;


import Podium.Core.BasePage1;

import static Podium.Core.DriverFactory.getDriver;

public class Link extends BasePage1 {

    public void acessHomePage() {

        getDriver().get("https://www.podium.com/");
    }
}
