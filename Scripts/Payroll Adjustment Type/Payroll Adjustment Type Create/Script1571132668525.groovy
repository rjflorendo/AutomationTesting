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

WebUI.click(findTestObject('Payroll Loan Type/a_All Modules'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payroll Adjustment Types/Page_Touchlink HRIS/div_Payroll Adjustment Types'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payroll Adjustment Types/Payroll Adjustment Type Create/button_Create New'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Payroll Adjustment Types/Payroll Adjustment Type Create/Adjustment Type Inputs'), 'Special Allowance')

WebUI.setText(findTestObject('Payroll Adjustment Types/Payroll Adjustment Type Create/Adjustment Type Inputs'), 'Special Allowance')

WebUI.click(findTestObject('Payroll Loan Type/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payroll Adjustment Types/btn_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

