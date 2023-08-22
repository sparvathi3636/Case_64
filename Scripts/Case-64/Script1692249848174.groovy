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

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_Delivery'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/div_Enter location'))

WebUI.setText(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/input_BACK_mat-input-1'), 'Hyderabad')

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/span_Hyderabad, Telangana, India'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/div_Search'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_ADD'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_ADD_1'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/input_Enter Mobile Number_mobile'), '240-345-1599')

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_Verify Mobile'))

WebUI.setEncryptedText(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_2ff584'), 
    'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Case 63-64/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_422a00'), 'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Case 63-64/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_61580c'), 'XtPiXH0+76g=')

WebUI.setEncryptedText(findTestObject('Case 63-64/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_69f762'), 'abkeNdhXnEA=')

WebUI.setEncryptedText(findTestObject('Case 63-64/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_6a0b2d'), 'ggNFythgxkw=')

WebUI.setEncryptedText(findTestObject('Case 63-64/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_79bc49'), 'FkW8c3ilUpA=')

WebUI.setEncryptedText(findTestObject('Case 63-64/Page_Nabe Eats/input_Please enter 7 digit One Time Passwor_e82323'), '74L4RplaxNs=')

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_CONFIRM OTP'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_Review Cart shopping_cart (2)'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_COUPON'))

WebUI.verifyElementText(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/p_coupon is not applicable ,please remove b_d44775'), 
    'coupon is not applicable ,please remove bonushourItem from your cart')

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_Ok'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/mat-icon_indeterminate_check_box'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_Place Order 43.99'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Mindboard Holdings LLC/a_Back'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/button_shopping_cart Place Order (1)'))

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Mindboard Holdings LLC/button_Check out as guest'))

WebUI.setText(findTestObject('Object Repository/Case 63-64/Page_Mindboard Holdings LLC/input_Card information_cardNumber'), 
    '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Case 63-64/Page_Mindboard Holdings LLC/input_Card information_cardExpiry'), 
    '12 / 23')

WebUI.setText(findTestObject('Object Repository/Case 63-64/Page_Mindboard Holdings LLC/input_Card information_cardCvc'), 
    '251')

WebUI.setText(findTestObject('Object Repository/Case 63-64/Page_Mindboard Holdings LLC/input_Name on card_billingName'), 
    'srikanth')

WebUI.click(findTestObject('Object Repository/Case 63-64/Page_Mindboard Holdings LLC/div_Pay_SubmitButton-IconContainer'))

WebUI.verifyElementText(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/h4_43.99'), '₹43.99')

WebUI.waitForElementVisible(findTestObject('Object Repository/Case 63-64/Page_Nabe Eats/span_Successful Payment'), 0)

WebUI.closeBrowser()

