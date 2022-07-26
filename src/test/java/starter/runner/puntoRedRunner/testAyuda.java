package starter.runner.puntoRedRunner;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ayudaPage/AyudaPage.feature",
        glue="starter",
        tags = "@PortalAyuda or @ItemPortalAyuda or @BuscadorPortalAyuda",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class testAyuda {
}