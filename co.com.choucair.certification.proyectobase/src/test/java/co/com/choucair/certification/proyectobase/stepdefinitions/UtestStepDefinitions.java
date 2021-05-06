package co.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.PasswordData;
import model.UtestAddressData;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.FillFormAddress;
import tasks.FillFormYourSelf;
import tasks.FillFormPassword;
import tasks.OpenUp;

import java.util.List;


public class UtestStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than fabian wants to join at the Utest platform$")
    public void thanBrandonWantsToLearnAutomationAtTheUtest() throws Exception {
       OnStage.theActorCalled("Fabian").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fill the form telling about yourself on the Utest platform$")
    public void heSearchForTheCurseFoundationExpressTheUtestPlatform(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FillFormYourSelf.the(utestData.get(0).getFirstName(),utestData.get(0).getLastName(),
                utestData.get(0).getEmail(),utestData.get(0).getBirth()));
    }

    @And("^after fill the address form$")

    public void afterFillTheAddressForm(List<UtestAddressData> utestAddressData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FillFormAddress.the(utestAddressData.get(0).getCity(),utestAddressData.get(0).getZip(),
                utestAddressData.get(0).getCountry()));
    }

    @And("^write a password with a lowercase, an uppercase and a number$")
    public void writeAPasswordWithALowercaseAnUppercaseAndANumber(List<PasswordData> PasswordData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FillFormPassword.the(PasswordData.get(0).getPassword(), PasswordData.get(0).getConfirmpassword()));
    }

    @Then("^he should to read the welcome to the community$")
    public void heShouldToReadTheWelcomeToTheCommunity(List<PasswordData> PasswordData) throws Exception {
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(PasswordData.get(0).getWelcome())));
    }
}