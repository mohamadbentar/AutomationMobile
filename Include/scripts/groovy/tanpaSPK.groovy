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


class tanpaSPK {
	@Given("User on dashboard page tanpa SPK")
	def open_page_dashboard	() {
		println ("\n inside navigate To LoginPage")
		Mobile.startApplication(GlobalVariable.Path_APK, true)
		Mobile.setText(findTestObject('Object Repository/Login/username'), GlobalVariable.Username, 0)
		Mobile.setText(findTestObject('Object Repository/Login/password'), GlobalVariable.Password, 0)
		Mobile.tap(findTestObject('Object Repository/Login/buttonLogin'), 1)
		Mobile.verifyElementText(findTestObject('Object Repository/Login/JBA BASTK APP VERSION 2.7.0-jbadev'), 'JBA BASTK APP VERSION 2.7.0-jbadev')
	}

	@When("User click antrian pengirim tanpa SPK")
	def antrian_pengiriman() {
		println ("\n inside navigate To Filter")
		Mobile.tap(findTestObject('Object Repository/Filter/Button - e-BASTK CAR'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Antrian Pengiriman'), 1)
	}

	@And("User fill in the form data tanpa SPK")
	def form_tanpa_SPK() {
		println ("\n fill form tanpa SPK")
		Mobile.tap(findTestObject('Object Repository/TanpaSPK/Button - TANPA SPK'), 1)
		Mobile.tap(findTestObject('Object Repository/TanpaSPK/InputSeller'), 1)
		Mobile.setText(findTestObject('Object Repository/TanpaSPK/InputSeller2'), GlobalVariable.Seller, 0)
		Mobile.tap(findTestObject('Object Repository/TanpaSPK/InputSeller3'), 1)
		Mobile.setText(findTestObject('Object Repository/TanpaSPK/inputNoPolisi'), GlobalVariable.NoPolisi, 0)
		Mobile.setText(findTestObject('Object Repository/TanpaSPK/InputNoRangka'),GlobalVariable.NoRangka, 0)
		Mobile.setText(findTestObject('Object Repository/TanpaSPK/inputNoMesin'),GlobalVariable.NoMesin, 0)
		Mobile.tap(findTestObject('Object Repository/TanpaSPK/inputMerk'), 1)
		Mobile.setText(findTestObject('Object Repository/TanpaSPK/inputMerk2'),GlobalVariable.Merk, 0)
		Mobile.tap(findTestObject('Object Repository/TanpaSPK/inputMerk3'), 1)
		Mobile.tap(findTestObject('Object Repository/TanpaSPK/inputModelDoc'), 1)
		Mobile.setText(findTestObject('Object Repository/TanpaSPK/inputModelDoc2'), GlobalVariable.ModelDoc, 0)
		Mobile.tap(findTestObject('Object Repository/TanpaSPK/inputModelDoc3'), 1)
		Mobile.tap(findTestObject('Object Repository/TanpaSPK/inputModelFisik'),1)
		Mobile.setText(findTestObject('Object Repository/TanpaSPK/inputModelFisik2'),GlobalVariable.ModelFisik, 0)
		Mobile.tap(findTestObject('Object Repository/TanpaSPK/inputModelFisik3'),1)
		Mobile.setText(findTestObject('Object Repository/TanpaSPK/InputTahun'),GlobalVariable.Tahun, 0)
		Mobile.tap(findTestObject('Object Repository/TanpaSPK/Button - Save'), 1)
		Mobile.delay(3)
		Mobile.takeScreenshot()
	}

	@Then("User successfully view data tanpa SPK")
	def view_tanpa_SPK() {
		println("\n inside view data")
		Mobile.tap(findTestObject('Object Repository/Filter/Button_Profile'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - LOGOUT'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - YA'), 1)
	}
}