package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:\\Users\\Leonardo\\workspace\\CalculoImpostoRenda\\src\\test\\java\\features",
        glue = "steps",
        strict = false,
        //tags = {"@unitario", "~@funcional"},
        plugin = {"progress"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
        )
public class RunnerTest {
}
