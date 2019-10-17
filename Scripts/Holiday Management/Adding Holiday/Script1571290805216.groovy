import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login/Login_Successfully'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Holiday Management/Selecting Holiday'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Holiday Management/btn_CreateNew'))

WebUI.sendKeys(findTestObject('Holiday Management/Holiday Details/txt_Holiday_Date'), '')

WebUI.setText(findTestObject('Holiday Management/Holiday Details/txt_Holiday_Date'), '2019-09-01')

WebUI.delay(1)

WebUI.setText(findTestObject('Holiday Management/Holiday Details/txt_Holiday_Title'), 'Legal Holiday')

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Holiday Management/Holiday Details/drp_Holiday_type'))

WebUI.click(findTestObject('Holiday Management/Holiday Details/lst_Holiday_Type_LEGAL_HOLIDAY'))

WebUI.delay(1)

WebUI.click(findTestObject('Holiday Management/Holiday Details/btn_Save'))

WebUI.closeBrowser()

