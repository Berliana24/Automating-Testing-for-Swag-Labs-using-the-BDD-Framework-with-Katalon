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



class Checkout01StepDefinition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@When("Click the Add to Cart button on the inventory page")
	def Click_the_Add_to_Cart_button() {
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))
	}

	@Then("See the number of products in the cart increase in the Cart Icon")
	def See_the_number_of_products_in_Cart_Icon() {
		WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/a_1'), 0)
	}

	@When("Click the cart icon")
	def Click_the_Cart_Icon() {
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_1'))
	}

	@Then("Will be redirected to the cart page")
	def Will_be_redirected_to_the_cart_page() {
		WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/Page_Cart'), 0)
	}

	@And("See the details of the previously added product, including the product name, product description, and product price")
	def See_The_Detail() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/title_product_in_cart'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/description_product_in_cart'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/price_product_in_cart'), 0)
	}

	@When("Click Checkout button")
	def Click_Checkout_button() {
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))
	}

	@Then("Will be redirected to the checkout step one page")
	def Redirect_to_checkout_step_one_page() {
		WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/Page_Checkout'), 0)
	}

	@And("fills valid (.*), (.*) and (.*)")
	def fills_valid_first_name_last_name_and_code_form(String first_name, String last_name, String postalCodeString) {
		int postalCode = postalCodeString.toInteger()

		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), first_name)
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), last_name)
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), postalCode.toString())
	}

	@And("Click Continue button")
	def Click_Continue_Button() {
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))
	}

	@Then("Will be redirected to the checkout overview page")
	def Redirect_to_checkout_overview_page() {
		WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/Page_Overview'), 0)
		WebUI.closeBrowser()
	}
}