package starter.ui.searchPageGoogle;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPageGoogleForm {

    public static final Target imagenGoogle = Target.the("imagen Google").locatedBy("//img[@alt='Google']");
    public static final Target barraBusqueda = Target.the("Barra Busqueda").locatedBy("//input[@title='Buscar']");
    public static final Target botonBuscar = Target.the("Boton Buscar").locatedBy("//input[@type='submit' and @value='Buscar con Google']");

}
