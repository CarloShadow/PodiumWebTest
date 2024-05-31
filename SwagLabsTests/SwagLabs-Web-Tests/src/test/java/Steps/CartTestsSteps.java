package Steps;

import static org.junit.Assert.assertEquals;

import Pages.GeneralPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class CartTestsSteps extends GeneralPage {

	@E("^adiciono um produto ao carrinho$")
	public void adicionoUmProdutoAoCarrinho() {
		clickAddOnesieToCart();
	}

	@E("^abro o carrinho$")
	public void abroOCarrinho() {
		clickBtnCart();
	}

	@Então("^valido o produto adicionado no carrinho$")
	public void validoOProduroAdicionadoNoCarrinho() {
		assertEquals(validateInventoryItem(), "Sauce Labs Onesie");
	}

}
