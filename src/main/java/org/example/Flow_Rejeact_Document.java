package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Flow_Rejeact_Document {

    private AppiumDriver driver;
    private WebDriverWait wait;

    public Flow_Rejeact_Document(AppiumDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    @AndroidFindBy(id ="tiet_document_number")
    AppiumDriver<MobileElement> cedula;

    public void textCedula(String cedulaText) {
        List<MobileElement> cedula = this.driver.findElements(By.id("tiet_document_number"));


    }
    public void btnActualizar() {
        List<MobileElement> btnActualizar = this.driver.findElements(By.id("btn_update_document_number"));
        if (!btnActualizar.isEmpty() && btnActualizar != null)
            btnActualizar.get(0).click();
    }

    public void btnCloseDialogue() throws InterruptedException {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iv_close_dialog")));
            List<MobileElement> btnCloseDialogue = this.driver.findElements(By.id("iv_close_dialog"));
                btnCloseDialogue.get(0).click();
    }
    public void btnListNotifications(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.view.ViewGroup")));
        List<MobileElement> btnListNotifications = this.driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.view.ViewGroup"));
        if (!btnListNotifications.isEmpty() && btnListNotifications != null)
            btnListNotifications.get(0).click();
    }

    public void btnNotificacions(){
        List<MobileElement> btnNotifications = this.driver.findElements(By.id("notificationInboxFragment"));
        if (!btnNotifications.isEmpty() && btnNotifications != null)
            btnNotifications.get(0).click();
    }

    public void rejectionSelectMotivo() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_reject")));
        MobileElement rejectionNotification = (MobileElement) this.driver.findElement(By.id("btn_reject"));
        rejectionNotification.click();

        Thread.sleep(1000);
        List<MobileElement> selectMotivateRejection = this.driver.findElements(By.id("actv"));
        if (!selectMotivateRejection.isEmpty() && selectMotivateRejection != null)
            selectMotivateRejection.get(0).click();
        Thread.sleep(2000);
    }
    public void btnCancelNoThanskCopySecurity() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_cancel")));
        MobileElement btnCancelNoThanskCopySecurity = (MobileElement) this.driver.findElement(By.id("btn_cancel"));
        btnCancelNoThanskCopySecurity.click();
    }


    public void signatureNotification() {
        List<MobileElement> signatureNotification = this.driver.findElements(By.id("tiet_document_number"));
        if (!signatureNotification.isEmpty() && signatureNotification != null)
            signatureNotification.get(0).click();
    }

    public void rejectionDocument() {
        List<MobileElement> rejectionDocument = this.driver.findElements(By.id("tiet_document_number"));
        if (!rejectionDocument.isEmpty() && rejectionDocument != null)
            rejectionDocument.get(0).click();
    }

    public void signatureDocument() {
        List<MobileElement> rejectionDocument = this.driver.findElements(By.id("tiet_document_number"));
        if (!rejectionDocument.isEmpty() && rejectionDocument != null)
            rejectionDocument.get(0).click();
    }

}
