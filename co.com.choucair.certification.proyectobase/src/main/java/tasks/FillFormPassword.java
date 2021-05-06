package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestPasswordPage;

public class FillFormPassword implements Task {

    private String strPassword;
    private String strConfirmPassword;
    public FillFormPassword(String strPassword, String strConfirmPassword){

        this.strPassword=strPassword;
        this.strConfirmPassword=strConfirmPassword;

    }
    public static FillFormPassword the(String password, String confirmpassword) {
        return Tasks.instrumented(FillFormPassword.class,password,confirmpassword);
    }

    public static FillFormPassword onThePage() {
        return Tasks.instrumented(FillFormPassword.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(UtestPasswordPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UtestPasswordPage.INPUT_CONFIRMPASSWORD),
                Click.on(UtestPasswordPage.CHECK_TERM),
                Click.on(UtestPasswordPage.CHECK_PRISET),
                Click.on(UtestPasswordPage.ENTER_BUTTON)
        );
    }
}
