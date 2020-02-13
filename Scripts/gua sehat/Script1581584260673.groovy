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
import helper.katalon
import objectRepository.guaSehat

WebUI.openBrowser('https://www.guesehat.com/')
String titleHomePage = WebUI.getWindowTitle()
WebUI.verifyEqual(titleHomePage, "Guesehat - Platform Kesehatan dengan Fitur Terlengkap", FailureHandling.STOP_ON_FAILURE)
WebUI.mouseOver(katalon.testObject("xpath", String.format(guaSehat.MenuArtikel)), 0)
WebUI.click(katalon.testObject("xpath", String.format(guaSehat.SelectOptionMedis)), 0)
WebUI.verifyElementPresent(katalon.testObject("xpath", String.format(guaSehat.ArtikelMedisOne)), 0)
String titleArtikelMedisPage = WebUI.getWindowTitle()
WebUI.verifyEqual(titleArtikelMedisPage, "Kumpulan Artikel Medis Terbaru di Guesehat.com", FailureHandling.STOP_ON_FAILURE)
WebUI.click(katalon.testObject("xpath", String.format(guaSehat.ArtikelMedisOne)), 0)
WebUI.verifyElementPresent(katalon.testObject("xpath", String.format(guaSehat.ImagePageMedisOne)), 0)
String TitleAtrikelOne = WebUI.getText(katalon.testObject("xpath", String.format(guaSehat.TitleArtikelOne)))
WebUI.verifyEqual(TitleAtrikelOne, "Penelitian: Trenggiling Penyebab Coronavirus pada Manusia")
WebUI.verifyElementPresent(katalon.testObject("xpath", String.format(guaSehat.VideoArtikel)), 0)
WebUI.click(katalon.testObject("xpath", String.format(guaSehat.LinkMedicalNews)))
String titlePageLink = WebUI.getWindowTitle()
WebUI.verifyEqual(titlePageLink, "Coronavirus: Pangolins may have spread the disease to humans")




