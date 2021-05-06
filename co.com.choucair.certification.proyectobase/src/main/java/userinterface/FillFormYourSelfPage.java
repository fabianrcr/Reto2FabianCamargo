package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FillFormYourSelfPage extends PageObject {
    public static final Target BUTTON_JOIN= Target.the( "select Join option ")
            .located(By.cssSelector("a[class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRSTNAME= Target.the( "Input first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME= Target.the( "Input last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL= Target.the( "Input email")
            .located(By.id("email"));
    public static final Target CMB_BIRTHMONTH= Target.the( "Select Birth Month")
            .located(By.id("birthMonth"));
    public static final Target CMB_BIRTHDAY= Target.the( "Select Birth Day")
            .located(By.id("birthDay"));
    public static final Target CMB_BIRTHYEAR= Target.the( "Select Birth Year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_NEXT= Target.the( "Do click to advance at form 2 (location)")
            .located(By.cssSelector("a[aria-label='Next step - define your location']"));

}
