package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps", "hooks"},
        //tags= "@inventory"
      // tags = "@locked_out_user"
       tags = "@login"
       // tags ="@invalid_password"
        // tags ="@invalid_username"
       // tags= "@invalid_data"
        //tags="@empty_fields"
       // tags = "@sorting_A-Z"
       // tags="@sort_price_fromLowToHigh"
)
public class RunnerTest {
}
