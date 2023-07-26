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

WebUI.callTestCase(findTestCase('Common/StartBrowserAndNavigateToUrl'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TC002_ClickRadioButton/Page_LetCode - Testing Hub/a_Toggle'))

WebUI.click(findTestObject('Object Repository/TC002_ClickRadioButton/Page_LetCode - Testing Hub/h1_Radio  Checkbox'))

WebUI.verifyElementText(findTestObject('Object Repository/TC002_ClickRadioButton/Page_LetCode - Testing Hub/h1_Radio  Checkbox'), 
    'Radio & Checkbox')

WebUI.click(findTestObject('Object Repository/TC002_ClickRadioButton/Page_LetCode - Testing Hub/input_Yes_answer'))

WebUI.click(findTestObject('Object Repository/TC002_ClickRadioButton/Page_LetCode - Testing Hub/input_checkbox'))

WebUI.verifyElementChecked(findTestObject('Object Repository/TC002_ClickRadioButton/Page_LetCode - Testing Hub/input_Yes_answer'), 
    1)

WebUI.verifyElementNotChecked(findTestObject('TC002_ClickRadioButton/Page_LetCode - Testing Hub/input_checkbox'), 0)

WebUI.callTestCase(findTestCase('Common/CloseBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

