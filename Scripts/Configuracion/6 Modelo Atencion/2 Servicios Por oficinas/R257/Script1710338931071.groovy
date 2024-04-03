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

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/0Principal/a_2 Servicios por oficinas'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.comment('Llenado de Servicio')

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Direcciones Seccionales/a_7 Prueba_Editar'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/input_Id Oficina'), 
    findTestData('7 Servicios').getValue('Id Oficina', 7))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/btn_Actualizar (Guardar)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/input_Id Selector'), 
    findTestData('7 Servicios').getValue('Id Selector', 7))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/btn_Actualizar (Guardar)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/input_Id Destino (Sala)'), 
    findTestData('7 Servicios').getValue('Id Destino', 7))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/btn_Actualizar (Guardar)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/input_Id Cola (Servicio)'), 
    findTestData('7 Servicios').getValue('Id Cola', 7))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/btn_Actualizar (Guardar)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/input_Nombre Usuario'), 
    findTestData('7 Servicios').getValue('Nombre Usuario', 3))

WebUI.clearText(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/input_Porc. de priorizacion'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/btn_Actualizar (Guardar)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/input_Porc. de priorizacion'), 
    findTestData('7 Servicios').getValue('% de priorización', 3))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/6Modelo de atencion/2Servicios por oficinas/Datos Servicios/btn_Actualizar (Guardar)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

