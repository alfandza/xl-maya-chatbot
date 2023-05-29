import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'xlchatbot.chatbotkey.clickChatbot'()

CustomKeywords.'xlchatbot.chatbotkey.clickNonPenggunaXL'()

WebUI.setText(findTestObject('Chatbox/Field_Pendaftaran/Field_Nama'), 'Muhammad Ekananda')

WebUI.setText(findTestObject('Chatbox/Field_Pendaftaran/Field_Telephone'), '85325847359')

WebUI.setText(findTestObject('Chatbox/Field_Pendaftaran/Field_Email'), 'muhammad.fajar@xsis.co.id')

WebUI.click(findTestObject('Chatbox/Field_Pendaftaran/Check_TnC'))

WebUI.click(findTestObject('Chatbox/Field_Pendaftaran/LoginButton_MulaiChat'))

WebUI.verifyElementPresent(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 10)

