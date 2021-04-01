package Core;

public class Propriedades {

    public static boolean FECHAR_BROWSER = false;

    // Escolha o seu browser colocando uma das opções entre a linha 11 e 14 no final da linha 8
    public static Browsers browser = Browsers.CHROME;

    public enum Browsers {
        CHROME,
        FIREFOX,
        EDGE
    }
}
