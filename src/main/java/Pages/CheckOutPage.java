package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends MethodHandles {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    private final By MessageField=By.xpath("//textarea[@name='message']");
    private final By PlaceOrderButton=By.xpath("//a[contains(text(),'Place Order')]");


    //a[contains(text(),'Place Order')]

    public void InsertMessage(String message)
    {

        sendKeys(MessageField,message,10);

    }

       public void ClickPlaceOrderButton(){

        click(PlaceOrderButton,10);
       }

       public PaymentPage GoToPayment(String message){
           InsertMessage(message);
           ClickPlaceOrderButton();
           return new PaymentPage(driver);

       }



}
