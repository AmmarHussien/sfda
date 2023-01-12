package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePageBack {
    WebDriver driver;
    public homePageBack(WebDriver driver){
        this.driver = driver;
    }
//    public loginPage clickFormAuthentication() {
//        clickXpath("//*[@id=\"toolbar-lg\"]/mat-toolbar-row[1]/ul/li[2]");
//        return new loginPage(driver);
//    }
//
//    public createTask1 CreateEventButton(){
//        clickXpath("/html/body/app-root/div/div/div[2]/app-service-catalog/div/app-page/div/div/div/div/div/mat-drawer-container/mat-drawer-content/div[2]/div/div[1]/app-service-card[8]");
//        clickXpath("/html/body/app-root/div/div/div[2]/app-service-details/div/app-page/div/div/div/div/div[1]/div[2]/button");
//        return new createTask1(driver);
//    }
//    public  void clickXpath(String Xpath){
//        driver.findElement(By.xpath(Xpath)).click();
//    }
}
