package com.mccollege.student.amazon.homepage.safari;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mccollege.student.amazon.AmazonHelper;
import com.mccollege.student.util.SeleniumTestHelper;

@SpringBootTest
public class HomePageElementsExistSafariTest {

    WebDriver myWebDriver;

    @BeforeEach
    public void setup(){
        // create webdriver
        this.myWebDriver = new SafariDriver();
    }

    @AfterEach
    public void cleanup(){

        // close/quit browser connection
        this.myWebDriver.quit();
    }


    @Test
    public void safari_amazon_homepage_top_navbar_exists() throws Exception{


        // build list of element queries
        final List<By> myElementSearchBys = new ArrayList<By>();
        myElementSearchBys.add(By.id("navbar"));

        // verify elements exists
        SeleniumTestHelper.webdriver_element_exists(this.myWebDriver, AmazonHelper.PAGE_URL_HOME, myElementSearchBys);

    }


    @Test
    public void safari_amazon_homepage_navbar_search_exists() throws Exception{


        // build list of element queries
        final List<By> myElementSearchBys = new ArrayList<By>();
        myElementSearchBys.add(By.id("twotabsearchtextbox"));

        // verify elements exists
        SeleniumTestHelper.webdriver_element_exists(this.myWebDriver, AmazonHelper.PAGE_URL_HOME, myElementSearchBys);

    }


    @Test
    public void safari_amazon_homepage_main_navbar_elements_exists() throws Exception{


        // build list of element queries
        final List<By> myElementSearchBys = new ArrayList<By>();
        myElementSearchBys.add(By.id("navbar"));
        myElementSearchBys.add(By.id("twotabsearchtextbox"));
        myElementSearchBys.add(By.id("icp-nav-flyout"));
        myElementSearchBys.add(By.id("nav-link-accountList"));
        myElementSearchBys.add(By.id("nav-orders"));
        myElementSearchBys.add(By.id("nav-cart"));

        // verify elements exists
        SeleniumTestHelper.webdriver_element_exists(this.myWebDriver, AmazonHelper.PAGE_URL_HOME, myElementSearchBys);

    }
}
