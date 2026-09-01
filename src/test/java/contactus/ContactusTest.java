package contactus;

import Base.BaseTest;
import Pages.ContactUsPage;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertEquals;
import static reader.ReadDataFromJson.dataModel;

public class ContactusTest extends BaseTest {


     @Test
    public void testcontactus() throws FileNotFoundException {


        ContactUsPage contactUsPage= homePage.clickContactUsButton();

        contactUsPage.ContactForm(

                dataModel().contactus.name,
                dataModel().contactus.email,
                dataModel().contactus.subject,
                dataModel().contactus.message,
                dataModel().contactus.filePath


                );

         String Actualresult2=contactUsPage.GetSuccess();
         String ExpectedRsults2=dataModel().contactus.text;
         assertEquals(Actualresult2,ExpectedRsults2);





     }






}
