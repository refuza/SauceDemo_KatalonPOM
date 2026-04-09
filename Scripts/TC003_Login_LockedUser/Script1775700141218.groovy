import pages.LoginPage
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

LoginPage.openLoginPage()
LoginPage.enterUsername(GlobalVariable.LockedUser)
LoginPage.enterPassword(GlobalVariable.ValidPassword)
LoginPage.clickLogin()
LoginPage.verifyErrorMessage('Epic sadface: Sorry, this user has been locked out.')