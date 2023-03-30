package com.mccollege.student.amazon.homepage.safari;

import org.junit.jupiter.api.AfterEach;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

import com.mccollege.student.amazon.AmazonHelper;

@SpringBootTest
public class HomePageSearchSubmissionSafariTest {
    

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
    public void safari_amazon_homepage_user_can_perform_basic_search() throws Exception{

        // get page
        this.myWebDriver.get(AmazonHelper.PAGE_URL_HOME);

        // query object
        By myTextInputSearchBy = By.id("twotabsearchtextbox");

        // get element
        WebElement myTextInputElement = myWebDriver.findElement(myTextInputSearchBy);

        // set value
        myTextInputElement.sendKeys("java textbook");

        // query object
        By mySearchSubmitButtonBy = By.id("nav-search-submit-button");

        // get element
        WebElement mySearchSubmitElement = myWebDriver.findElement(mySearchSubmitButtonBy);

        // click button
        mySearchSubmitElement.click();

        // query object
        By mySearchResultWidgetBy = By.className("template=SEARCH_RESULTS");

        // get element
        List<WebElement> mySearchResultWidgetElements = myWebDriver.findElements(mySearchResultWidgetBy);

         // verify results
         Assert.assertEquals(true, mySearchResultWidgetElements !=  null && mySearchResultWidgetElements.size() > 0);

    }

}
