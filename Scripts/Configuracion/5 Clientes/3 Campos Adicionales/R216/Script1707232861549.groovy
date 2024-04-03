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

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/0Principal/a_3 Campos adicionales'))

WebUI.delay(2)

WebUI.comment('Verificar elementos')

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/btn_Guardar'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/btn_Limpiar'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Nombre'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Valor por defecto'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Codigo de homologacion Digiturno5'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/select_Tipo Destino Digiturno5'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Orden'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/select_Tipo de Control'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/select_Tipo de dato'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/label_Habilitado'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/label_Obligatorio'), 
    2)

WebUI.takeFullPageScreenshot()

