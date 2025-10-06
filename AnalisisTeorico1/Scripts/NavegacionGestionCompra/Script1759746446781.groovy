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

WebUI.verifyElementPresent(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Your Store/h3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Your Store/div_Categories_collapse navbar-collapse nav_09365a'), 
    0)

WebUI.click(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Your Store/a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_iPhone/h1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_iPhone/button_Qty_button-cart'), 
    0)

WebUI.click(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_iPhone/button_Qty_button-cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_iPhone/div_iPhone_alert alert-success alert-dismissible'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_iPhone/button_Your Store_btn btn-inverse btn-block_abf7b7_1'), 
    0)

WebUI.click(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_iPhone/i_Wish List (0)_fa fa-shopping-cart'))

WebUI.navigateToUrl('https://opencart.abstracta.us/index.php?route=checkout/cart')

WebUI.navigateToUrl('https://opencart.abstracta.us/index.php?route=checkout/cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Shopping Cart/div_Show All MP3 Players_checkout-cart'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Shopping Cart/a_Continue Shopping_btn btn-primary'), 
    0)

WebUI.click(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Shopping Cart/a_Continue Shopping_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Checkout/div_Checkout_content'), 
    0)

WebUI.click(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Checkout/a'))

WebUI.navigateToUrl('https://opencart.abstracta.us/index.php?route=checkout/cart')

WebUI.verifyElementVisible(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Shopping Cart/a_123.20_btn btn-default'))

WebUI.click(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Shopping Cart/a_123.20_btn btn-default'))

WebUI.verifyElementVisible(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Your Store/div_Categories_collapse navbar-collapse nav_09365a'))

WebUI.verifyElementVisible(findTestObject('Object Repository/NavegacionGestionCOmpra/Page_Your Store/div_Show All MP3 Players_content'))

WebUI.closeBrowser()


