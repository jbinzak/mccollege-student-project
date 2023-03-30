package com.mccollege.student.amazon;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mccollege.student.util.SeleniumTestHelper;

public class AmazonHelper {
    
    public static String PAGE_URL_HOME = "https://www.amazon.com/";

    public static By getFirstNameSearchBy(){
        return By.id("inf_field_FirstName");
    }


    public static void amazon_homepage_main_navbar_elements_exists(WebDriver webDriver) throws Exception{

        // build list of element queries
        final List<By> myElementSearchBys = new ArrayList<By>();
        myElementSearchBys.add(By.id("navbar"));
        myElementSearchBys.add(By.id("twotabsearchtextbox"));
        myElementSearchBys.add(By.id("icp-nav-flyout"));
        myElementSearchBys.add(By.id("nav-link-accountList"));
        myElementSearchBys.add(By.id("nav-orders"));
        myElementSearchBys.add(By.id("nav-cart"));

        // verify elements exists
        SeleniumTestHelper.webdriver_element_exists(webDriver, AmazonHelper.PAGE_URL_HOME, myElementSearchBys);

    }
}
