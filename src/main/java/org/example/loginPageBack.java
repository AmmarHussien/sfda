package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageBack {
    static WebDriver driver;

    public loginPageBack(WebDriver driver) {
        loginPageBack.driver = driver;
    }

    private final By userNameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.name("login");

    public void setUserName( String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }
    public void setPassword( String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }


}
