package login;

import base.BaseTests;
import org.testng.annotations.Test;

import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessLogin(){
        loginPage.clickLoginPreButton1();
        loginPage.clickLoginPreButton2();
        loginPage.setToiFrame();
        loginPage.setUsername();
        loginPage.setPassword();
        loginPage.clickLoginButton();
        loginPage.waitTimePreButton1();
        loginPage.clickLoginPreButton1();
        assertTrue(loginPage.getOnPageAlert().contains("Welcome"),"Alert text is incorrect");
        /*loginPage.clickLogoutPostButton();
        loginPage.clickLoginButton();
        loginPage.waitTimePreButton1();
        assertEquals(loginPage.getOnPageAlertLogOutSuccesfull(),"Welcome!","Alert text is incorrect");*/
    }
}
