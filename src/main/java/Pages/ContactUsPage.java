package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class ContactUsPage extends MethodHandles {


    public ContactUsPage(WebDriver driver)  {
        super(driver);
    }


    private final By NameField=By.cssSelector("[data-qa='name']");

    private final By EmailField=By.cssSelector("[data-qa='email']");

    private final By SubjectField=By.cssSelector("[data-qa='subject']");

    private final By MessageField=By.cssSelector("[data-qa='message']");

    private final By UploadFileButton = By.name("upload_file");


    private final By SubmitButton=By.cssSelector("[name='submit']");

    private final By GetSuccessMessage=By.xpath("//div[contains(@class,'status alert alert-success')]");



    public  void InsertName(String name){sendKeys(NameField,name,15);}

    public  void InsertEmail(String email){sendKeys(EmailField,email,10);}

    public  void InsertSubject(String subject){sendKeys(SubjectField,subject,10);}

    public  void InsertMessage(String message){sendKeys(MessageField,message,10);}

    public void uploadFile(String filePath)
    {
    WebElement fileInput = driver.findElement(UploadFileButton);
    fileInput.sendKeys(filePath);
    }


    public  void clickSubmit( ){click(SubmitButton,10);}

    public  String GetSuccess( ){return   getText(GetSuccessMessage,10);
    }

    public  void ContactForm(String name,String email,String subject,String message,String filePath)
    {

        InsertName(name);
        InsertEmail(email);
        InsertSubject(subject);
        InsertMessage(message);
        uploadFile(filePath);
        clickSubmit( );
        acceptAlert();
    }



}
