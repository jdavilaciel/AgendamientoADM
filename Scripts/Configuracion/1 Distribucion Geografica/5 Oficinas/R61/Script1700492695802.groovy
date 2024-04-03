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

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_1 Distribucion geografica'))

WebUI.click(findTestObject('ADM/1Configuracion/1Distribucion geografica/0Principal/a_5 Oficinas'))

WebUI.delay(3)

WebUI.comment('Oficina Prueba')

WebUI.click(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina'))

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_Codigo Oficina'), 
    '9')

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_Nombre Oficina'), 
    '98Prueba#$(9')

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/select_Regional'), 
    'Bogota', false)

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/select_Calendario'), 
    'Calendario base', false)

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_Correo solicitudes de citas'), 
    'jdavila@cielingenieria.com')

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_Direccion'), 
    'Carrera')

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_Latitud'), 
    '-74.07588076686477')

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_Longitud'), 
    '4.625848142913746')

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/select_Zona Horaria'), 
    '(UTC-05:00) Bogotá, Lima, Quito, Rio Branco', false)

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_URL Digiturno'), 
    'http://localhost:8812/HostServicioSelector.svc/basic')

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_ID oficina'), 
    '6')

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_ID selector'), 
    '5')

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/select_Ente del sistema'), 
    'Sala', false)

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_ID destino'), 
    '4')

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_ID cola'), 
    '7')

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/input_Nombre de usuario'), 
    'CIEL')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/1Distribucion geografica/5Oficinas/0 btn_NuevaOficina(1)/btn_Guardar Oficina'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

