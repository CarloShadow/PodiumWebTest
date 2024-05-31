package Steps;

import Core.Browser;
import Pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class LoginSteps{
	 
	Browser browser = new Browser();
	LoginPage pg = new LoginPage();
	

	@Dado("^estou na tela de login$")
	public void oUsuarioEstaNaTelaDeLogin(){
		browser.iniciarBrowser();
	}

	@Quando("^realizo o login$")
	public void realizaOLogin() {
		pg.loginValidUser("standard_user", "secret_sauce");
	}

}
