package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class RegisterPage extends MethodHandles {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }





    //SignUpLocators
    private final By  SignUpnName=By.cssSelector("[data-qa='signup-name']");
    private final By  SignUpEmail=By.cssSelector("[data-qa='signup-email']");
    private final By  SignUp_Button=By.xpath("//button[@data-qa='signup-button']");
    private final By  ValidationMessage=By.xpath("//p[contains(text(),'Email Address already exist!')]");
    private final String Title = driver.getTitle();


    //NameAndEmailInRegisterLocators
    private final By  NameInRegister=By.cssSelector("#name");
    private final By  EmailInRegister=By.cssSelector("#email");


    //RegisterLocator
    private final By  Gender = By.cssSelector("#id_gender1");

    private final By  Password = By.cssSelector("#password");
    private final By  Days = By.cssSelector("#days");
    private final By  Months = By.cssSelector("#months");

    private final By  Years = By.cssSelector("#years");
    private final By  Newsletter = By.cssSelector("#newsletter");
    private final By  Receive_SpecialOffersFromOur_partners = By.cssSelector("#optin");
    private final By  Firstname = By.cssSelector("#first_name");
    private final By  Lastname = By.cssSelector("#last_name");
    private final By  Company = By.cssSelector("#company");
    private final By  Address = By.cssSelector("#address1");
    private final By  Address2 = By.cssSelector("#address2");
    private final By  Country = By.cssSelector("#country");
    private final By  State = By.cssSelector("#state");
    private final By  City = By.cssSelector("#city");
    private final By  Zipcode = By.cssSelector("#zipcode");
    private final By  Mobile_number = By.cssSelector("#mobile_number");
    private final By  CreateAccountButton = By.xpath("//button[contains(text(),'Create Account')]");


    //validate signup page is visible
    public String GetTitle() {return Title;}


    //SignupFunctions
    private void InsertSignUpName(String name) {sendKeys(SignUpnName,name,10 );}
    private void InsertSignUpEmail(String email) {sendKeys(SignUpEmail,email,10 );}
    private void ClickSignup_Button(){click(SignUp_Button,10);}



    public RegisterPage SignUpFeature(String name, String email)
    {
        InsertSignUpName(name);
        InsertSignUpEmail(email);
        ClickSignup_Button();
        return new RegisterPage(driver);
    }

    //validate message
    public String GetValidationMessage()
    {

        return   getText(ValidationMessage,10);

    }


    //NameAndEmailFunctions
    private String GetName(String name){return  getText(NameInRegister,10);}
    private String GetEmail(String email){return  getText(EmailInRegister,10);}

    public void GetNameAndEmail(String name,String email)
    {
        GetName(name);
        GetEmail(email);
    }

   //SignUpFunctions

    private void  selectGender()
    {
        click(Gender,15);
    }
    public void   InsertPassword(String pass)
   {
        sendKeys(Password,pass,10);
   }
    public void   selectDay(String day)
    {
        selectByValue(Days,10,day);
    }
    public void   selectMonth(String mon)
    {
        selectByVisibleText(Months,10,mon);
    }
    public void   selectYear(String year )
    {
        selectByValue(Years,10,year);
    }

    private void  clickNewsletter()
    {
        click(Newsletter,10);
    }
    private void  clickReceive_SpecialOffersFromOur_partners()
    {
        click(Receive_SpecialOffersFromOur_partners,10);
    }

    private void  insertFirstname(String first){
       sendKeys(Firstname,first,10);
   }
    private void  insertLastname(String last){
        sendKeys(Lastname,last,10);
    }
    private void  insertCompany(String comp){
        sendKeys(Company,comp,10);
    }
    private void  insertAddress(String addr1){
        sendKeys(Address,addr1,10);
    }
    private void  insertAddress2(String addr2){
        sendKeys(Address2,addr2,10);
    }
    private void  SelectCountry(String countries){
        selectByVisibleText(Country,10,countries);
    }
    private void  InsertState(String states){
        sendKeys(State,states,10);
    }
    private void  InsertCity(String cites){
        sendKeys(City,cites,10);
    }
    private void  InsertZip(String zcode){
        sendKeys(Zipcode,zcode,10);
    }
    private void  InsertMobileNum(String mobile){
        sendKeys(Mobile_number,mobile,10);
    }
    private void  clickCreateAccountButton(){
        click(CreateAccountButton,10);
    }
    //account_created

  public Account_Created CreateAccountFeature
          (String pass,String day,String mon,String year,String first,String last,String comp,String addr1,
           String addr2,String countries,String states,String cites,String zcode,String mobile

          )

  {
      selectGender();
      InsertPassword(pass);
      selectDay(day);
      selectMonth(mon);
      selectYear(year);
      clickNewsletter();
      clickReceive_SpecialOffersFromOur_partners();
      insertFirstname(first);
      insertLastname(last);
      insertCompany(comp);
      insertAddress(addr1);
      insertAddress2(addr2);
      SelectCountry(countries);
      InsertState(states);
      InsertCity(cites);
      InsertZip(zcode);
      InsertMobileNum(mobile);
      clickCreateAccountButton();
      return new Account_Created(driver);

  }





}