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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opencart.abstracta.us/')

WebUI.click(findTestObject('Object Repository/InicioSesionVidible/Page_Your Store/a_US Dollar_dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/InicioSesionVidible/Page_Your Store/a'))

WebUI.verifyElementVisible(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/div_Continue_well'))

WebUI.verifyElementText(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/h2'), 'Returning Customer')

WebUI.verifyElementText(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/strong'), 'I am a returning customer')

WebUI.verifyElementText(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/label_I am a returning customer_control-label'), 
    'E-Mail Address')

WebUI.verifyElementVisible(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/input_E-Mail Address_input-email'))

WebUI.verifyElementClickable(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/input_E-Mail Address_input-email'))

WebUI.verifyElementText(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/label_E-Mail Address_control-label'), 
    'Password')

WebUI.verifyElementVisible(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/input_Password_input-password'))

WebUI.verifyElementClickable(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/input_Password_input-password'))

WebUI.verifyElementClickable(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/a'))

WebUI.verifyElementClickable(findTestObject('Object Repository/InicioSesionVidible/Page_Account Login/input_Forgotten Password_btn btn-primary'))

