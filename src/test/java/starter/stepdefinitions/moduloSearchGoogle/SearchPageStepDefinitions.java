package starter.stepdefinitions.moduloSearchGoogle;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.searchPageGoogle.SearchPageGoogleForm;
import task.SearchPageGoogleTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchPageStepDefinitions {
    @Entonces("valida la barra de busqueda Google")
    public void validaLaBarraDeBusquedaGoogle() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SearchPageGoogleForm.barraBusqueda,isVisible()).forNoMoreThan(10).seconds()
        );
    }

    @Y("el usuario busca el {string} en el buscador")
    public void elUsuarioBuscaElTerminoEnElBuscador(String termino) {
        theActorInTheSpotlight().attemptsTo(
                SearchPageGoogleTask.SearchInPageGoogle(termino)
        );
    }
}
