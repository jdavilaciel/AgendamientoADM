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

WebUI.comment('Campos tabla')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/select_Oficina'), findTestData('8Agendas').getValue(
        'Oficina', 1), false)

WebUI.selectOptionByLabel(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/select_Servicios (Modo por Especialidades)'), 
    findTestData('8Agendas').getValue('Servicio', 1), false)

WebUI.click(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/a_Open calendar Fecha Inicio'), FailureHandling.STOP_ON_FAILURE)

'Javascript para escoger un dia a al azar'
WebUI.executeJavaScript('return document.querySelector("#ctl00_ContentPlaceHolder2_rdpFechaInicio_calendar_Top > tbody > tr:nth-child(2) > td:nth-child(3) > a").click()', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/a_Open calendar Fecha Fin'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/a_Fecha Fin mes siguiente'), FailureHandling.STOP_ON_FAILURE)

'Javascript para escoger un dia a al azar'
WebUI.executeJavaScript('return document.querySelector("#ctl00_ContentPlaceHolder2_rdpFechaFin_calendar_Top > tbody > tr:nth-child(4) > td:nth-child(5) > a").click()', 
    [])

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/btn_Buscar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/Tabla/th_Fecha'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/Tabla/th_Total'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/Tabla/th_Disponibles'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/Tabla/th_Suspendidas'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/Tabla/th_Reservadas'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/Tabla/th_Pre Agendadas'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/4 Agendas por Fecha (Consulta)/Tabla/th_Confirmadas'), 2)

