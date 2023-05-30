package xlchatbot

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class chatbotkey {

	@Keyword
	def clickChatbot() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://www.xl.co.id/')
		
		if(WebUI.verifyElementPresent(findTestObject('Chatbox/button setuju cookies'), 30, FailureHandling.OPTIONAL)) {
			WebUI.delay(5)
			WebUI.click(findTestObject('Chatbox/button setuju cookies'))
		}

		if(WebUI.verifyElementNotPresent(findTestObject('Chatbox/Chatbox_Icon'), 30, FailureHandling.OPTIONAL)) {
			WebUI.refresh()
			WebUI.click(findTestObject('Chatbox/Chatbox_Icon'))
		}else {
			WebUI.click(findTestObject('Chatbox/Chatbox_Icon'))
		}
		//		WebUI.waitForElementClickable(findTestObject('Chatbox/Chatbox_Icon'), 30)

		WebUI.waitForElementPresent(findTestObject('Chatbox/Chatbox_Login'), 30)
	}

	@Keyword
	def clickChatbotXLAxiata() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://www.xlaxiata.co.id/')

		if(WebUI.verifyElementNotPresent(findTestObject('Chatbox/Chatbox_Icon'), 30, FailureHandling.OPTIONAL)) {
			WebUI.refresh()
			WebUI.click(findTestObject('Chatbox/Chatbox_Icon'))
		}else {
			WebUI.click(findTestObject('Chatbox/Chatbox_Icon'))
		}
		//		WebUI.waitForElementClickable(findTestObject('Chatbox/Chatbox_Icon'), 30)

		WebUI.waitForElementPresent(findTestObject('Chatbox/Chatbox_Login'), 30)
	}

	@Keyword
	def clickPenggunaXL() {
		WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Button_PenggunaXL'))
	}

	@Keyword
	def loginPenggunaXL( ) {
		WebUI.setText(findTestObject('Chatbox/Field_Pendaftaran/Field_Nama'), 'Muhammad Ekananda')

		WebUI.setText(findTestObject('Chatbox/Field_Pendaftaran/Field_Telephone'), '87865581373')

		WebUI.setText(findTestObject('Chatbox/Field_Pendaftaran/Field_Email'), 'muhammad.fajar@xsis.co.id')

		WebUI.click(findTestObject('Chatbox/Field_Pendaftaran/Check_TnC'))

		WebUI.click(findTestObject('Chatbox/Field_Pendaftaran/LoginButton_MulaiChat'))

		WebUI.verifyElementPresent(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 10)
	}

	@Keyword
	def clickNonPenggunaXL() {
		WebUI.click(findTestObject('Chatbox/Chatbox_NonPenggunaXL/Button_NonPenggunaXL'))
	}
}
