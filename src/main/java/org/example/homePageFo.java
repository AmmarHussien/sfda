package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class homePageFo {
    WebDriver driver;
    public homePageFo(WebDriver driver){
        this.driver = driver;
    }
    public loginPage clickFormAuthentication() {
        clickXpath("/html/body/app-root/div/div/app-header/div/mat-toolbar/mat-toolbar-row[1]/ul/li[2]/div/mat-icon");
        //clickXpath("/html/body/app-root/div/div/app-header/div/mat-toolbar/mat-toolbar-row[1]/ul/li[2]/div/mat-icon");
        return new loginPage(driver);
    }

    public createTask1 CreateEventButton(){
        clickXpath("/html/body/app-root/div/div/div[2]/app-service-catalog/div/app-page/div/div/div/div/div/mat-drawer-container/mat-drawer-content/div[2]/div/div[1]/app-service-card[8]");
        clickXpath("/html/body/app-root/div/div/div[2]/app-service-details/div/app-page/div/div/div/div/div[1]/div[2]/button");
        return new createTask1(driver);
    }

    protected homePageBack homePageBack;

    WebDriver driver2;
    public void setUpBackOffice(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        driver2 = new ChromeDriver(options);
        goBackoffice();
    }

    public void goBackoffice(){
        homePageBack = new homePageBack(driver2);
        driver2.get("https://www.sfda-clinicaltrials.org/backoffice");
    }

    public  void clickXpath(String Xpath){
        driver.findElement(By.xpath(Xpath)).click();
    }
}