package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
// import com.kms.katalon.core.testobject.ObjectRepository as btn_ATC
import com.kms.katalon.core.testobject.ObjectRepository as OR
import com.kms.katalon.core.testobject.TestObject

class ProductsPage {
    static void verifyProductsPage() {
        WebUI.verifyElementPresent(findTestObject('ProductsPage/div_inventory_container'), 10)
    }
		static TestObject btnATC = OR.findTestObject('Object Repository/ProductsPage/btn_AddToCart')
	static void addProductToCart() {
		WebUI.click(btnATC)
	}
	
//	static void addProductToCart() {
//        WebUI.waitForElementVisible(btnATC, 10)
//        WebUI.waitForElementClickable(btnATC, 10)
//        WebUI.click(btnATC)
//    }

}