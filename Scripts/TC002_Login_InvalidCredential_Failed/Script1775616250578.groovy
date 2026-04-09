import pages.LoginPage
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Buka web
LoginPage.openLoginPage()
LoginPage.enterUsername(GlobalVariable.InvalidUser)
LoginPage.enterPassword(GlobalVariable.ValidPassword)
LoginPage.clickLogin()
LoginPage.verifyErrorMessage('Epic sadface: Username and password do not match any user in this service')