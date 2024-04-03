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

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_6 Modelo de atencion'))

WebUI.comment('Modificar servicio Prueba')

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/0Principal/a_1 Servicios'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Lista de Servicios/1 Codigo/input_Codigo'), 
    findTestData('7 Servicios').getValue('Código', 7))

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Lista de Servicios/1 Codigo/click_Filtro'))

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Lista de Servicios/1 Codigo/span_Igual a'))

WebUI.delay(2)

'Hace click al primero de la tabla que sale'
WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Lista de Servicios/td1_4 - rea General - General (G) - Informacin'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/img_Modo HTML Requisitos'))

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/textarea_HTML Requisitos'), 
    findTestData('7 Servicios').getValue('Requisitos', 8))

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/btn_Guardar'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

