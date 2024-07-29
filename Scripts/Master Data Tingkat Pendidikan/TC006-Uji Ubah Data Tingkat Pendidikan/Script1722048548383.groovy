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

if (!(GlobalVariable.IsLogin)) {
    WebUI.callTestCase(findTestCase('Master Data Tingkat Pendidikan/TC003-Melihat Halaman Tingkat Pendidikan'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.navigateToUrl('https://simajadev.petikjombang.com/backend/web/index.php?r=tingkat-pendidikan%2Fupdate&id=11')

WebUI.setText(findTestObject('Object Repository/Master Data Tingkat Pendidikan/Page_Update Tingkat Pendidikan AT_001/input_Tingkat Pendidikan_TingkatPendidikannama'), 
    'AT_002')

WebUI.sendKeys(findTestObject('Master Data Tingkat Pendidikan/Page_Update Tingkat Pendidikan AT_001/input_Tingkat Pendidikan_TingkatPendidikannama'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Master Data Tingkat Pendidikan/Page_AT_002/h4_AT_002'), 'AT_002')

WebUI.verifyElementText(findTestObject('Object Repository/Master Data Tingkat Pendidikan/Page_AT_002/td_AT_002'), 'AT_002')

