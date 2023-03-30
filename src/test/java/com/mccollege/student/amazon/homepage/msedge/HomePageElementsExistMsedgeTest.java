package com.mccollege.student.amazon.homepage.msedge;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.mccollege.student.amazon.AmazonHelper;
import com.mccollege.student.util.SeleniumTestHelper;

@SpringBootTest
public class HomePageElementsExistMsedgeTest {

    WebDriver myWebDriver;

    @BeforeEach
    public void setup(){

        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/.drivers/msedgedriver");
    
        // create webdriver
        this.myWebDriver = new EdgeDriver();
    }

    @AfterEach
    public void cleanup(){

        // close/quit browser connection
        this.myWebDriver.quit();
    }

    @Test
    public void msedge_amazon_homepage_main_navbar_elements_exists() throws Exception{
        AmazonHelper.amazon_homepage_main_navbar_elements_exists(this.myWebDriver);
    }

}
