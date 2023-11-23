package steps;

import cucumber.api.java.en.Then;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class YourCartSteps extends BaseSteps{
    @Then("^I open Your_Cart_Link page$")
    public void iOpenYour_Cart_LinkPage() {
        yourCartPage.YourCartPageOpen.shouldBe(visible, Duration.ofSeconds(10));

    }
}
