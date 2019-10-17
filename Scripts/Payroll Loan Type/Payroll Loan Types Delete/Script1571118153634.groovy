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
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('')
//WebUI.navigateToUrl('http://192.168.8.10:4819')
//WebUI.setText(findTestObject('Object Repository/Payroll Loan Type/txt_Username'), 'payrolladmin')
//WebUI.setEncryptedText(findTestObject('Object Repository/Payroll Loan Type/txt_Password'), '/5S6MFFLcE47TFgtSVsT0Q==')
//WebUI.delay(1)
//WebUI.click(findTestObject('Object Repository/Payroll Loan Type/btn_Login'))
WebUI.callTestCase(findTestCase('Login/Login_Successfully'), [:])

WebUI.click(findTestObject('Payroll Adjustment Types/a_All Modules'))

WebUI.click(findTestObject('Object Repository/Payroll Loan Type/div_Payroll Loan Types'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payroll Loan Type/Payroll Loans Type Delete/PayrollLoanTypes_Delete'))

WebUI.click(findTestObject('Payroll Loan Type/Payroll Loans Type Delete/btn_Yes'))

WebUI.closeBrowser()

