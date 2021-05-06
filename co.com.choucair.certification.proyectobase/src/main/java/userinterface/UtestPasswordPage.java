package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPasswordPage extends PageObject {

    public static final Target INPUT_PASSWORD=Target.the( "where do we write the password")
        .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD=Target.the( "where do we write the confim password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERM=Target.the( "check to term of use")
            .located(By.id("termOfUse"));
    public static final Target CHECK_PRISET=Target.the( "check to privacy Setting")
            .located(By.id("privacySetting"));
    public static final Target ENTER_BUTTON=Target.the( "button to confirm login")
            .located(By.id("laddaBtn"));
    public static final Target LABEL_WELCOME=Target.the( "button to confirm login")
            .located(By.cssSelector("div[class='image-box-header']"));
}

