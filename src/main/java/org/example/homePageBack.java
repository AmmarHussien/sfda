package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class homePageBack {
    static WebDriver driver2;

    public homePageBack(WebDriver driver2) {
        homePageBack.driver2 = driver2;
    }

    public loginPageBack OpenBackOffice() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        driver2 = new ChromeDriver(options);
        driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        goBackoffice();
        return new loginPageBack(driver2);
    }
    public static void goBackoffice(){
        driver2.get("https://www.sfda-clinicaltrials.org/backoffice");
    }

    public createTaskInBack CreateTaskButton(){
        clickXpath("/html/body/app-root/app-layout/div/main/section/app-dashboard/div/div/div[3]/app-tasks-dashlet-table/div/div/div[2]/mat-table/mat-row[1]");
       return new createTaskInBack(driver2);
    }
    public  void clickXpath(String Xpath){
        driver2.findElement(By.xpath(Xpath)).click();
    }
}
