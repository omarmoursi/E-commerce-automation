package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends MethodHandles
{

    public HomePage(WebDriver driver) {super(driver);}



    private final By         SignUpAndLogin=By.linkText("Signup / Login");
    private final By         LogOutButton=By.linkText("Logout");
    private final By         DeleteAccount=By.xpath("//a[contains(text(),'Delete Account')]");
    private final By         PageVisible=By.xpath("//title[contains(text(),'Automation Exercise')]");
    private final String     Title = driver.getTitle();

    private final By        WomenCategory=By.xpath("/html/body/section[2]/div/div/div[1]/div/div[1]/div[1]/div[1]/h4/a/span/i");
    private final By        MenCategory=By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/h4/a/span/i");


    private final By       ProductsButton=By.xpath(" //a[contains(text(),' Products')]");
    private final By       FilterByCategory=By.cssSelector("a[href='#Women']");
    private final By       ProductForBrand=By.xpath(" //a[contains(text(),' Products')]");
    private final By       SearchVerifyCartAfterLogin=By.xpath("//a[contains(text(),' Products')]");
    private final By       RegisterWhileCheckout=By.xpath(" //a[contains(text(),' Products')]");
    private final By       ContactUsButton=By.cssSelector("a[href='/contact_us']");
    private final By       ProductReview=By.cssSelector("a[href='/products']");
    private final By       Home=By.xpath("//a[contains(text(),' Home')]");


    public AddToCartGetDataAndDeleteProductPage clickAddToCartGetDataAndDeleteProductPage()
    {
        click(ProductsButton,20);
        return new AddToCartGetDataAndDeleteProductPage(driver);
    }

    public proudectreview clickProductReview()
    {
        click(ProductReview,20);
        return new proudectreview(driver);
    }


    public ContactUsPage clickContactUsButton()
    {
        click(ContactUsButton,20);
        return new ContactUsPage(driver);
    }

    public RegisterwhileCheckout clickRegisterWhileCheckout()
    {
        click(RegisterWhileCheckout,7);
        return new RegisterwhileCheckout(driver);
    }

    public SearchProductsandVerifyCartAfterLogin clickSearchVerifyCartAfterLogin()
    {
        click(SearchVerifyCartAfterLogin,10);
        return new SearchProductsandVerifyCartAfterLogin(driver);
    }


    public Filter_by_category clickFilterByCategory()
    {
        click(FilterByCategory,10);
        return new Filter_by_category(driver);
    }

    public Filter_by_Brand clickProductForBrand()

    {
        click(ProductForBrand,10);
        return new Filter_by_Brand(driver);
    }



    public product_details clickprVeifyoudects()
    {
        click(ProductsButton,10);
        return new product_details(driver);
    }

    public SearchProduct clickProductsButton()
    {
        click(ProductsButton,10);
        return new SearchProduct(driver);
    }


    public AddProductToCart_Checkout_Payment clickAddProduct()
    {
        click(ProductsButton,4);
        return new AddProductToCart_Checkout_Payment(driver);
    }

    public void clickWomenCategory()
    {

        click(WomenCategory,10);
    }
    public void clickMenCategory()
    {

        click(MenCategory,10);
    }


    public LoginPage clickLoginButton()
    {
            click(SignUpAndLogin,15);
            return  new LoginPage(driver);
    }


    public LoginPage clicklogout()
    {
        click(LogOutButton,10);
        return new LoginPage(driver);
    }

    public RegisterPage clickSignUpButton()
    {
        click(SignUpAndLogin,15);
        return  new RegisterPage(driver);
    }

    public HomePage clickDeleteAccount(){
        click(DeleteAccount,10);
        return new HomePage(driver);
    }

    public String  home_page_is_visible()
    {
      return   getText(PageVisible,15);
    }

   public String gettitle(){
       return Title;
   }



  /*
    public ViewCatgoryAndBrandProudects clickaddproudect(){
        click(proudects,10);
        return new ViewCatgoryAndBrandProudects(driver);
    }
*/



}
