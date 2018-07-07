package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.GoogleTraslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(GoogleTraslatePage.AREA_TEXTO_TRADUCIDO).viewedBy(actor).asString();
	}

	public static LaRespuesta es() {
		// TODO Auto-generated method stub
		return new LaRespuesta();
	}

}
