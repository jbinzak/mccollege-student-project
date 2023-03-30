package com.mccollege.student.amazon.homepage.safari;

import org.junit.jupiter.api.AfterEach;

import java.time.Duration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.springframework.boot.test.context.SpringBootTest;

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
        WebElement myTextInputElement = this.myWebDriver.findElement(myTextInputSearchBy);

        // set value
        myTextInputElement.sendKeys("java textbook");

        // query object
        By mySearchSubmitButtonBy = By.id("nav-search-submit-button");

        // get element
        WebElement mySearchSubmitElement = this.myWebDriver.findElement(mySearchSubmitButtonBy);

        // click button
        mySearchSubmitElement.click();

        // query object
        By mySearchResultWidgetBy = By.className("s-result-list");
       
        // Waiting 30 seconds for an element to be present on the page, checking for its presence once every 5 seconds.
        // https://www.selenium.dev/documentation/webdriver/waits/
        Wait<WebDriver> myWait = new FluentWait<WebDriver>(this.myWebDriver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);

        // get object via wait
        WebElement mySearchResultElement = myWait.until(driver -> {
            return driver.findElement(mySearchResultWidgetBy);
        });

        // verify element exists
        Assertions.assertThat(mySearchResultElement).isNotNull();
    }

}
