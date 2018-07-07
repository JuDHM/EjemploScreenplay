package co.com.proyectobase.screenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.proyectobase.screenplay.ui.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	GoogleHomePage googleHomepage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(googleHomepage));
	}

	public static Abrir laPaginaGoogle() {
		return instrumented(Abrir.class);
	}
	
}