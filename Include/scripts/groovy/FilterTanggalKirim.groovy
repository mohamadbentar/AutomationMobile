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



class AllFilter{
	@Given("User on dashboard page")
	def open_page_dashboard	() {
		println ("\n inside navigate To LoginPage")
		Mobile.startApplication(GlobalVariable.Path_APK, true)
		Mobile.setText(findTestObject('Object Repository/Login/username'), GlobalVariable.Username, 0)
		Mobile.setText(findTestObject('Object Repository/Login/password'), GlobalVariable.Password, 0)
		Mobile.tap(findTestObject('Object Repository/Login/buttonLogin'), 1)
		Mobile.verifyElementText(findTestObject('Object Repository/Login/JBA BASTK APP VERSION 2.7.0-jbadev'), 'JBA BASTK APP VERSION 2.7.0-jbadev')
	}

	@When("User click antrian pengirim")
	def antrian_pengiriman() {
		println ("\n inside navigate To Filter")
		Mobile.tap(findTestObject('Object Repository/Filter/Button - e-BASTK CAR'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Antrian Pengiriman'), 1)
	}

	@And("User select filter tanggal kirim")
	def select_tanggal_kirim() {
		println ("\n select tanggal kirim")
		Mobile.tap(findTestObject('Object Repository/Filter/FilterDefault'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/FilterTanggal Kirim'), 1)
		Mobile.setText(findTestObject('Object Repository/Filter/EditFilter'), GlobalVariable.Tanggal, 0)
		Mobile.tap(findTestObject('Object Repository/Filter/Button_Cari'), 1)
	}

	@Then("User successfully view tanggal kirim list")
	def view_tanggal_kirim() {
		println("\n inside tanggal kirim list")
		Mobile.verifyElementText(findTestObject('Object Repository/Filter/ViewGroup'), '')
		Mobile.takeScreenshot()
		Mobile.tap(findTestObject('Object Repository/Filter/Button_Profile'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - LOGOUT'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - YA'), 1)
	}

	@And("User select filter nomor polisi")
	def select_nomor_polisi() {
		println ("\n select nomor polisi")
		Mobile.tap(findTestObject('Object Repository/Filter/FilterDefault'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/FilterNomor Polisi'), 1)
		Mobile.setText(findTestObject('Object Repository/Filter/EditFilter2'), GlobalVariable.FilterNoPolisi, 0)
		Mobile.tap(findTestObject('Object Repository/Filter/Button_Cari'), 1)
	}

	@Then("User successfully view nomor polisi list")
	def view_nomor_polisi() {
		println("\n inside nomor polisi list")
		Mobile.verifyElementText(findTestObject('Object Repository/Filter/ViewGroup'), '')
		Mobile.takeScreenshot()
		Mobile.tap(findTestObject('Object Repository/Filter/Button_Profile'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - LOGOUT'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - YA'), 1)
	}

	@And("User select filter spk eksternal")
	def select_spk_eskternal() {
		println ("\n select spk eskternal")
		Mobile.tap(findTestObject('Object Repository/Filter/FilterDefault'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/FilterSPK Eksternal'), 1)
	}

	@Then("User successfully view spk eksternal list")
	def view_spk_eksternal() {
		println("\n inside spk eksternal list")
		Mobile.verifyElementText(findTestObject('Object Repository/Filter/ViewGroup'), '')
		Mobile.takeScreenshot()
		Mobile.tap(findTestObject('Object Repository/Filter/Button_Profile'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - LOGOUT'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - YA'), 1)
	}

	@And("User select filter spk internal")
	def select_spk_internal() {
		println ("\n select spk internal")
		Mobile.tap(findTestObject('Object Repository/Filter/FilterDefault'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/FilterSPK Internal'), 1)
	}

	@Then("User successfully view spk internal list")
	def view_spk_internal() {
		println("\n inside spk internal list")
		Mobile.verifyElementText(findTestObject('Object Repository/Filter/ViewGroup'), '')
		Mobile.takeScreenshot()
		Mobile.tap(findTestObject('Object Repository/Filter/Button_Profile'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - LOGOUT'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - YA'), 1)
	}

	@And("User select filter tanpa spk")
	def select_tanpa_spk() {
		println ("\n select spk internal")
		Mobile.tap(findTestObject('Object Repository/Filter/FilterDefault'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/FilterTanpa SPK'), 1)
	}

	@Then("User successfully view tanpa spk list")
	def view_tanpa_spk() {
		println("\n inside spk internal list")
		Mobile.verifyElementText(findTestObject('Object Repository/Filter/ViewGroup'), '')
		Mobile.takeScreenshot()
		Mobile.tap(findTestObject('Object Repository/Filter/Button_Profile'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - LOGOUT'), 1)
		Mobile.tap(findTestObject('Object Repository/Filter/Button - YA'), 1)
	}
}