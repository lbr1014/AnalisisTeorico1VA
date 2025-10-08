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

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling

// 🔹 Abrir navegador solo una vez
WebUI.openBrowser('')
WebUI.navigateToUrl('https://opencart.abstracta.us/')

// 🔹 Paso 1: Ejecutar test "VerificarPantallaInicioSesion"
WebUI.comment('---- Ejecutando Verificación de Pantalla de Inicio de Sesión ----')
WebUI.callTestCase(findTestCase('VerificarPantallaInicioSesion'), [:], FailureHandling.STOP_ON_FAILURE)

// 🔹 Paso 2: Ejecutar test "ComprobacionInicioSesion"
WebUI.comment('---- Ejecutando Comprobación de Inicio de Sesión ----')
WebUI.callTestCase(findTestCase('ComprobacionInicioSesion'), [:], FailureHandling.STOP_ON_FAILURE)

// 🔹 Cerrar navegador al final
WebUI.closeBrowser()

