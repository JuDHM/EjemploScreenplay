package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject {
	public static final Target BOTON_OPCION_APLICACIONES = Target.the("Opcion para desplegar la lista de menus").located(By.id("gbwa"));
	public static final Target BOTON_GOOGLE_TRANSLATE = Target.the("Boton para el aplicativo Google Translate").located(By.id("gb51"));
}
