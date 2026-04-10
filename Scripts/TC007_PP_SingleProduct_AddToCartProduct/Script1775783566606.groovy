import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling
import pages.ProductsPage
import pages.CartPage

// Step 0: Precondition - panggil test case login
WebUI.callTestCase(
    findTestCase('TC001_Login_Successfully'),   // path test case login
    [:],                                        // Map kosong (wajib ada)
    FailureHandling.STOP_ON_FAILURE             // handling jika gagal
)

// Step 1: Click Add to Cart
ProductsPage.addProductToCart()

// Step 2: Verify cart badge
CartPage.verifyCartCount(1)