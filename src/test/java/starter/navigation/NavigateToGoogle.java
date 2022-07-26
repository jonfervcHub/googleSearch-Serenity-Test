package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToGoogle {
    public static Performable theGoogleHomePage(){
        return Task.where("abre pagina Home de Google",
                Open.browserOn().the(GoogleSearchHomePage.class));
    }
}
