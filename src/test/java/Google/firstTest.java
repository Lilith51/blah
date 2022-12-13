package Google;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class firstTest {

    @Test
    public void blah() {
        open("https://zoommer.ge");
        $(byXpath("//*[contains(@class,'main-navigation-body')]/ul/li[contains(.,'მობილურები')]")).click();

        $(byXpath("(//button[@data-toggle='dropdown'])[2]")).click();
        sleep(5000);

        $(byXpath("//li[contains(.,'ფასი: ზრდადობით')]")).click();

        sleep(5000);
        WebElement dash = $(".popular_products_inside");
        List<WebElement> items = dash.findElements(By.cssSelector(".product_new_price "));
        System.out.println(Arrays.asList(items));

        for(int j = 0; j <  items.size(); j++){
            if(j >= items.size() - 1){
                break;
            }
            String priceWithCurrency = items.get(j).getText();
            String nextPriceWithCurrency = items.get(j+1).getText();
            String price = priceWithCurrency.replaceAll("₾", "").trim();
            String nextPrice = nextPriceWithCurrency.replaceAll("₾", "").trim();

            if(Integer.parseInt(price) <= Integer.parseInt(nextPrice)){
                System.out.println("step: " + j + "correct");
            }
        }

    }

}
