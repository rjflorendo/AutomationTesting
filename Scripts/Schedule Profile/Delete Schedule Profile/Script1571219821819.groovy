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

WebUI.callTestCase(findTestCase('Schedule Profile/Selecting Schedule Profile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Schedule Profile/txt_search'), 'Standard ( 7:30 AM - 4:30 PM)')

WebUI.click(findTestObject('Schedule Profile/btn_search'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule Profile/btn_Delete'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule Profile/btgn_Delete_Yes'))

Search_Schedule_Profile = WebUI.modifyObjectProperty(findTestObject('Schedule Profile/txt_search'), 'value', 'not equal','', true)

WebUI.setText(Search_Schedule_Profile,'')

WebUI.click(findTestObject('Schedule Profile/btn_search'))

WebUI.delay(2)

WebUI.closeBrowser()

