package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.GoogleHomePage;
import co.com.proyectobase.screenplay.ui.GoogleTraslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Traducir implements Task {
	
	private String palabra;
	
	public Traducir(String palabra) {
		super();
		this.palabra = palabra;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleHomePage.BOTON_OPCION_APLICACIONES));
		actor.attemptsTo(Click.on(GoogleHomePage.BOTON_GOOGLE_TRANSLATE));
		
		actor.attemptsTo(Click.on(GoogleTraslatePage.OPCION_LISTA_LENGUAJES_ORIGEN));
		actor.attemptsTo(Click.on(GoogleTraslatePage.OPCION_IDIOMA_INGLES));
		
		actor.attemptsTo(Click.on(GoogleTraslatePage.OPCION_LIST_LENGUAJES_FINAL));
		actor.attemptsTo(Click.on(GoogleTraslatePage.OPCION_IDIOMA_ESPANOL));
		
		actor.attemptsTo(Enter.theValue(palabra).into(GoogleTraslatePage.AREA_TEXTO_A_TRADUCIR));
		actor.attemptsTo(Click.on(GoogleTraslatePage.BOTON_TRADUCIR));
	}

	public static Traducir deInglesAEspanol(String palabra) {
		return Tasks.instrumented(Traducir.class, palabra);
	}

}
