import pages.LoginPage
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

LoginPage.openLoginPage()
LoginPage.enterUsername(GlobalVariable.ValidUser)
LoginPage.clickLogin()
LoginPage.verifyErrorMessage('Epic sadface: Password is required')