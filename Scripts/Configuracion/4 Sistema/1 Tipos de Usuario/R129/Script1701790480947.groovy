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

WebUI.comment('Verificar que los iconos de Sistema estén presentes')

WebUI.click(findTestObject('ADM/0Principal/a_Configuracion'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_4 Sistema'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_1 Tipos de usuario'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_2 Tipos de documento'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_3 Parametros generales'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_4 Mensajes de inicio'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_5 Mensajes notificacion'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_6 Modulos y personalizaciones'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_7 Motivos de cancelacion'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_8 Origenes'), 2)

WebUI.takeFullPageScreenshot()

