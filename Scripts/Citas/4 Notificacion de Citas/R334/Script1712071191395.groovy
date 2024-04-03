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

WebUI.delay(2)

WebUI.click(findTestObject('ADM/0Principal/a_Citas'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/3Citas/0 Principal/a_4 Notificacion de citas'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('ADM/3Citas/4 Notificacion de Citas/input_Codigo Cita'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/3Citas/4 Notificacion de Citas/select_Ciudad'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/3Citas/4 Notificacion de Citas/select_Punto de Contacto (oficina)'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/3Citas/4 Notificacion de Citas/click_Tramite'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/3Citas/4 Notificacion de Citas/btn_Buscar'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/3Citas/4 Notificacion de Citas/btn_Notificar Masivo'), 2)

WebUI.verifyElementPresent(findTestObject('ADM/3Citas/4 Notificacion de Citas/btn_Notificar Seleccion'), 2)

