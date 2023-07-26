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

WebUI.click(findTestObject('Object Repository/TC001_Button/Page_LetCode - Testing Hub/a_Click'))

WebUI.click(findTestObject('Object Repository/TC001_Button/Page_Interact with Button fields/button_Find Location'))

WebUI.click(findTestObject('Object Repository/TC001_Button/Page_Interact with Button fields/button_Goto Home'))

WebUI.click(findTestObject('Object Repository/TC001_Button/Page_LetCode with Koushik/h1_LetCode with Koushik'))

WebUI.verifyElementText(findTestObject('Object Repository/TC001_Button/Page_LetCode with Koushik/h1_LetCode with Koushik'), 
    'LetCode with Koushik')

WebUI.callTestCase(findTestCase('Common/CloseBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

