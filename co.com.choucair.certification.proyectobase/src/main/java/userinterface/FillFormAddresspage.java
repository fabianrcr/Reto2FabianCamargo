package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillFormAddresspage extends PageObject {

    public static final Target INPUT_CITY= Target.the( "Input City")
            .located(By.id("city"));
    public static final Target INPUT_ZIP= Target.the( "Input Zip")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY= Target.the( "Input Country")
            .located(By.cssSelector("div[class='ui-select']"));
    public static final Target CMB_COUNTRY= Target.the( "Input Country")
            .located(By.cssSelector("input[placeholder='Select a country']"));
    public static final Target BUTTON_NEXT= Target.the( "Do click to advance at form 3 (devices)")
            .located(By.cssSelector("a[aria-label='Next step - select your devices']"));
    public static final Target BUTTON_NEXTDEVICES= Target.the( "Do click to advance at form 4 (last step)")
            .located(By.cssSelector("a[aria-label='Next - final step']"));
}
