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

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/0Principal/a_3 Campos adicionales'))

WebUI.delay(2)

WebUI.comment('agregar dos campos adicionales')

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Nombre'), findTestData('6CamposAdicionales').getValue(
        'Nombre', 1))

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Valor por defecto'), findTestData(
        '6CamposAdicionales').getValue('Valor por defecto', 1))

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Expresion regular'), '')

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Codigo de homologacion Digiturno5'), 
    findTestData('6CamposAdicionales').getValue('Código de homologación Digiturno5', 1))

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/select_Tipo Destino Digiturno5'), 
    findTestData('6CamposAdicionales').getValue('Tipo destino Digiturno5', 1), false)

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Orden'), findTestData('6CamposAdicionales').getValue(
        'Orden', 1))

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/select_Tipo de Control'), 
    findTestData('6CamposAdicionales').getValue('Tipo de control', 1), false)

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/select_Tipo de dato'), 
    findTestData('6CamposAdicionales').getValue('Tipo de dato', 1), false)

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/label_Habilitado'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/Nombre Especialidad/label_Seleccionar Todos'))

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/btn_Guardar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.comment('Segundo campo adicional')

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Nombre'), findTestData('6CamposAdicionales').getValue(
        'Nombre', 2))

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Valor por defecto'), findTestData(
        '6CamposAdicionales').getValue('Valor por defecto', 2))

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Expresion regular'), '')

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Codigo de homologacion Digiturno5'), 
    findTestData('6CamposAdicionales').getValue('Código de homologación Digiturno5', 2))

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/select_Tipo Destino Digiturno5'), 
    findTestData('6CamposAdicionales').getValue('Tipo destino Digiturno5', 2), false)

WebUI.setText(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/input_Orden'), findTestData('6CamposAdicionales').getValue(
        'Orden', 2))

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/select_Tipo de Control'), 
    findTestData('6CamposAdicionales').getValue('Tipo de control', 1), false)

WebUI.selectOptionByLabel(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/select_Tipo de dato'), 
    findTestData('6CamposAdicionales').getValue('Tipo de dato', 1), false)

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/label_Habilitado'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/Nombre Especialidad/label_Seleccionar Todos'))

WebUI.click(findTestObject('ADM/1Configuracion/5Clientes/3Campos Adicionales/Edicion/btn_Guardar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

