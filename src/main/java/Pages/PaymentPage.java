package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage  extends MethodHandles {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

        private final By NameOnCartInput=By.xpath("//input[@name='name_on_card']");

        private final By CardNumberInput=By.xpath("//input[@data-qa='card-number']");

        private final By CvInput=By.xpath("//input[@name='cvc']");

        private final By ExpiryMonthInput=By.xpath("//input[@name='expiry_month']");

        private final By ExpiryYearInput=By.xpath("//input[@data-qa='expiry-year']");

        private final By payButton=By.xpath("//button[@data-qa='pay-button']");

        private final By DownloadInvoiceButton=By.xpath("//a[contains(text(),'Download Invoice')]");


        public void InsertNameOnCart(String NameOnCart)
        {
            sendKeys(NameOnCartInput,NameOnCart,10);
        }

       public void InsertCardNumber(int CardNumber)
       {
        sendKeys(CardNumberInput, String.valueOf(CardNumber),10);
       }

       public void InsertCvInput(int Cv)
       {
        sendKeys(CvInput, String.valueOf(Cv),10);
       }

      public void InsertExpiryMonth(int ExpiryMonth)
      {
        sendKeys(ExpiryMonthInput, String.valueOf(ExpiryMonth),10);
      }

      public void InsertExpiryYearInput(int ExpiryYear)
      {
        sendKeys(ExpiryYearInput, String.valueOf(ExpiryYear),10);
      }

     public void ClickPayButton( )
      {
        click(payButton,10);
      }


    public void ClickDownloadInvoiceButton( )
     {
        click(DownloadInvoiceButton,10);
     }

    public void InsertCardData(String NameOnCart,int CardNumber,int Cv,
                               int ExpiryMonth,int ExpiryYear)
    {
        InsertNameOnCart(NameOnCart);
        InsertCardNumber(CardNumber);
        InsertCvInput(Cv);
        InsertExpiryMonth(ExpiryMonth);
        InsertExpiryYearInput(ExpiryYear);
        ClickPayButton();
        ClickDownloadInvoiceButton();
    }



}
