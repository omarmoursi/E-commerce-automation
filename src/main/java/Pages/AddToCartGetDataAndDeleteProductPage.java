package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartGetDataAndDeleteProductPage extends MethodHandles {
    public AddToCartGetDataAndDeleteProductPage(WebDriver driver) {

        super(driver);

    }

       private final By ViewFirstProduct=By.cssSelector("a[href='/product_details/1']");
       private final By AddToCart=By.xpath("//button[@class='btn btn-default cart']");
       private final By ViewCart=By.xpath("//u[contains(text(),'View Cart')]");


       private final By FirstProductName=By.xpath("//td[@class='cart_description']//h4//a[contains(text(),'Blue Top')]");
       private final By FirstProductPrice=By.xpath("//tr[@id='product-1']//p[contains(text(),'Rs. 500')]");
       private final By FirstProductQuantity=By.xpath("//tr[@id='product-1']//button[contains(text(),'1')]");
       private final By FirstProductTotalPrice=By.xpath("//tr[@id='product-1']//p[@class='cart_total_price']");



       private final By ContinueButton=By.xpath("//button[@data-dismiss='modal']");
       private final By DeleteProduct = By.xpath("//tr[@id='product-1']//a[@class='cart_quantity_delete']");

       //this button for ad and paymentPage
       private final By CheckOutButton=By.xpath("//a[@class='btn btn-default check_out']");




      public void ClickViewCart() {click(ViewCart,10);}

      public void ClickViewFirstProduct() {click(ViewFirstProduct,10);}

      public void ClickAddToCart() {click(AddToCart,10);}

      public void ClickContinueButtonFirst() {click(ContinueButton,10);}

      public String GetFirstProductName() {return getText(FirstProductName, 10);}



      public String GetFirstProductPrice() {return   getText(FirstProductPrice,10);}


      public String GetFirstProductQuantity(){return   getText(FirstProductQuantity,10);}

      public String GetFirstProductTotalPrice(){return   getText(FirstProductTotalPrice,10);}


      public String getallfirstproductdat()

      {
      return  "Description :"+GetFirstProductName()+"\n"+
              "Price :"+GetFirstProductPrice()+"\n"+
              "Quantity :"+GetFirstProductQuantity()+"\n"+
              "Total price :"+GetFirstProductTotalPrice();
      }

      public void clickdeleteproudect() {
        click(DeleteProduct, 10);

     }

     public void DeleteProduct()
     {
          clickdeleteproudect();
     }

    public CheckOutPage clickCheckoutButton(){
        click(CheckOutButton,10);
            return new CheckOutPage(driver);
    }

}
