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

WebUI.click(findTestObject('ADM/2Agendas/0 Principal/a_4 Agendas por fechas (consulta)'))

WebUI.comment('Agendas por fechas (consulta)')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/select_Oficina'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/select_Servicios (Modo por Especialidades)'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/select_Estado agenda'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/a_Open calendar Fecha Inicio'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/a_Open calendar Fecha Fin'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/btn_Buscar'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/btn_Limpiar'), 2)

