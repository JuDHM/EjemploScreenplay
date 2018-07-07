package co.com.proyectobase.screenplay.stepdefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class TraductorGoogleStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor juan = Actor.named("juan");
	
	@Before
	public void configuracionInicial() {
		juan.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Que Juan quiere usar el traductor de google$")
	public void queJuanQuiereUsarElTraductorDeGoogle() throws Exception {
		juan.wasAbleTo(Abrir.laPaginaGoogle());
	}

	@When("^El traduce la palabra (.*) del ingles al español$")
	public void elTraduceLaPalabraTableDelInglesAlEspañol(String palabra) throws Exception {
	    juan.attemptsTo(Traducir.deInglesAEspanol(palabra));
	}

	@Then("^El deberia ver la palabra (.*) en la pantalla$")
	public void elDeberiaVerLaPalabraMesaEnLaPantalla(String palabraEsperada) throws Exception {
		juan.should(GivenWhenThen.seeThat(LaRespuesta.es(), Matchers.equalTo(palabraEsperada)));
	}
}