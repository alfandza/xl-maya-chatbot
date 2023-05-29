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

CustomKeywords.'xlchatbot.chatbotkey.clickPenggunaXL'()

CustomKeywords.'xlchatbot.chatbotkey.loginPenggunaXL'()

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Paket')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Akrab'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Menu Sebelumnya'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button XL Satu'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Menu Sebelumnya'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Xtra Combo Plus'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Menu Sebelumnya'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Xtra Combo Mini'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Menu Sebelumnya'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Xtra Kuota'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Menu Sebelumnya'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Menu Sebelumnya'))

WebUI.delay(10)

