package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class AmazonTest extends TestBaseRapor {
    @Test //(dependsOnMethods ="test01" , priority = 0)
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String arananKelime="nutella";
        Assert.assertTrue(actualSonuc.contains(arananKelime));
    }
}
