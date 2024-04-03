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

WebUI.comment('Botones paginas')

WebUI.click(findTestObject('ADM/0Principal/a_Configuracion'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/0Principal/a_4 Sistema'))

WebUI.delay(2)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/0Principal/a_3 Parametros generales'))

WebUI.delay(2)

WebUI.comment('Pagina 3')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/a_3'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('Pagina 2')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/a_2'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('Pagina 1')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/a_1'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('Ultima Pagina')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/span_Ultima Pagina'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('Primera Pagina')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/span_Primera pagina'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('Pagina Posterior')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/span_Pagina Posterior'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('Pagina Anterior')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/span_Pagina Anterior'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('Listado 10 Paginas')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/Click_SelectNumeroPaginas'))

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/li_10'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('Listado 20 Paginas')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/Click_SelectNumeroPaginas'))

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/li_20'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.comment('Listado 50 Paginas')

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/Click_SelectNumeroPaginas'))

WebUI.click(findTestObject('ADM/1Configuracion/4Sistema/3Parametros Generales/Paginacion/li_50'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

