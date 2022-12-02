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





    }
}
