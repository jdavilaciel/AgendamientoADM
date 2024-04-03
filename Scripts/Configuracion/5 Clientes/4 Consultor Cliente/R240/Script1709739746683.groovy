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

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_5 Clientes'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/0Principal/a_4 Consultor cliente'))

WebUI.delay(2)

WebUI.comment('Verificación de campos')

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/0 Principal/a_3 Configuracion campos'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_1 Correo electronico'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_2 Confirmar Correo electronico'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_3 Nombres'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_4 Apellidos'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_5 Numero documento'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_6 Tipo persona'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_7 Tipo documento'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_8 Telefono celular'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_9 Telefono fijo'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_10 Direccion de residencia'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_11 Ciudad de residencia'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_12 Pais de residencia'), 
    2)

WebUI.verifyElementPresent(findTestObject('ADM/1Configuracion/5Clientes/4Consultor Cliente/3 Configuracion Campos/Lista campos usuario/td_13 Departamento de residencia'), 
    2)

WebUI.takeFullPageScreenshot()

