package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.ayudaPage.AyudaPageForm;
import starter.ui.searchPageGoogle.SearchPageGoogleForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchPageGoogleTask implements Task{
    private final String consulta;

    public SearchPageGoogleTask(String consulta) {this.consulta = consulta;}

    public static Performable SearchInPageGoogle(String consulta){
        return instrumented(SearchPageGoogleTask.class, consulta);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Bien");
        actor.attemptsTo(
                Enter.theValue(consulta).into(SearchPageGoogleForm.barraBusqueda),
                Click.on(SearchPageGoogleForm.botonBuscar)
        );

    }
}
