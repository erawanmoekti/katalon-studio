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

WebUI.comment('User Login')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://simajadev.petikjombang.com/backend/web/index.php?r=site%2Flogin')

WebUI.setText(findTestObject('Object Repository/Master Data Tingkat Pendidikan/Page_SIMAJA/input_SIMAJA_LoginFormusername'), 
    'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Data Tingkat Pendidikan/Page_SIMAJA/input_SIMAJA_LoginFormpassword'), 
    'Aecf0DW5CFCw1eZucu/oRw==')

WebUI.click(findTestObject('Object Repository/Master Data Tingkat Pendidikan/Page_SIMAJA/button_Masuk'))

WebUI.comment('Membuka halaman master data pendidikan')

WebUI.click(findTestObject('Master Data Tingkat Pendidikan/Page_Beranda/a_Data Master'))

WebUI.click(findTestObject('Master Data Tingkat Pendidikan/Page_Beranda/a_Tingkat Pendidikan'))

WebUI.comment('Verifikasi judul dan navigasi breadcrumb')

WebUI.verifyElementText(findTestObject('Object Repository/Master Data Tingkat Pendidikan/Page_Tingkat Pendidikan/h4_Tingkat Pendidikan'), 
    'Tingkat Pendidikan')

WebUI.verifyElementText(findTestObject('Object Repository/Master Data Tingkat Pendidikan/Page_Tingkat Pendidikan/li_Tingkat Pendidikan'), 
    'Tingkat Pendidikan')

GlobalVariable.IsLogin = true;

