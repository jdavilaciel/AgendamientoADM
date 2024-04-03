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

WebUI.click(findTestObject('ADM/2Agendas/0 Principal/a_3 Agendas por oficina'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Verificar campos presentes')

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/3 Agendas Por Oficina/select_Oficina'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/3 Agendas Por Oficina/select_Servicios (Modo por Especialidades)'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/3 Agendas Por Oficina/select_Jornada'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/3 Agendas Por Oficina/a_Open calendar Fecha Inicio'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/3 Agendas Por Oficina/a_Open calendar Fecha Fin'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/3 Agendas Por Oficina/btn_Buscar'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/2Agendas/3 Agendas Por Oficina/btn_Limpiar'), 2)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

