package starter.stepdefinitions;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import io.cucumber.java.es.Y;
import starter.navigation.NavigateTo;
import starter.navigation.NavigateToGoogle;


public class AmbienteGoogle {
    @Y("se ingresa al portal de google")
    public void se_ingresa_al_portal_de_google(){
        System.out.println("ingreso al portal de google");
        theActorInTheSpotlight().attemptsTo(
                NavigateToGoogle.theGoogleHomePage()
        );
    }
}
