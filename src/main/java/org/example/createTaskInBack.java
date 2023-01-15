package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createTaskInBack {
    private final WebDriver driver;

    public createTaskInBack(WebDriver driver) {
        this.driver = driver ;
    }

    private final By assignToMeButton = By.xpath("/html/body/app-root/app-layout/div/main/section/app-tasks/app-task-edit/span/div/div/div[1]/div/div[1]/div[1]/app-dropdown/div/button");
    private final By confirm = By.xpath("/html/body/ion-alert/div[2]/div[3]/button[1]");

    private final By accept = By.xpath("/html/body/app-root/app-layout/div/main/section/app-tasks/app-task-edit/span/div/div/div[1]/div/formio/div/div/div/div[5]/div[2]/div[2]/div/div[5]/label/input");

    private final By sendAndSave = By.xpath("/html/body/app-root/app-layout/div/main/section/app-tasks/app-task-edit/span/div/div/div[1]/div/div[2]/div/button[1]");

    private final By wordWait = By.xpath("/html/body/app-root/app-layout/div/main/section/app-tasks/app-task-edit/span/div/div/div[1]/div/formio/div/div/div/div[5]/div[1]/h4/text()");
    private final By descriptions = By.xpath("/html/body/app-root/app-layout/div/main/section/app-tasks/app-task-edit/span/div/div/div[1]/div/formio/div/div/div/div[5]/div[2]/div[1]/div/textarea");
    private final By confirmTask = By.xpath("/html/body/ion-alert/div[2]/div[3]/button[1]");
    public void ClickAssignToMeButton() {
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ignored){
        }
        driver.findElement(assignToMeButton).click();
    }

    public void setConfirm() {
        driver.findElement(confirm).click();

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ignored){
        }
    }

    public void setDescription (String description) {
        driver.findElement(descriptions).click();
        driver.findElement(descriptions).sendKeys(description);
    }
    public void setAccept() {
        driver.findElement(accept).click();
    }

    public void setSendAndSave() {
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ignored){
        }
        driver.findElement(sendAndSave).click();
    }
    public void setConfirmTask() {
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException ignored){
        }
        driver.findElement(confirmTask).click();
    }
}
