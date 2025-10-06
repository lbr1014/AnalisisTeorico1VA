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

WebUI.verifyElementPresent(findTestObject('Object Repository/GestionCarritoCompra/Page_Your Store/div_Show All MP3 Players_content'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/GestionCarritoCompra/Page_Your Store/div_Add to Cart_product-layout col-lg-3 col_9ba718'), 
    0)

WebUI.click(findTestObject('Object Repository/GestionCarritoCompra/Page_Your Store/a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/GestionCarritoCompra/Page_iPhone/h1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/GestionCarritoCompra/Page_iPhone/div_Ex Tax 101.00_form-group'), 
    0)

WebUI.click(findTestObject('Object Repository/GestionCarritoCompra/Page_iPhone/button_Qty_button-cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/GestionCarritoCompra/Page_iPhone/div_iPhone_alert alert-success alert-dismissible'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/GestionCarritoCompra/Page_iPhone/i_Wish List (0)_fa fa-shopping-cart'), 
    0)

WebUI.click(findTestObject('Object Repository/GestionCarritoCompra/Page_iPhone/i_Wish List (0)_fa fa-shopping-cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/GestionCarritoCompra/Page_Shopping Cart/div__content'), 0)

WebUI.setText(findTestObject('Object Repository/GestionCarritoCompra/Page_Shopping Cart/input_product 11_quantity395981'), 
    '2')

WebUI.click(findTestObject('Object Repository/GestionCarritoCompra/Page_Shopping Cart/div__content'))

WebUI.click(findTestObject('Object Repository/GestionCarritoCompra/Page_Shopping Cart/button_product 11_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/GestionCarritoCompra/Page_Shopping Cart/div_Shopping Cart_alert alert-success alert_135742'), 
    0)

WebUI.click(findTestObject('Object Repository/GestionCarritoCompra/Page_Shopping Cart/i_product 11_fa fa-times-circle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/GestionCarritoCompra/Page_Shopping Cart/p'), 0)

WebUI.click(findTestObject('Object Repository/GestionCarritoCompra/Page_Shopping Cart/a_Shopping Cart_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/GestionCarritoCompra/Page_Your Store/div_Show All MP3 Players_content_1'), 
    0)

WebUI.closeBrowser()

