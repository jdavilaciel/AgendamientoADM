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

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_4 Sistema'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_5 Mensajes notificacion'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/5Mensajes Notificacion/Edicion/btn_Guardar'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/5Mensajes Notificacion/Edicion/btn_Limpiar'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/5Mensajes Notificacion/Edicion/img_Modo Diseno'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/5Mensajes Notificacion/Edicion/img_Modo HTML'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/5Mensajes Notificacion/Edicion/select_Tipo Mensaje'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/5Mensajes Notificacion/Edicion/input_Nombre mensaje'), 
    2)

WebUI.takeFullPageScreenshot()

