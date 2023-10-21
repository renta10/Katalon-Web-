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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/v1/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Username'), 'standard_user')

//WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Password'), 'secret_sauce')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/clik_button_submit'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.saucedemo.com/v1/inventory.html')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_ADD TO CART1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_ADD TO CART2'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Click chart Button'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_CHECKOUT')) 

WebUI.verifyEqual(WebUI.getUrl(),"https://www.saucedemo.com/v1/checkout-step-one.html")

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_first-name'), 'Renta')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_last-name'), 'Nadila')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postal-code'), '0008998')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Continue_cart_button'))

WebUI.verifyEqual(WebUI.getUrl(),"https://www.saucedemo.com/v1/checkout-step-two.html")

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_FINISH'))

WebUI.verifyEqual(WebUI.getUrl(), "https://www.saucedemo.com/v1/checkout-complete.html")

