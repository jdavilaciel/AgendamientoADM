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

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/0Principal/a_2 Politica de tratamiento de datos'))

WebUI.delay(2)

WebUI.comment('Boton Guardar')

WebUI.delay(2)

'No mostrará nada en la tabla'
WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/2Politica de Datos/Maestro de Poltica de tratamiento de datos personales/btn_Crear Politica'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/2Politica de Datos/Maestro de Poltica de tratamiento de datos personales/Nueva Politica de Datos/input_Texto aceptar poltica'), 
    2)

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/2Politica de Datos/Maestro de Poltica de tratamiento de datos personales/Nueva Politica de Datos/input_Nombre'), 
    findTestData('5Clientes').getValue('Nombre', 1))

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/5Clientes/2Politica de Datos/Maestro de Poltica de tratamiento de datos personales/Nueva Politica de Datos/select_Tipo'), 
    findTestData('5Clientes').getValue('Tipo', 1), false)

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/2Politica de Datos/Maestro de Poltica de tratamiento de datos personales/Nueva Politica de Datos/input_Texto aceptar poltica'), 
    'Politica')

WebUI.uploadFile(findTestObject('ADM/1Configuracion/5Clientes/2Politica de Datos/Maestro de Poltica de tratamiento de datos personales/Nueva Politica de Datos/upload_ArchivoPDF'), 
    GlobalVariable.UploadFile)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/2Politica de Datos/Maestro de Poltica de tratamiento de datos personales/Nueva Politica de Datos/btn_Guardar'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()
