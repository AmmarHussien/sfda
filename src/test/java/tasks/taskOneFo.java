package tasks;

import base.mainSetup;
import org.example.createTaskInBack;
import org.example.loginPageBack;
import org.testng.annotations.Test;

public class taskOneFo extends mainSetup {

    @Test
    public  void chooseTaskOne(){
//        loginPage loginPage =  homePageFo.clickFormAuthentication();
//        loginPage.setUserName("10626");
//        loginPage.setPassword("10626");
//        loginPage.clickLoginButton();
//        createTask1 createTask1 = homePageFo.CreateEventButton();
//        createTask1.setDate();
//        createTask1.setInputOne("testttt");
//        createTask1.setDescription("tesstt");
//        createTask1.setDescriptionTwo("tewsst");
//        createTask1.setDescriptionFour("yessssssssssssssssss");
//        //createTask1.uploadFile("/Users/ammarhussien/Downloads/ETEC.pdf");
//        createTask1.setSubmit();
//        createTask1.waitCreateTask();
        loginPageBack loginPageBack =  homePageBack.OpenBackOffice();
        loginPageBack.setUserName("supervisor1");
        loginPageBack.setPassword("supervisor1");
        loginPageBack.clickLoginButton();
        createTaskInBack createTaskInBack = homePageBack.CreateTaskButton();
        createTaskInBack.ClickAssignToMeButton();
        createTaskInBack.setConfirm();
        createTaskInBack.setDescription("Hello dslksdjkds dskljdslkjsdlkjds dslkjsdlkjsdlkjsdlk");
        createTaskInBack.setAccept();
        createTaskInBack.setSendAndSave();
        createTaskInBack.setConfirmTask();
    }

}
