package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.regex.Pattern;

import static java.awt.SystemColor.window;

public class createTask1 {
    private final WebDriver driver;

    public createTask1(WebDriver driver){
        this.driver = driver;
    }

    private final By date = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div/input[2]");
    private final By selectDate = By.xpath("/html/body/div/div[2]/div/div[2]/div/span[10]");
    private final By inputOne = By.name("data[provideADescriptionOfTheDeviation]");
    private final By radioButtonOne = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[2]/div[2]/div[3]/div/div[2]/label/input");
    private final By radioButtonTow = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[2]/div[2]/div[5]/div/div[2]/label/input");
    private final By description = By.name("data[explain2]");
    private final By descriptionTwo = By.name("data[howHasThisDeviationAffectedTheSafetyOrIncreasedTheRisksToStudyParticipants]");
    private final By radioButtonThree = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[2]/div[2]/div[8]/div/div[2]/label/input");
    private final By descriptionFour = By.name("data[explain3]");
    private final By addData = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[2]/div[2]/div[10]/div[2]/div/div[1]/div[2]/div/button");
    private final By uploadFile = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[2]/div[2]/div[10]/div[2]/div/ul/li/div[1]/div/div[1]/div[1]/div/div/input");
    private final By fileName = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[2]/div[2]/div[10]/div[2]/div/ul/li/div[1]/div/div[1]/div[2]/div/input");
    private final By submit = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/div/app-section/div/div/div/div[2]/div/formio/div/div/div/div[2]/div[2]/div[12]/button");
    private final By taskId = By.xpath("/html/body/app-root/div/div/div[2]/app-request/app-page/div/div/div/div/app-result-info/div/div/div/div/div[2]/span[1]");
    public void setDate() {
        driver.findElement(date).click();
        driver.findElement(selectDate).click();
    }

    public void setInputOne (String Description) {
        driver.findElement(inputOne).sendKeys(Description);
        driver.findElement(radioButtonOne).click();
        driver.findElement(radioButtonTow).click();
    }

    public void setDescription (String Description) {
        driver.findElement(description).sendKeys(Description);
    }

    public void setDescriptionTwo (String Description) {
        driver.findElement(descriptionTwo).sendKeys(Description);
        driver.findElement(radioButtonThree).click();
    }

    public void setDescriptionFour (String Description) {
        driver.findElement(descriptionFour).sendKeys(Description);
    }


//    /**
//     * Provides path of file to the form then clicks upload button
//     * @param absolutePathOfFile The complete path of the file to upload
//     */
//    public void uploadFile (String absolutePathOfFile){
//        driver.findElement(addData).click();
//        driver.findElement(uploadFile).sendKeys(absolutePathOfFile);
//        driver.findElement(fileName).sendKeys("test");
//    }

    public void setSubmit () {
        driver.findElement(submit).click();
    }

    public void waitCreateTask(){
        FluentWait wait = new FluentWait( driver )
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchFieldException.class);
        wait.until(ExpectedConditions.textMatches(taskId, Pattern.compile("رقم الطلب ")));
    }

    public void goToBackOffice(){
        driver.switchTo().newWindow(WindowType.WINDOW);
        //driver.get("https://www.sfda-clinicaltrials.org/backoffice");
        //driver.navigate().to("https://www.sfda-clinicaltrials.org/backoffice");
    }

}
