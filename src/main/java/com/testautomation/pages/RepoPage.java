package com.testautomation.pages;

import com.testautomation.utils.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RepoPage extends Base {

    //private By searchResult=By.xpath("//li[contains(@class,'repo-list-item')]");
    public RepoPage(){
        System.out.println("I on Result Page");
    }

    public int countResult(){

        List<WebElement> l = driver.findElements(By.xpath("//li[contains(@class,'repo-list-item')]"));

        System.out.println("Total Result "+ l.size());

        return l.size();
    }

    public void clickFirst(){
        driver.findElement(By.xpath("//em[contains(text(),'Golang')]/..")).click();
        System.out.println("Click on first result");
    }

    public void forkProject(){
        driver.findElement(By.xpath("(//button[contains(@class,'btn-with-count')])[3]")).click();
    }

    public void starProject(){

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@title,'Star')]")));
        driver.findElement(By.xpath("//button[contains(@title,'Star')]")).click();
        Assert.assertEquals(true, driver.findElement(By.xpath("//button[contains(@data-hydro-click,'UNSTAR')]")).isDisplayed());


    }

}
