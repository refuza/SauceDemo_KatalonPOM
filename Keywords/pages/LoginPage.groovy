package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

class LoginPage {
    static void openLoginPage() {
        WebUI.openBrowser('')
        WebUI.navigateToUrl(GlobalVariable.URL)
        WebUI.waitForElementVisible(findTestObject('LoginPage/input_username'), 10)
    }

    static void enterUsername(String username) {
        WebUI.setText(findTestObject('LoginPage/input_username'), username)
    }

    static void enterPassword(String password) {
        WebUI.setEncryptedText(findTestObject('LoginPage/input_password'), password)
    }

    static void clickLogin() {
        WebUI.click(findTestObject('LoginPage/button_login'))
    }
	
	static void verifyErrorMessage() {
		WebUI.verifyElementPresent(findTestObject('LoginPage/error_message'), 10)
		String errorText = WebUI.getText(findTestObject('LoginPage/error_message'))
		WebUI.comment("Error message displayed: " + errorText)
	}

}