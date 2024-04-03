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

WebUI.callTestCase(findTestCase('0InicioSesion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ADM/0Principal/a_Configuracion'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_5 Clientes'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/0Principal/a_4 Consultor cliente'))

WebUI.delay(2)

WebUI.comment('Configuración Campos')

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/0 Principal/a_3 Configuracion campos'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Datos Campo Usuario Cliente/btn_Guardar'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Datos Campo Usuario Cliente/btn_Limpiar'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Datos Campo Usuario Cliente/input_Expresion regular'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Datos Campo Usuario Cliente/input_Id'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Datos Campo Usuario Cliente/input_Nombre campo'), 
    2)

WebUI.takeFullPageScreenshot()
