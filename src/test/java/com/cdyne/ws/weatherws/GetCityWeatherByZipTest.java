package com.cdyne.ws.weatherws;

import junit.framework.Assert;
import junit.framework.TestCase;

public class GetCityWeatherByZipTest extends TestCase {
	
	public void testDesPlainesWeather() throws Exception {
		
		Weather weather = new Weather();
		WeatherSoap weathersoap = weather.getWeatherSoap();
		WeatherReturn weatherReturn = weathersoap.getCityWeatherByZIP("60016");
		Assert.assertTrue(weatherReturn.getState().contains("IL"));
		Assert.assertTrue(weatherReturn.getCity().toLowerCase().contains("des plaines"));
		System.out.println("Des Plaines WeatherId =" + weatherReturn.getWeatherID());
	}
	
	public void testMonroeWeather() throws Exception {
		
		Weather weather = new Weather();
		WeatherSoap weathersoap = weather.getWeatherSoap();
		WeatherReturn weatherReturn = weathersoap.getCityWeatherByZIP("71201");
		Assert.assertTrue(weatherReturn.getState().contains("LA"));
		Assert.assertTrue(weatherReturn.getCity().toLowerCase().contains("monroe"));
		System.out.println("Monroe WeatherId =" + weatherReturn.getWeatherID());
	}

}
