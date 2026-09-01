package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class proudectreview extends MethodHandles
{


    public proudectreview(WebDriver driver)
    {
        super(driver);
    }

         private final By ViewButton=By.cssSelector("a[href='/product_details/1']");

         private final By NameInput=By.cssSelector("[type='text']");

         private final By EmailInput=By.cssSelector("#email");

         private final By ReviewMessageInput=By.cssSelector("#review");

         private final By Submit=By.cssSelector("#button-review");

         private final By ValidMessage=By.xpath("//div[@class='alert-success alert']//span[contains(text(),'Thank you for your review.')]");



        public void ClickViewButton()
        {
            click(ViewButton,10);
        }

        public void InsertName(String name)
       {
        sendKeys(NameInput,name,10);
       }

        public void InsertEmail(String email)
      {
        sendKeys(EmailInput,email,10);
      }

        public void InsertReviewMessage(String review)
        {
        sendKeys(ReviewMessageInput,review,10);
        }

        public void clickSubmit( )
    {
        click(Submit,10);
    }

        public String GetSucess( )
    {
      return  getText(ValidMessage,10);
    }

        public void ReviewForm(String name,String email,String review)
        {
            ClickViewButton();
            InsertName(name);
            InsertEmail(email);
            InsertReviewMessage(review);
            clickSubmit();
       }

}
