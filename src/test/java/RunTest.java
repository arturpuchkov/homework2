import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class RunTest {
  
  @Before
  public void setUp(){
    Configuration.baseUrl = "https://www.pochta.ru/";
    Configuration.screenshots = true;
    Configuration.timeout = 30;
    Configuration.pageLoadTimeout = 45000;
  }
  
  @Test
  public void firstTest() {
    open("");
    $(".Box-sc-7ax6ia-0.cquGUr").click();
    $("#username").setValue("tojoxi2718@mahazai.com").pressEnter();
    $("#userpassword").setValue("1QAZ2wsx").pressEnter();
    SelenideElement element = $(".Font-sc-le1wax-0.gwiFve");
    SelenideElement secondElement = $(By.xpath("//*[text()='Мои отправления']"));
    actions().moveToElement(element).perform();
    actions().moveToElement(secondElement).click().perform();
    String checkText = $(".Paragraph-sc-10hckd4-0.fhoCWJ").getText();
    Assert.assertEquals(checkText, "Сохраняйте отправления, чтобы узнавать по электронной почте, где они находятся");
  }

}
