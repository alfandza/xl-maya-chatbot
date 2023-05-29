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

WebUI.comment('Pilihan Kendala Registrasi kartu / Reaktivasi Kartu SIM(Prepaid)')

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Kendala Registrasi kartu atau Reaktivasi Kartu SIM(Prepaid)'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Menu Sebelumnya'))

WebUI.comment('Pilihan Kendala Sinyal / Internet')

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Kendala Sinyal atau Internet'))

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.comment('Pilihan Informasi Paket')

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Informasi Paket'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Menu Sebelumnya'))

WebUI.comment('Pilihan Promo & Program')

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Promo dan Program'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Menu Sebelumnya'))

WebUI.comment('Pilihan Informasi XL Center')

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Informasi XL Center'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Menu Sebelumnya'))

WebUI.comment('Pilihan Kerjasama')

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Kerjasama'))

WebUI.click(findTestObject('Chatbot xlaxiata.com/button Menu Sebelumnya'))

