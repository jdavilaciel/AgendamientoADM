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

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/0Principal/a_1 Maestro de clientes'))

WebUI.delay(2)

WebUI.comment('Verificar elementos')

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/0 btn_Nuevo Cliente'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/btn_Refrescar'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/btn_1 Borrar'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/btn_1 Editar'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/input_Apellidos'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/input_Celular'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/input_Fecha creacion (ddmmaaaa)'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/input_Fecha penalizacion (ddmmaaaa)'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/0 btn_Nuevo Cliente'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/input_Identificacion'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/input_Nombre Usuario'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/input_Nombres'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/input_Telefono'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/label_Activo'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/1Maestro de Clientes/Mantenimiento de Clientes/label_Penalizado'), 
    2)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()
