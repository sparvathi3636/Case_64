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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

// Get the current date and time
//Date currentDate = new Date()
//
//SimpleDateFormat dateFormat = new SimpleDateFormat('yyyy-MM-dd HH:mm:ss')
//
//String currentTime = dateFormat.format(currentDate)
//
//// Log the current time
//println('Current Time: ' + currentTime)
//
//printf(currentTime)
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://menu.neighborhood-restaurant.com/#/business/602def6f5824426788ef5461/a')

WebUI.click(findTestObject('Object Repository/case_66/Page_Nabe Eats/button_Pick-up'))

WebUI.click(findTestObject('case_66/Page_Nabe Eats/button_ADD'))

WebUI.click(findTestObject('Object Repository/case_66/Page_Nabe Eats/img'))

WebUI.click(findTestObject('Object Repository/case_66/Page_Nabe Eats/img'))

WebUI.verifyElementText(findTestObject('case_66/Page_Nabe Eats/p_Next Available  FRI 530PM-1145PM'), 'Next Available : FRI 5:30PM-11:45PM')

WebUI.click(findTestObject('Object Repository/case_66/Page_Nabe Eats/img'))

WebUI.verifyElementText(findTestObject('case_66/Page_Nabe Eats/p_Next Available  FRI 530PM-1100PM'), 'Next Available : FRI 5:30PM-11:00PM')

WebUI.closeBrowser()

