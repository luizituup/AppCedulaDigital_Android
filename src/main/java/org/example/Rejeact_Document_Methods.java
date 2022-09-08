package org.example;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class Rejeact_Document_Methods extends Main {


    @BeforeTest
    public void setUp() throws MalformedURLException {
        Init();
    }

    @Test
    public void initCedulaDigital() throws InterruptedException {

        Flow_Rejeact_Document btns = new Flow_Rejeact_Document(driver, wait);

        btns.textCedula("11441861");

        btns.btnActualizar();

        btns.btnCloseDialogue();

        btns.btnNotificacions();

        btns.btnCancelNoThanskCopySecurity();

        btns.btnNotificacions();

        btns.btnListNotifications();

        btns.rejectionSelectMotivo();

    }

    @AfterTest
    public void close() {
        tearDown();
    }
}
