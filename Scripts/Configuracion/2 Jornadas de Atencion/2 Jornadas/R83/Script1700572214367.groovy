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

WebUI.click(findTestObject('ADM/1Configuracion/2Jornadas de atencion/0Principal/a_2 Jornadas'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.comment('La aplicación hace una busqueda en todos los campos incluidos los de hora y funcionarios')

WebUI.setText(findTestObject('ADM/1Configuracion/2Jornadas de atencion/2Jornadas/Jornadas/input_Busqueda'), '1')

WebUI.click(findTestObject('ADM/1Configuracion/2Jornadas de atencion/2Jornadas/Jornadas/btn_Buscar'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/2Jornadas de atencion/2Jornadas/Jornadas/input_Busqueda'), '2')

WebUI.click(findTestObject('ADM/1Configuracion/2Jornadas de atencion/2Jornadas/Jornadas/btn_Buscar'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('La aplicación hace la distincion entre mayusculas y minusculas')

WebUI.setText(findTestObject('ADM/1Configuracion/2Jornadas de atencion/2Jornadas/Jornadas/input_Busqueda'), 'prueba')

WebUI.click(findTestObject('ADM/1Configuracion/2Jornadas de atencion/2Jornadas/Jornadas/btn_Buscar'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('Se debe escribir el dato tal como está en la lista para que lo encuentre')

WebUI.setText(findTestObject('ADM/1Configuracion/2Jornadas de atencion/2Jornadas/Jornadas/input_Busqueda'), 'Prueba')

WebUI.click(findTestObject('ADM/1Configuracion/2Jornadas de atencion/2Jornadas/Jornadas/btn_Buscar'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

