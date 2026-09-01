package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account_Created extends MethodHandles {


    public Account_Created(WebDriver driver){

        super(driver);
    }

   private final By ContinueButton=By.cssSelector("[data-qa='continue-button']");


  public HomePage clickcontinuebutton(){

      click(ContinueButton,10);
      return new  HomePage(driver);
  }

}
