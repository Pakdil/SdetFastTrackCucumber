package com.sdetfastrack.tests;

import com.sdetfastrack.pages.VyTrackDashboardPage;
import com.sdetfastrack.pages.VyTrackLoginPage;
import com.sdetfastrack.utilities.ConfigurationReader;
import com.sdetfastrack.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class VrTrackDDTTest {

    VyTrackLoginPage loginPage = new VyTrackLoginPage();
    VyTrackDashboardPage dashboardPage = new VyTrackDashboardPage();

    @Before
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void loginDDTTest() throws IOException {

        String filepath = "VyTracQa2Users.xlsx";
        FileInputStream in = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet sheet = workbook.getSheet("data");

        for (int i = 0; i < sheet.getLastRowNum(); i++) {

            String userName = sheet.getRow(i).getCell(0).toString();
            String passWord = sheet.getRow(i).getCell(1).toString();
            String firstName = sheet.getRow(i).getCell(2).toString();
            String lastName = sheet.getRow(i).getCell(3).toString();

            loginPage.login(userName, passWord);

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
            wait.until(ExpectedConditions.visibilityOf(dashboardPage.fullName));


        }
        

    }
}
