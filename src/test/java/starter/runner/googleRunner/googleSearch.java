package starter.runner.googleRunner;

import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import starter.runner.RunnerPersonalizado;
import starter.util.commons.BeforeSuite;
import starter.util.commons.DataToFeature;

import java.io.IOException;


//@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/googleSearchPage/SearchPage.feature",
        glue="starter",
        tags = "@PortalSearchGoogle",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(RunnerPersonalizado.class)
public class googleSearch {

    @BeforeSuite
    public static void test()
            throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/googleSearchPage/SearchPage.feature");
    }

}
