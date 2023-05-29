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

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Cara Registrasi Kartu')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/1 - button Cara Registrasi Kartu'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Cek Status Kartu SIM')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/2 - button Cek Status Kartu SIM'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Ya')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Kartu Hilang/Rusak')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/3 - button Kartu Hilang atau Rusak'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'XL Center Online')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Blokir Kartu Hilang')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/4 - button Blokir Kartu Hilang'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Info PUK')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/5 - button Info PUK'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('VoLTE')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE (inside)/1 - button Benefit VoLTE'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE (inside)/2 - button Cek Status VoLTE'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE (inside)/3 - button Syarat VoLTE'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE (inside)/4 - button Jangkauan VoLTE'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE (inside)/5 - button Cara Aktivasi VoLTE'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Informasi Kartu & Nomor XL')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Kartu dan Nomor XL/6 - button VoLTE'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Menu Sebelumnya'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Menu Sebelumnya'))

WebUI.delay(10)

