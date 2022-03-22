package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
            if(app.user().isLogOutPresent()){
            app.user().logout();
        }
    }

    @Test
    public void loginSuccess(){
        app.user().openLoginForm();
        app.user().fillLoginForm("testerqa.lesh@gmail.com","Carro123$");
        app.user().submit();
        app.user().pause(1000);
        Assert.assertEquals(app.user().checkMessage(), "Logged in success");

    }

    @Test
    public void loginSuccessNew(){
        app.user().openLoginForm();
        app.user().fillLoginForm("testerqa.lesh@gmail.com","Carro123$");
        app.user().submit();
        app.user().pause(1000);
        Assert.assertEquals(app.user().checkMessage(), "Logged in success");

    }

    @AfterMethod
    public void postCondition(){
        app.user().submitOkButton();
    }
}