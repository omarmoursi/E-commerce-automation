package registerwhilecheckout;

import Base.BaseTest;
import Pages.Account_Created;
import Pages.RegisterPage;
import Pages.RegisterwhileCheckout;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class RegisterwhileCheckoutTest extends BaseTest {
  //  Actions actions;

    @Test
    public void testoverlay() throws InterruptedException, FileNotFoundException
    {

        RegisterwhileCheckout registerwhileCheckout = homePage.clickRegisterWhileCheckout();
        registerwhileCheckout.ScrollToElementJsExcuter();
        registerwhileCheckout.AddProductToCart("Men Tshirt");

        registerwhileCheckout.ClickViewAndCheckOut();

        RegisterPage registerPage = homePage.clickSignUpButton();
        RegisterPage registerPage1 = registerPage.SignUpFeature
                (
                        dataModel().Register.name, dataModel().Register.email
                );

        Account_Created account_Created = registerPage1.CreateAccountFeature
                (
                        dataModel().Register.pass,
                        dataModel().Register.day,
                        dataModel().Register.mon,
                        dataModel().Register.year,
                        dataModel().Register.first,
                        dataModel().Register.last,
                        dataModel().Register.comp,
                        dataModel().Register.addr1,
                        dataModel().Register.addr2,
                        dataModel().Register.countries,
                        dataModel().Register.states,
                        dataModel().Register.cites,
                        dataModel().Register.zcode,
                        dataModel().Register.mobile
                );


    }
}