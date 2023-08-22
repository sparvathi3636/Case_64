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

WebUI.navigateToUrl('https://menu.neighborhood-restaurant.com/#/business/602def6f5824426788ef5461/a')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/button_Delivery'))

WebUI.setText(findTestObject('Object Repository/Case_51/Page_Nabe Eats/input_BACK_mat-input-1'), 'hyderabad')

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/span_Hyderabad, Telangana, India'))

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/button_Search'))

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/button_ADD'))

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/button_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/Case_51/Page_Nabe Eats/input_Enter Mobile Number_mobile'), '240-345-1599')

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/button_Verify Mobile'))

WebUI.setEncryptedText(findTestObject('Case_51/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_0a7c4f'), 'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Case_51/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_0e407f'), 'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Case_51/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_38986b'), 'XtPiXH0+76g=')

WebUI.setEncryptedText(findTestObject('Case_51/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_7140ed'), 'abkeNdhXnEA=')

WebUI.setEncryptedText(findTestObject('Case_51/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_9c16f5'), 'ggNFythgxkw=')

WebUI.setEncryptedText(findTestObject('Case_51/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_b34616'), 'FkW8c3ilUpA=')

WebUI.setEncryptedText(findTestObject('Case_51/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_bbc934'), '0mP41y2AN8w=')

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/button_CONFIRM OTP'))

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/button_Review Cart shopping_cart (1)'))

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/b_CHANGE'))

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/div_Enter Amount'))

WebUI.setText(findTestObject('Object Repository/Case_51/Page_Nabe Eats/input_-- OR --_mat-input-10'), '30')

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/button_done_outline'))

WebUI.click(findTestObject('Object Repository/Case_51/Page_Nabe Eats/button_Place Order 65.78'))

WebUI.click(findTestObject('Case_51/Page_Nabe Eats/button_ADD - Copy'))

WebUI.click(findTestObject('Case_51/Page_Nabe Eats/button_Review Cart shopping_cart (1) - Copy'))

WebUI.click(findTestObject('Object Repository/Case_51/Page_Mindboard Holdings LLC/button_Check out as guest'))

WebUI.setText(findTestObject('Object Repository/Case_51/Page_Mindboard Holdings LLC/input_Card information_cardNumber'), 
    '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Case_51/Page_Mindboard Holdings LLC/input_Card information_cardExpiry'), 
    '12 / 34')

WebUI.setText(findTestObject('Object Repository/Case_51/Page_Mindboard Holdings LLC/input_Card information_cardCvc'), '123')

WebUI.setText(findTestObject('Object Repository/Case_51/Page_Mindboard Holdings LLC/input_Name on card_billingName'), 'srikanth')

WebUI.click(findTestObject('Object Repository/Case_51/Page_Mindboard Holdings LLC/div_Pay_SubmitButton-IconContainer'))

WebUI.verifyElementText(findTestObject('Object Repository/Case_51/Page_Nabe Eats/h4_65.78'), '₹65.78')

WebUI.waitForElementVisible(findTestObject('Object Repository/Case_51/Page_Nabe Eats/span_Successful Payment'), 0)

WebUI.closeBrowser()

