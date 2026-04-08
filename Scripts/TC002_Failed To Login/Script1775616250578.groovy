import pages.LoginPage
import pages.ProductsPage
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

try {
	//Buka web
	LoginPage.openLoginPage()
	LoginPage.enterUsername(GlobalVariable.InvalidUser)
	LoginPage.enterPassword(GlobalVariable.ValidPassword)
	LoginPage.clickLogin()
	LoginPage.verifyErrorMessage()
} catch (Exception e) {
	WebUI.comment("Test Case Failed: " + e.message)
	throw e	
} finally {
	WebUI.closeBrowser()
}