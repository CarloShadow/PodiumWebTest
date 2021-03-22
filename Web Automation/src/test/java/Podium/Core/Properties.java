package Podium.Core;

public class Properties {

    public static boolean FECHAR_BROWSER = false;

    // Replace the "CHROME" word for your browser name in the line below | OPTIONS: (CHROME, FIREFOX, EDGE OR SAFARI)
    public static Browsers browser = Browsers.CHROME;

    public enum Browsers {
        CHROME,
        FIREFOX,
        EDGE,
        SAFARI
    }
}
