package login;

import base.mainSetup;
import org.example.loginPage;
import org.testng.annotations.Test;

public class SuccessfulLogin  extends mainSetup {

    @Test
    public  void testSuccessfulLogin(){
        loginPage loginPage=  homePageFo.clickFormAuthentication();
        loginPage.setUserName("10626");
        loginPage.setPassword("10626");
        loginPage.clickLoginButton();
    }

}
