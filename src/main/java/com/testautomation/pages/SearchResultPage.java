package com.testautomation.pages;

import com.testautomation.utils.Base;
import org.openqa.selenium.By;

public class SearchResultPage extends Base {

    private By sortOption= By.xpath("//details[contains(@class,'select-menu')]");

    private By sortType = By.xpath("//span[contains(text(),'Most forks')]/..");

    public void sortResult(){
        driver.findElement(By.xpath("//details[contains(@class,'select-menu')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Most forks')]/..")).click();
    }
}
