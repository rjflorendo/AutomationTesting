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

WebUI.setText(findTestObject('Schedule Profile/txt_search'), 'Standard (8:30AM - 5:30PM)')

WebUI.click(findTestObject('Schedule Profile/btn_search'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule Profile/btn_Edit'))

WebUI.delay(1)

standard_edit = WebUI.modifyObjectProperty(findTestObject('Schedule Profile/Schedule Profile Details/txt_ScheduleName'), 
    'value', 'not equal', '', true)

WebUI.setText(standard_edit, 'Standard ( 7:30 AM - 4:30 PM)')

Start_Time_edit = WebUI.modifyObjectProperty(findTestObject('Schedule Profile/Schedule Profile Details/General/Monday/txt_Monday_StartTime'), 
    'value', 'not equal', '', true)

WebUI.setText(Start_Time_edit, '07:30')

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/General/btn_CopyFirstRow'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/General/Saturday/tgl_Saturday_IsRestday'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/General/Sunday/tgl_Sunday_IsRestday'))

WebUI.delay(1)

WebUI.scrollToPosition(4, 0)

WebUI.delay(1)

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/btn_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/btn_Save_Yes'))

WebUI.closeBrowser()

