package Google;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class firstTest {

    @Test
    public void testt(){
          open("https://zoommer.ge");
          sleep(5000);
          $(byXpath("//*[contains(@class,'main-navigation-body')]/ul/li[contains(.,'მობილურები')]")).click();
//          sleep(7000);

          // $(byAttribute("data-show-id", "/html/body/div[7]/section/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button")).click();
          // $(byXpath("/html/body/div[7]/section/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button")).click();
          $(byXpath("(//button[@data-toggle='dropdown'])[2]")).click();
          sleep(5000);

        // SelenideElement industries = $(By.xpath("/html/body/div[7]/section/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/ul"));
        // ElementsCollection links = $$(byXpath("//ul[@class='dropdown-menu show']/li"));
        // ArrayLis<SelenideElement> links = industries.findElements(By.tagName("li"));

        $(byXpath("//li[contains(.,'ფასი: ზრდადობით')]")).click();

//        for (int i = 1; i < links.size(); i++)
//        {
//            System.out.println(links.get(i).getText());
//            if(links.get(i).getText().trim().equals("ფასი: ზრდადობით")){
//                links.get(i).click();
//                break;
//            }
//        }
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






        // $(byXpath("/html/body/my-app/div/adj-header/div[1]/div/div/div/adj-login/div/div/div/button")).click();
          // $(byAttribute("data-id", "signUpFormFirstOfThree_firstname")).setValue("test123");
          // $(byAttribute("data-id", "signUpFormFirstOfThree_lastname")).setValue("Sark123");













         // $(byText("ავტორიზაცია")).click();
         // $((".mat-menu-item"), 0).click();
         // $(("//*[@id=\"mat-menu-panel-2\"]/div/button[1]/span")).shouldBe(Condition.visible, Duration.ofMillis(3000));
        // $(byName("q")).setValue("test automation");
        // $(byName("btnK")).click();

        // $(byLinkText("სურათები")).shouldBe(Condition.visible); // shouldBe(Condition.appear) does the same
        // $(byName("q")).shouldHave(text("Tes"));

        // int count = $$(".product_blocks").size(); // fasis zrdadobis mixedvit dalagebis case
        // for(int i = 1; i <= 42; i++ ){

        // }

        // $("._s_flex").selectRadio("male");
        // $(by("data-id", "some_data_id")).selectOption("Georgia");
        // SelenideElement test = $(".ng-tns-c144-0");
        // System.out.println(test);

        // $("#parentFrame"); // find by name
        // $(byName("name")); // find by name
        // $(byText("text")); // find by text
        // $(byXpath("//*[@id=\"Layer_1\"]")); // find by XPath
        // $(byTagName("a")); // find by tagName
        // $(byAttribute("aria-label", "some value")); // find by attribute that selenide doesn't support

        // $(byName("btnI")).click(); // click on found element

    }

}
