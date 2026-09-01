package Login;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertEquals;
import static reader.ReadDataFromJson.dataModel;


public class LoginTest extends BaseTest {


    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test(priority = 1)
    public void TestSucessLogin() throws FileNotFoundException
    {

        LoginPage login= homePage.clickLoginButton();
        HomePage homePage1=login.LoginData
                (
                dataModel().Login.ValidCredintails.email,
                dataModel().Login.ValidCredintails.Password
                );
        LoginPage loginPage1 = homePage.clicklogout();
     // HomePage homePage2= homePage.clickdeleteaccount();
    }


    @Test(priority = 2)
    public void TestInvalidUser() throws FileNotFoundException
    {
        LoginPage login= homePage.clickLoginButton();
        HomePage homePage1=login.LoginData
                (

                dataModel().Login.InvalidCredintails.InvalidUsername.email,
                dataModel().Login.InvalidCredintails.InvalidUsername.Password

                );

        String ActualResult1=login.GetValidationMessage();
        String ExpectedResult1=dataModel().Login.InvalidCredintails.InvalidUsername.validationmessage;
        assertEquals(ActualResult1,ExpectedResult1);
    }


    @Test(priority = 3)
    public void TestInvalidPassword() throws FileNotFoundException
    {

        LoginPage login= homePage.clickLoginButton();
        HomePage homePage1=login.LoginData
                (

                        dataModel().Login.InvalidCredintails.InvalidPassword.email,
                        dataModel().Login.InvalidCredintails.InvalidPassword.Password

                );

        String ActualResult2=login.GetValidationMessage();
        String ExpectedResults2=dataModel().Login.InvalidCredintails.InvalidPassword.validationmessage;
        assertEquals(ActualResult2,ExpectedResults2);

    }


}
