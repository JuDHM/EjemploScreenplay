package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTraslatePage extends PageObject {
	
	public static final Target OPCION_LISTA_LENGUAJES_ORIGEN = Target.the("Boton para el menu de idioma de origen").located(By.id("gt-sl-gms"));
	public static final Target OPCION_IDIOMA_INGLES = Target.the("Opcion de idioma ingles").located(By.id(":1e"));
	public static final Target AREA_TEXTO_A_TRADUCIR = Target.the("Area de texto para la palabra a traducir").located(By.id("source"));
	public static final Target OPCION_LIST_LENGUAJES_FINAL = Target.the("Boton para el menu de idioma  a traducir").located(By.id("gt-tl-gms"));
	public static final Target OPCION_IDIOMA_ESPANOL = Target.the("Opcion de idioma español a traducir").located(By.id(":3q"));
	public static final Target BOTON_TRADUCIR = Target.the("Boton para ejecutar la traduccion").located(By.id("gt-submit"));
	public static final Target AREA_TEXTO_TRADUCIDO = Target.the("").located(By.id("gt-res-dir-ctr"));
}
