package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userinterface.FillFormAddresspage;
import userinterface.FillFormYourSelfPage;

public class FillFormAddress implements Task {
    private String city;
    private String zip;
    private String country;

    public FillFormAddress(String city, String zip, String country) {

        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    public static FillFormAddress the(String city, String zip, String country) {
        return Tasks.instrumented(FillFormAddress.class,city,zip,country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(FillFormAddresspage.INPUT_CITY),
               // SelectFromOptions.byVisibleText(city).from(FillFormAddresspage.INPUT_CITY),
                Enter.theValue(zip).into(FillFormAddresspage.INPUT_ZIP),
                Click.on(FillFormAddresspage.INPUT_COUNTRY),
               // SelectFromOptions.byVisibleText(country).from(FillFormAddresspage.CMB_COUNTRY),
                Enter.theValue(country).into(FillFormAddresspage.CMB_COUNTRY).thenHit(Keys.ENTER),
                Click.on(FillFormAddresspage.BUTTON_NEXT),
                Click.on(FillFormAddresspage.BUTTON_NEXTDEVICES)

        );
    }

}
