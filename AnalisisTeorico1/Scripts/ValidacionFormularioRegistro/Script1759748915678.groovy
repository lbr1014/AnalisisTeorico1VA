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

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulario/Formularios/Page_Your Store/i_US Dollar_fa fa-user'), 
    0)

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Your Store/i_US Dollar_fa fa-user'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulario/Formularios/Page_Your Store/a'), 0)

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Your Store/a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/div_Register_content'), 
    0)

WebUI.setText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_First Name_input-firstname'), 
    'Beatriz')

WebUI.setText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Last Name_input-lastname'), 
    'Blanco')

WebUI.setText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_E-Mail_input-email'), 
    'emailsinformato')

WebUI.setText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Telephone_input-telephone'), 
    '123456789')

WebUI.setEncryptedText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Password_input-password'), 
    '4nvbrPglk7k=')

WebUI.setEncryptedText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Password Confirm_input-confirm'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Privacy Policy_agree'))

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Privacy Policy_btn btn-primary'))

WebUI.setText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_E-Mail_input-email'), 
    'email@gmail.com')

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Privacy Policy_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/div_Password Confirm_text-danger'), 
    0)

WebUI.setText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_E-Mail_input-email'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Password_input-password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Privacy Policy_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/div_E-Mail_text-danger'), 
    0)

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/div_First Name_col-sm-10'))

WebUI.setText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_First Name_input-firstname'), 
    'Lydia')

WebUI.setText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Last Name_input-lastname'), 
    'Llorente')

WebUI.setText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_E-Mail_input-email'), 
    'pruebas5@alu.ubu.es')

WebUI.setEncryptedText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Password_input-password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/fieldset'))

WebUI.setEncryptedText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Password_input-password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/fieldset'))

WebUI.setEncryptedText(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Password Confirm_input-confirm'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Register Account/input_Privacy Policy_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulario/Formularios/Page_Your Account Has Been Created/div_Success_content'), 
    0)

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Your Account Has Been Created/a_contact us_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulario/Formularios/Page_My Account/div_Account_content'), 
    0)

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_My Account/a_Newsletter_list-group-item'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulario/Formularios/Page_Account Logout/div_Logout_content'), 
    0)

WebUI.click(findTestObject('Object Repository/Formulario/Formularios/Page_Account Logout/a_Account_btn btn-primary'))

WebUI.closeBrowser()

