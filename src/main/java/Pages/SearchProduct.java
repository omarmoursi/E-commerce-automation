package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchProduct extends MethodHandles {


    public SearchProduct(WebDriver driver) {
        super(driver);
    }




      private final By SearchField=By.cssSelector("#search_product");

      private final By SearchButton=By.xpath("//button[@id='submit_search']");


      private final By ProductNames = By.xpath("//div[contains(@class,'productinfo')]//p");



     public void InsertSearchProduct(String ProductName) {sendKeys(SearchField,ProductName,10);}

     public void ClickSearchButton()
    {
        click(SearchButton,10);
    }


     public void search(String ProdName)
     {
        InsertSearchProduct(ProdName);
        ClickSearchButton();
     }


    // Get input value
    public String getSearchText()
    {
        return driver.findElement(SearchField).getAttribute("value");
    }


    // Get all product names from search results

    public List<String> getProductNames() {
        return driver.findElements(ProductNames)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }





}
