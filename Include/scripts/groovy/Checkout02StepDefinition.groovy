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



class Checkout02StepDefinition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@And("See the detail product in checkout step two page with the information of payment, shipping, price total and total")
	def See_the_detail_product() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/card_detail_product'), 0)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_Payment Information'), 0)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_Shipping Information'), 0)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_Price Total'), 0)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_Total 32.39'), 0)
	}

	@When("Click finish button")
	def Click_finish_button() {
		WebUI.click(findTestObject('Page_Swag Labs/button_Finish'))
	}
	
	@Then("See the message thank you for your order!")
	def See_the_message() {
		WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/h2_Thank you for your order'), 0)
		WebUI.closeBrowser()
	}
}