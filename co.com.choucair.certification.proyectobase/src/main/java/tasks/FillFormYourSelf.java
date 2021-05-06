package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.FillFormYourSelfPage;

public class FillFormYourSelf implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String birthday;

    public FillFormYourSelf(String firstName, String lastName, String email, String birthday) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthday = birthday;
    }

    public static FillFormYourSelf the(String firstName, String lastName, String email, String birthday) {
        return Tasks.instrumented(FillFormYourSelf.class,firstName,lastName,email,birthday);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] parts = birthday.split(",");
        String month = parts[0];
        String day = parts[1];
        String year = parts[2];
        actor.attemptsTo(Click.on(FillFormYourSelfPage.BUTTON_JOIN),
                Enter.theValue(firstName).into(FillFormYourSelfPage.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(FillFormYourSelfPage.INPUT_LASTNAME),
                Enter.theValue(email).into(FillFormYourSelfPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(month).from(FillFormYourSelfPage.CMB_BIRTHMONTH),
                SelectFromOptions.byVisibleText(day).from(FillFormYourSelfPage.CMB_BIRTHDAY),
                SelectFromOptions.byVisibleText(year).from(FillFormYourSelfPage.CMB_BIRTHYEAR),
                Click.on(FillFormYourSelfPage.BUTTON_NEXT)
        );
    }

}
