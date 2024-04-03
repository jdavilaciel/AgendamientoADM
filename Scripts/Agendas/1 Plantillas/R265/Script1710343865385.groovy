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

WebUI.click(findTestObject('ADM/0Principal/a_Agendas'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/2Agendas/0 Principal/a_1 Plantillas'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('ADM/2Agendas/1 Plantillas/Plantillas por oficina/btn_Nueva Plantilla'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.comment('Sección Calendario y Agenda')

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/1 Plantillas/Plantillas por oficina/btn_Nueva Plantilla(1)/2 Calendario y Agenda/a_Open Calendar Fecha Final'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/1 Plantillas/Plantillas por oficina/btn_Nueva Plantilla(1)/2 Calendario y Agenda/a_Open Calendar Fecha Inicial'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/1 Plantillas/Plantillas por oficina/btn_Nueva Plantilla(1)/2 Calendario y Agenda/btn_Aplicar'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/1 Plantillas/Plantillas por oficina/btn_Nueva Plantilla(1)/2 Calendario y Agenda/btn_PreCalcular'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/1 Plantillas/Plantillas por oficina/btn_Nueva Plantilla(1)/2 Calendario y Agenda/btn_Cancelar'), 
    2)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

