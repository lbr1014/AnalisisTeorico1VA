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


WebUI.verifyElementPresent(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_Account Login/div_Continue_well'), 
    0)

WebUI.setText(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_Account Login/input_E-Mail Address_input-email'), 
    'lbr1014@alu.ubu.es')

WebUI.setEncryptedText(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_Account Login/input_Password_input-password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_Account Login/input_Forgotten Password_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_Account Login/div_Login_alert alert-danger alert-dismissible'), 
    0)

WebUI.click(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_Account Login/div_Login_alert alert-danger alert-dismissible'))

WebUI.click(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_Account Login/input_E-Mail Address_input-email'))

WebUI.setText(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_Account Login/input_E-Mail Address_input-email'), 
    'blg1006@alu.ubu.es')

WebUI.click(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_Account Login/input_Forgotten Password_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_My Account/div_Account_content'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_My Account/a_Newsletter_list-group-item'), 
    0)

WebUI.click(findTestObject('Object Repository/InicioSesionVidible/ComprobacionIniciosesion/Page_My Account/a_Newsletter_list-group-item'))

