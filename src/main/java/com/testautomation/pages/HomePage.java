package com.testautomation.pages;

import com.testautomation.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    //@FindBy(xpath="//input[@name='q']")
    //WebElement searchText=driver.findElement(By.xpath("//input[@name='q']"));

    //@FindBy(xpath="//span[@class='js-jump-to-badge-search-text-global']")
    //WebElement searchType=driver.findElement(By.xpath("//span[@class='js-jump-to-badge-search-text-global']"));

    public HomePage(){
        System.out.println(" I am on Home Page");
    }

    public void searchRepo(){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(prop.getProperty("language"));
        driver.findElement(By.xpath("//span[@class='js-jump-to-badge-search-text-global']")).click();


    }

}
