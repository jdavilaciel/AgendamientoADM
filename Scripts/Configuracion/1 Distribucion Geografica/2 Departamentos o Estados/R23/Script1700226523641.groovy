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

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_1 Distribucion geografica'))

WebUI.click(findTestObject('ADM/1Configuracion/1Distribucion geografica/0Principal/a_2 Departamentos o estados'))

WebUI.delay(3)

WebUI.click(findTestObject('ADM/1Configuracion/1Distribucion geografica/2Departamentos o estados/0 btn_NuevoEstado'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/2Departamentos o estados/0 btn_NuevoEstado(1)/input_Nombre Estado'), 
    '(987098)prueba2')

WebUI.setText(findTestObject('ADM/1Configuracion/1Distribucion geografica/2Departamentos o estados/0 btn_NuevoEstado(1)/input_Codigo Estado'), 
    '8')

WebUI.click(findTestObject('ADM/1Configuracion/1Distribucion geografica/2Departamentos o estados/0 btn_NuevoEstado(1)/btn_GuardarEstado'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

