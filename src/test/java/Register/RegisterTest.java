package Register;

import Login.LoginTest;
import Pages.Account_Created;
import Pages.HomePage;
import Base.BaseTest;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertEquals;
import static reader.ReadDataFromJson.dataModel;

public class RegisterTest extends BaseTest {

    //  private static final Logger log = LoggerFactory.getLogger(RegisterTest.class);

    @Test(priority = 1)
    public void testExistEmail() throws FileNotFoundException
    {

        RegisterPage registerPage = homePage.clickSignUpButton();
        RegisterPage registerPage1 = registerPage.SignUpFeature

                (
                        dataModel().Register.name, dataModel().Register.email
                );

        String ActualResult =registerPage.GetValidationMessage();
        String ExpectedResult = dataModel().Register.validationmessage;
        assertEquals(ActualResult, ExpectedResult);
    }



    @Test(priority = 2)
    public void testRegister() throws FileNotFoundException
    {

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

        // HomePage homePage2= homePage.clickdeleteaccount();
        // LoginPage loginPage1 = homePage.clicklogout();

    }



}
