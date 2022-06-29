package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class PochtaMainPage {
  private final SelenideElement loginBtn = $(".Box-sc-7ax6ia-0.cquGUr");
  private final SelenideElement userLoginBtn = $(".Font-sc-le1wax-0.gwiFve");



  public void ChooseLoginMenu() {
    SelenideElement element = userLoginBtn;
    actions().moveToElement(element, 1201, 44).click().perform();

  }

  public PochtaMainPage openPage(){
    open("");
    return this;
  }
  
}
