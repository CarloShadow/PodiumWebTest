package Podium.Suport;


import Podium.Pages.BasePage1;

import static Podium.Suport.DriverFactory.getDriver;

public class Link extends BasePage1 {

    public void acessHomePage() {

        getDriver().get("https://www.podium.com/");
    }
}
