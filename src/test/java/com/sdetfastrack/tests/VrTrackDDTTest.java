package com.sdetfastrack.tests;

import com.sdetfastrack.pages.VyTrackDashboardPage;
import com.sdetfastrack.pages.VyTrackLoginPage;
import com.sdetfastrack.utilities.ConfigurationReader;
import com.sdetfastrack.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void loginDDTTest() {


    }
}
