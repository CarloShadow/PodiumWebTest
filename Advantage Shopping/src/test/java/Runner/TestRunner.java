package Runner;

import Core.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\Features",
        glue = "Steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        plugin = {"pretty"}
        )
public class TestRunner {

    @AfterClass
    public static void testEnd(){
        DriverFactory.killDriver();
    }

}
