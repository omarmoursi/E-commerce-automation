package productdetails;

import Base.BaseTest;
import Pages.product_details;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertEquals;
import static reader.ReadDataFromJson.dataModel;

public class ProductDetailsTest extends BaseTest {

    @Test
    public void TestProductDetails() throws FileNotFoundException
    {


        product_details product_details= homePage.clickprVeifyoudects();
        product_details.clickfirstproudect();

        String expected = dataModel().proudectdetails.name
                + dataModel().proudectdetails.catogory
                + dataModel().proudectdetails.price
                + dataModel().proudectdetails.avilabilty
                + dataModel().proudectdetails.condtion
                + dataModel().proudectdetails.brand;

        String actual = String.valueOf(product_details.getallproudectdetails());

        Assert.assertEquals(actual, expected);

    }

    }



