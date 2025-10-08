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

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/div_Categories_collapse navbar-collapse nav_09365a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/div__container'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/i_US Dollar_fa fa-phone'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/i_US Dollar_fa fa-user'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/i_Login_fa fa-heart'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/i_Wish List (0)_fa fa-shopping-cart'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/i_Shopping Cart_fa fa-share'), 
    0)

WebUI.click(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/i_US Dollar_fa fa-user'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/ul_My Account_dropdown-menu dropdown-menu-right'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/a_Categories_dropdown-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/div_Desktops_dropdown-menu'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/a_Show All Desktops_dropdown-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/div_Laptops  Notebooks_dropdown-menu'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/a_Show All Laptops  Notebooks_dropdown-toggle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/div_Components_dropdown-menu'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/a'), 0)

WebUI.mouseOver(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/a_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MenuPrincipal/Page_Your Store/a_1'), 0)

WebUI.closeBrowser()

