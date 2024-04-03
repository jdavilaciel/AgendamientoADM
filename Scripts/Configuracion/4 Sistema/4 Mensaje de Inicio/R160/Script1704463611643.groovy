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

WebUI.comment('Ventana Modal Administrador Guardar Cambios')

WebUI.click(findTestObject('ADM/0Principal/a_Configuracion'))

WebUI.delay(3)

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_4 Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_4 Mensajes de inicio'))

WebUI.delay(3)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/4Mensajes de Inicio/Ventana Modal Administradores/Mensaje Principal/img_Modo HTML MenPrincipal'))

WebUI.setText(findTestObject('ADM/1Configuracion/4Sistema/4Mensajes de Inicio/Ventana Modal Administradores/Mensaje Principal/textarea_Modo HTML MenPrincipal'), 
    GlobalVariable.TextoPrueba)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/4Mensajes de Inicio/Ventana Modal Administradores/label_Habilitado'))

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/4Mensajes de Inicio/Ventana Modal Administradores/btn_Guardar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('ADM/0Inicio Sesion/Boton Ciel/a_Ciel'))

WebUI.click(findTestObject('ADM/0Inicio Sesion/Boton Ciel/a_Cerrar sesion'))

WebUI.delay(3)

WebUI.click(findTestObject('ADM/0Inicio Sesion/a_Cerrar Modal'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ADM/0Inicio Sesion/input_Usuario'), GlobalVariable.Usuario)

WebUI.setText(findTestObject('ADM/0Inicio Sesion/input_Clave'), GlobalVariable.Clave)

WebUI.click(findTestObject('ADM/0Inicio Sesion/btn_IniciarSesion'))

WebUI.comment('Deshabilitar mensaje Administrador')

WebUI.click(findTestObject('ADM/0Principal/a_Configuracion'))

WebUI.delay(3)

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_4 Sistema'))

WebUI.delay(3)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_4 Mensajes de inicio'))

WebUI.delay(3)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/4Mensajes de Inicio/Ventana Modal Administradores/label_Habilitado'))

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/4Mensajes de Inicio/Ventana Modal Administradores/btn_Guardar'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('ADM/0Inicio Sesion/Boton Ciel/a_Ciel'))

WebUI.click(findTestObject('ADM/0Inicio Sesion/Boton Ciel/a_Cerrar sesion'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

