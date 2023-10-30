import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AddMultipleProductStepDefinition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And ("Click another Add to Cart button on the inventory page")
	def Click_another_add_to_cart_button() {
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_2'))
	}

	@Then("See two product with each details of the previously added product")
	def See_detail_of_two_product() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/title_product_in_cart'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/description_product_in_cart'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/price_product_in_cart'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Bike Light'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_A red light isnt the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_9.99'), 0)

		WebUI.closeBrowser()
	}
}
