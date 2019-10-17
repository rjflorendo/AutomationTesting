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

//Open Brower {
WebUI.callTestCase(findTestCase('Login/Login_Successfully'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Schedule Profile/Selecting Schedule Profile'), [:], FailureHandling.STOP_ON_FAILURE)

//}
//Create Schedule Profile - Standard 8:30 AM - 5:30 PM no changes in policy
WebUI.click(findTestObject('Schedule Profile/btn_CreateNew'))

WebUI.setText(findTestObject('Schedule Profile/Schedule Profile Details/txt_ScheduleName'), 'Standard (8:30AM - 5:30PM)')

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/btn_Save'))

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/btn_Save_Yes'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule Profile/btn_CreateNew'))

WebUI.setText(findTestObject('Schedule Profile/Schedule Profile Details/txt_ScheduleName'), 'Flexible (8 hours)')

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/Dropdown_StandardOrFlexible'))

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/btn_FLEXIBLE'))

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/btn_Save'))

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/btn_Save_Yes'))

WebUI.delay(1)

WebUI.click(findTestObject('Schedule Profile/btn_CreateNew'))

WebUI.setText(findTestObject('Schedule Profile/Schedule Profile Details/txt_ScheduleName'), 'Non-Punching')

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/tgl_Non-punching'))

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/btn_Save'))

WebUI.click(findTestObject('Schedule Profile/Schedule Profile Details/btn_Save_Yes'))

WebUI.delay(1)

WebUI.closeBrowser()

