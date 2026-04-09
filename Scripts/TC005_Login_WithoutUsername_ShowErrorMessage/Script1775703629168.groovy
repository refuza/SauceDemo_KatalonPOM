import pages.LoginPage
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

LoginPage.openLoginPage()
LoginPage.enterPassword(GlobalVariable.ValidPassword)
LoginPage.clickLogin()
LoginPage.verifyErrorMessage('Epic sadface: Username is required')