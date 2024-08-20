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



class Login {
	@Given("User Navigate to Login Page")
	def navigate_To_Login_Page() {
		println ("\n inside navigate To LoginPage")
		Mobile.startApplication(GlobalVariable.Path_APK, true)
	}

	@When("User input (.*) and (.*)")
	def input_valid_Credential (String username,String password) {
		println ("\n inside inputCredential")
		println ("Username : "+username)
		println ("Password : "+password)
		Mobile.setText(findTestObject('Object Repository/Login/username'), username, 0)
		Mobile.setText(findTestObject('Object Repository/Login/password'), password, 0)
	}

	@And ("Click on Login button")
	def click_Login() {
		println ("\n Inside clickLogin")
		Mobile.tap(findTestObject('Object Repository/Login/buttonLogin'), 1)
	}

	@Then ("User navigated to dashboard")
	def verify_Dashboard_Page() {
		println ("\n Inside DashboardPage")
		Mobile.verifyElementText(findTestObject('Object Repository/Login/JBA BASTK APP VERSION 2.7.0-jbadev'), 'JBA BASTK APP VERSION 2.7.0-jbadev')
		Mobile.delay(1)
	}
}