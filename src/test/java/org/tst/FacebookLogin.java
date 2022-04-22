package org.tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin extends LibGlobal{


	public static void main(String[] args) {
		FacebookLogin login = new FacebookLogin();
		login.getDriver();
		login.Loadurl("https://ww.facebook.com");
		login.Maximize();
		WebElement findLocaterById = login.FindLocaterById("email");
		login.TypeText(findLocaterById, "sivabalasai008@gmail.com");
		WebElement findLocaterById2 = login.FindLocaterById("pass");
		login.TypeText(findLocaterById2, "Sivabala123");
		String getAttributeValue = login.GetAttributeValue(findLocaterById);
		System.out.println(getAttributeValue);
		String getAttributeValue2 = login.GetAttributeValue(findLocaterById2);
		System.out.println(getAttributeValue2);
		WebElement findLocaterByName = login.FindLocaterByName("login");
		login.Click(findLocaterByName);
		String getEnteredUrl = login.GetEnteredUrl();
		System.out.println(getEnteredUrl);
		String getTitle = login.GetTitle();
		System.out.println(getTitle);
		
		login.Close();
		




















































		//		/*FacebookLogin fb = new FacebookLogin();
		//		fb.getDriver();
		//		fb.Loadurl("https://www.facebook.com");
		//		fb.Maximize();
		//		WebElement user = fb.FindLocaterById("email");
		//		user.sendKeys("shiva");*/
		//
		//		FacebookLogin login = new FacebookLogin();
		//		login.getDriver();
		//		login.Loadurl("https://www.facebook.com");
		//		login.Maximize();
		//		WebElement locaterById = login.FindLocaterById("email");
		//		locaterById.sendKeys("sivabalasai007@gmail.com");
		//		WebElement locaterById2 = login.FindLocaterById("pass");
		//		locaterById2.sendKeys("Shivabalsai");
		//		WebElement byName = login.FindLocaterByName("login");
		//		login.Click(byName);
		//		login.GetEnteredUrl();
		//		System.out.println(login);


	}
}


