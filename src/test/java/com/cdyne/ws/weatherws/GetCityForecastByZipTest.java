package com.cdyne.ws.weatherws;

import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

public class GetCityForecastByZipTest extends TestCase{
	
	
	public void testDesPlainesWeather() throws Exception {

		Weather weather = new Weather();
		WeatherSoap weathersoap = weather.getWeatherSoap();
		ForecastReturn forecastReturn = weathersoap.getCityForecastByZIP("60016");
		//String output = forecastReturn.getResponseText();
		//System.out.println(output);
		
		//System.out.println(forecastReturn.getState().contains("IL"));
		
		Assert.assertTrue(forecastReturn.getState().contains("IL"));
		
		ArrayOfForecast fc=  forecastReturn.getForecastResult();
		List<Forecast> lfc = fc.getForecast();
		
		for (Forecast f:lfc){
			System.out.println(f.getDate() + " " + f.getDesciption());
		}

	}
	
	public void testMonroeWeather() throws Exception {

		Weather weather = new Weather();
		WeatherSoap weathersoap = weather.getWeatherSoap();
		ForecastReturn forecastReturn = weathersoap.getCityForecastByZIP("71201");
		//String output = forecastReturn.getResponseText();
		//System.out.println(output);
		
		//System.out.println(forecastReturn.getState().contains("IL"));
		
		Assert.assertTrue(forecastReturn.getState().contains("LA"));
		
		ArrayOfForecast fc=  forecastReturn.getForecastResult();
		List<Forecast> lfc = fc.getForecast();
		
		for (Forecast f:lfc){
			System.out.println(f.getDate() + " " + f.getDesciption());
		}

	}
	
	

}
