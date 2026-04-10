package pages

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ObjectRepository as OR
import com.kms.katalon.core.testobject.TestObject

class CartPage {
    static TestObject badgeCartCount = OR.findTestObject('CartPage/badge_CartCount')

    static void verifyCartCount(int expectedCount) {
        String actualCount = WebUI.getText(badgeCartCount)
        WebUI.verifyMatch(actualCount, expectedCount.toString(), false)
    }
}