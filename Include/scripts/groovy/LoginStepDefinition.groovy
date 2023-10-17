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



class LoginStepDefinition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User has opened Swag Labs https://www.saucedemo.com/")
	def User_has_opened_Swag_Labs() {
		WebUI.openBrowser('https://www.saucedemo.com/')
	}

	@When("Enter valid (.*) and (.*)")
	def Enter_valid_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/PageLogin/Page_Swag Labs/input_Swag Labs_user-name'), username)
		
		WebUI.setEncryptedText(findTestObject('Object Repository/PageLogin/Page_Swag Labs/input_Swag Labs_password'), password)
	}
	
	@And("Click button login")
	def Click_button_login() {
		WebUI.click(findTestObject('Object Repository/PageLogin/Page_Swag Labs/input_Swag Labs_login-button'))
	}

	@Then("Showing Swag Labs tittle at the top of the page")
	def Showing_Swag_Labs_tittle_at_the_top_of_the_page() {
		WebUI.verifyElementPresent(findTestObject('PageLogin/Page_Swag Labs/div_Swag Labs'), 0)
		WebUI.closeBrowser()
	}
}