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

CustomKeywords.'xlchatbot.chatbotkey.clickChatbotXLAxiata'()

CustomKeywords.'xlchatbot.chatbotkey.loginPenggunaXL'()

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.comment('Pilihan Informasi Paket')

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Informasi Paket'))

WebUI.comment('XL Prepaid')

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/button XL Prepaid'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL Prepaid/button Akrab'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL Prepaid/button Menu Utama'))

WebUI.comment('Pilihan Informasi Paket')

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Informasi Paket'))

WebUI.comment('XL prioritas')

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/button XL prioritas'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL prioritas/button Booster Harian'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL prioritas/button Menu Sebelumnya'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL prioritas/button Booster Bulanan'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL prioritas/button Menu Sebelumnya'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL prioritas/button Menu Sebelumnya'))

WebUI.comment('XL Home')

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/button XL Home'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL Home/button XL HOME Broadband Plan'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL Home/button Menu Sebelumnya'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL Home/button XL HOME Unlimited'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/XL Home/button Menu Sebelumnya'))

WebUI.delay(3)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.comment('Pilihan Informasi Paket')

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Informasi Paket'))

WebUI.comment('Axis')

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/button Axis'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/Axis/button Paket Suka-Suka'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/Axis/button Menu Sebelumnya'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/Axis/button Bronet'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/Axis/button Menu Sebelumnya'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/Informasi Paket/Axis/button Menu Sebelumnya'))

