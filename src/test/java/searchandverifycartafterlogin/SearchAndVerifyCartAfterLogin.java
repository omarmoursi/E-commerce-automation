package searchandverifycartafterlogin;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchProductsandVerifyCartAfterLogin;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class SearchAndVerifyCartAfterLogin extends BaseTest {



    @Test
    public void testsearchandveifyafterlogin() throws FileNotFoundException {


        SearchProductsandVerifyCartAfterLogin searchAndVerifyCartAfterLogin= homePage.clickSearchVerifyCartAfterLogin();

        searchAndVerifyCartAfterLogin.SearchToView( dataModel().sreachproudects.MenTshirt );

        LoginPage loginPage= searchAndVerifyCartAfterLogin.ClickLoginButton();

        HomePage homePage20= loginPage.LoginData
                (
                dataModel().Login.ValidCredintails.email,
                dataModel().Login.ValidCredintails.Password
                );
        searchAndVerifyCartAfterLogin.ClickCartButton();


    }













}
