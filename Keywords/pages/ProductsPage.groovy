package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class ProductsPage {
    static void verifyProductsPage() {
        WebUI.verifyElementPresent(findTestObject('ProductsPage/div_inventory_container'), 10)
    }
}