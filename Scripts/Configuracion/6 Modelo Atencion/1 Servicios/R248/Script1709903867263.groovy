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

WebUI.comment('Boton Limpiar')

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/0Principal/a_1 Servicios'))

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/input_Codigo'), '')

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/input_Nombre'), findTestData(
        '7 Servicios').getValue('Nombre', 8))

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/img_Modo HTML Requisitos'))

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/textarea_HTML Requisitos'), 
    findTestData('7 Servicios').getValue('Requisitos', 8))

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/img_Modo HTML Descripcion'))

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/textarea_HTML Descripcion'), 
    findTestData('7 Servicios').getValue('Descripción', 8))

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/input_Tiempo por Cita (Minutos)'), 
    findTestData('7 Servicios').getValue('Tiempo Por Cita', 1))

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/select_Tipo especialidad'), 
    findTestData('7 Servicios').getValue('Tipo Especialidad', 1), false)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/1Servicios/Datos de Servicio/btn_Limpiar'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

