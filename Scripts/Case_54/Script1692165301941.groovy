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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://menu.neighborhood-restaurant.com/#/business/602def6f5824426788ef5461/a')

WebUI.click(findTestObject('Object Repository/Case_53/Page_Nabe Eats/button_Pick-up'))

WebUI.click(findTestObject('Object Repository/Case_53/Page_Nabe Eats/button_ADD'))

WebUI.click(findTestObject('Object Repository/Case_53/Page_Nabe Eats/button_ADD_1'))

WebUI.click(findTestObject('Object Repository/Case_53/Page_Nabe Eats/button_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/Case_53/Page_Nabe Eats/input_Enter Mobile Number_mobile'), '230-345-1599')

WebUI.click(findTestObject('Object Repository/Case_53/Page_Nabe Eats/button_Verify Mobile'))

WebUI.setEncryptedText(findTestObject('Case_53/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_3d3fbb'), 'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Case_53/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_6571b8'), 'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Case_53/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_672b15'), 'XtPiXH0+76g=')

WebUI.setEncryptedText(findTestObject('Case_53/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_6c28e1'), 'abkeNdhXnEA=')

WebUI.setEncryptedText(findTestObject('Case_53/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_6e5707'), 'ggNFythgxkw=')

WebUI.setEncryptedText(findTestObject('Case_53/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_968ed4'), 'FkW8c3ilUpA=')

WebUI.setEncryptedText(findTestObject('Case_53/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_c40d8d'), '0mP41y2AN8w=')

WebUI.click(findTestObject('Object Repository/Case_53/Page_Nabe Eats/button_CONFIRM OTP'))

WebUI.click(findTestObject('Object Repository/Case_53/Page_Nabe Eats/button_shopping_cart Place Order (2)'))

WebUI.setText(findTestObject('Object Repository/Case_53/Page_Nabe Eats/input_Please enter your name_Username'), 'Srikanth')

WebUI.setText(findTestObject('Object Repository/Case_53/Page_Nabe Eats/input_Name_email'), 'Srikanth@as.com')

WebUI.click(findTestObject('Object Repository/Case_53/Page_Nabe Eats/button_SUBMIT'))

WebUI.click(findTestObject('Object Repository/Case_53/Page_Mindboard Holdings LLC/a_Back'))

WebUI.click(findTestObject('Object Repository/Case_53/Page_Nabe Eats/button_shopping_cart Place Order (2)'))

WebUI.setText(findTestObject('Object Repository/Case_53/Page_Mindboard Holdings LLC/input_Card information_cardNumber'), 
    '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Case_53/Page_Mindboard Holdings LLC/input_Card information_cardExpiry'), 
    '02 / 24')

WebUI.setText(findTestObject('Object Repository/Case_53/Page_Mindboard Holdings LLC/input_Card information_cardCvc'), '124')

WebUI.setText(findTestObject('Object Repository/Case_53/Page_Mindboard Holdings LLC/input_Name on card_billingName'), 'srikanth')

WebUI.click(findTestObject('Object Repository/Case_53/Page_Mindboard Holdings LLC/div_Pay_SubmitButton-IconContainer'))

WebUI.verifyElementText(findTestObject('Case_53/Page_Nabe Eats/h4_45.76'), '₹45.76')

WebUI.waitForElementVisible(findTestObject('Object Repository/Case_53/Page_Nabe Eats/span_Successful Payment'), 0)

WebUI.closeBrowser()

