import pages.LoginPage
import pages.ProductsPage
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

try {
    // Step 1: Open Login Page
    LoginPage.openLoginPage()

    // Step 2: Input Username
    LoginPage.enterUsername(GlobalVariable.ValidUser)

    // Step 3: Input Password
    LoginPage.enterPassword(GlobalVariable.ValidPassword)

    // Step 4: Click Login
    LoginPage.clickLogin()

    // Step 5: Verify Products Page
    ProductsPage.verifyProductsPage()

} catch (Exception e) {
    WebUI.comment("Test Case Failed: " + e.message)
    throw e
} finally {
    WebUI.closeBrowser()
}