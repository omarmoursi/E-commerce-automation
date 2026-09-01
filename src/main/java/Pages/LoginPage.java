package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends MethodHandles

{

     public LoginPage(WebDriver driver)
    {
        super(driver);
    }

     private final By EmailField=By.cssSelector("[data-qa='login-email']");

     private final By PasswordField=By.cssSelector("[data-qa='login-password']");

     private final By LoginButton=By.cssSelector("[data-qa='login-button']");

     private final By  ValidationMessage=By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");



     private void InsertEmail(String email)
     {
            sendKeys(EmailField , email,10);
     }

     private void InsertPassword(String password)
     {
            sendKeys(PasswordField , password,10);
     }

     public void ClickLoginButton()
    {
        click(LoginButton ,10);
    }


     public HomePage LoginData(String email, String password)

     {
        InsertEmail(email);
        InsertPassword(password);
        ClickLoginButton();
        return new HomePage(driver);
    }

   public String GetValidationMessage()
   {
         return   getText(ValidationMessage,10);
   }

}
