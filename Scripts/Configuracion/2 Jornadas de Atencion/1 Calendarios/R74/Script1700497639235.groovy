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

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_2 Jornadas de atencion'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/2Jornadas de atencion/0Principal/a_1 Calendarios'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/2Jornadas de atencion/1Calendarios/0 btn_Crear'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('ADM/1Configuracion/2Jornadas de atencion/1Calendarios/0 btn_Crear(1)/Dias No Laborables/label_Domingo'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/2Jornadas de atencion/1Calendarios/0 btn_Crear(1)/Dias No Laborables/label_Domingo'), 
    2)

'No debería crearse con ese nombre'
WebUI.setText(findTestObject('ADM/1Configuracion/2Jornadas de atencion/1Calendarios/0 btn_Crear(1)/input_Nombre Calendario'), 
    'zzsfPrueba$%#&7658,.,-')

WebUI.click(findTestObject('ADM/1Configuracion/2Jornadas de atencion/1Calendarios/0 btn_Crear(1)/btn_Nuevo'))

