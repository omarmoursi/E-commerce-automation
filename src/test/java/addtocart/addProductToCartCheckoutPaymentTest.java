

package addtocart;


import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class addProductToCartCheckoutPaymentTest extends BaseTest
{




    @Test
    public void TestAddToCart() throws InterruptedException, FileNotFoundException
    {


             LoginPage login= homePage.clickLoginButton();
             HomePage homePage1=login.LoginData
                      (
                        dataModel().Login.ValidCredintails.email,
                        dataModel().Login.ValidCredintails.Password
                     );

             AddProductToCart_Checkout_Payment addProductToCart_checkout_payment= homePage.clickAddProduct();

             AddToCartGetDataAndDeleteProductPage viewCartPage= addProductToCart_checkout_payment.AddProductsToCart();

             CheckOutPage checkOutPage =viewCartPage.clickCheckoutButton();

             PaymentPage paymentPage= checkOutPage.GoToPayment("ggggggggggg");

             paymentPage.InsertCardData
                     (

                    dataModel().Creditdata.nameoncard,
                    dataModel().Creditdata.cardnumber,
                    dataModel().Creditdata.cv,
                    dataModel().Creditdata.expiremonth,
                    dataModel().Creditdata.expireyear

                    );


        //     System.out.println(viewCartPage.getallfirstproductdat());
          //  viewCartPage.DeleteProduct();


    }


}
