package objectRepository

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class guaSehat {
	public static final String MenuArtikel = '//*[@id="wrapper"]/header/div/nav/ul/li[1]/a'
	public static final String SelectOptionMedis = '//*[@id="wrapper"]/header/div/nav/ul/li[1]/div/ul/li[2]/a'
	public static final String ArtikelMedisOne = '//*[@id="story-contlist"]/li[1]/div/div/h3/a'
	public static final String ImagePageMedisOne = '//*[@id="content"]/article/div/div[1]/img'
	public static final String TitleArtikelOne = '//*[@id="content"]/article/div/div[3]/div[1]/h1'
	public static final String VideoArtikel = '//*[@id="player_uid_528426875_1"]/div[4]/div'
	public static final String LinkMedicalNews = '//*[@id="content"]/article/div/div[3]/div[1]/div[4]/p[35]/a[1]'
}
