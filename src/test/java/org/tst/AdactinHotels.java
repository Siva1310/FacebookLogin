package org.tst;

import org.openqa.selenium.WebElement;

public class AdactinHotels extends LibGlobal {
	public static void main(String[] args) {
	 AdactinHotels hotels = new AdactinHotels();
	 hotels.getDriver();
	 hotels.Loadurl("https://adactinhotelapp.com/");
	 hotels.Maximize();
	 
	}

}
