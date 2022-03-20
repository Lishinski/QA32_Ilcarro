package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration extends TestBase{
    @BeforeMethod
    public void preCondition(){
        if(app.user().isLogOutPresent()){
            app.user().logOut();
        }
    }

    @Test
    public void registrationSuccess()
    {
        int index =(int)(System.currentTimeMillis()/1000)%36000;

        app.user().openRegistrationForm();
        app.user().fillRegistrationForm("Lia","Snow","lia" +index+ "@gmail.com","Llia12345$");
        //app.user().checkPolicy();
        app.user().checkPolicyXY();
        app.user().submit();
    }
}
