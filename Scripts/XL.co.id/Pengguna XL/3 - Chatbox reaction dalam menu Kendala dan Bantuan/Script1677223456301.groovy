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

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Pilihan Kendala Sinyal')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/1- button Kendala Sinyal'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/button Tidak'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Pilihan Kendala Internet')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/2 - button Kendala Internet'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/button Tidak'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Pilihan Kendala Pulsa & Voucher')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/3 - button Kendala Pulsa dan Voucher'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Pulsa dan Voucher/1 - button Kendala Isi Pulsa'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Pulsa dan Voucher/button Menu'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/3 - button Kendala Pulsa dan Voucher'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Pulsa dan Voucher/2 - button Kendala Voucher Pulsa atau Paket'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Ya')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/3 - button Kendala Pulsa dan Voucher'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Pulsa dan Voucher/3 - button Cara Bagi Pulsa'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/3 - button Kendala Pulsa dan Voucher'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Pulsa dan Voucher/4 - button Pulsa terpotong karena layanan atau Internet'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Pilihan Kendala Paket')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/4 - button Kendala Paket'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Paket/1 - button Kendala Pembelian Paket'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Paket/button Menu'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/4 - button Kendala Paket'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Paket/2 - button Kendala Penghentian Paket'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/4 - button Kendala Paket'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Paket/3 - button Kuota Cepat Habis'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/4 - button Kendala Paket'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Paket/4 - button Konsumsi Kuota Tidak Sesuai'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/4 - button Kendala Paket'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Paket/5 - button Paket yang Diterima Tidak Sesuai'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Pilihan Kendala Bonus')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/5 - button Kendala Bonus'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Bonus/0 - button MyRewards'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Bonus/MyRewards/button Tidak Bisa Klaim Bonus'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/5 - button Kendala Bonus'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Bonus/1 - button Xtra Combo Flex'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Bonus/MyRewards/button Tidak Bisa Klaim Bonus'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/5 - button Kendala Bonus'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Bonus/2 - button Xtra Combo Plus'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Bonus/MyRewards/button Tidak Bisa Klaim Bonus'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/5 - button Kendala Bonus'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Bonus/3 - button Xtra Combo VIP Plus'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Bonus/MyRewards/button Tidak Bisa Klaim Bonus'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Pilihan Kontrol Pulsa')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/6 - button Kontrol Pulsa'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Informasi Paket/button Menu Sebelumnya'))

WebUI.delay(10)

WebUI.comment('Pilihan Pulsa Darurat')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/7 - button Pulsa Darurat'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Pulsa Darurat/1 - button Cara Pinjam Pulsa Darurat'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Kendala Pulsa dan Voucher/button Menu'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/7 - button Pulsa Darurat'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Pulsa Darurat/2 - button Status Peminjaman Pulsa Darurat'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/7 - button Pulsa Darurat'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Pulsa Darurat/3 - button Notifikasi Pembayaran Tidak Sesuai'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/7 - button Pulsa Darurat'))

WebUI.delay(10)

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/Pulsa Darurat/4 - button Gagal Pinjam Pulsa Darurat'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Pilihan Kendala Reg Kartu')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/8 - button Kendala Reg Kartu'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Kendala & Bantuan')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.comment('Pilihan Cek Status Tiket')

WebUI.click(findTestObject('Chatbox/Chatbox_PenggunaXL/Kendala dan Bantuan/9 - button Cek Status Tiket'))

WebUI.delay(10)

WebUI.setText(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), 'Menu')

WebUI.sendKeys(findTestObject('Chatbox/Chatbox_PenggunaXL/Field_MessageChat'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

