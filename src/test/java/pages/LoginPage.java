package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    //private final SelenideElement enterUserName = $("#username");
    private final SelenideElement enterUserPassword = $("#userpassword");
    private final SelenideElement enterButton = $(".Buttonstyles__ButtonWrapper-sc-o9c5ps-1.dIInOm.signin-button");

//    public void enterText(String text){
//        enterUserName.setValue(text).pressEnter();
//        enterUserPassword.setValue(text).pressEnter();
//    }
//
//    public void clickButton(){
//        enterButton.click();
//    }
}
