package com.cdyne.ws.weatherws;

import java.util.List;

import junit.framework.TestCase;

public class GetWeatherInformationTest extends TestCase{
	
	public void testWeatherInfo01() throws Exception {
		
		Weather weather = new Weather();
		WeatherSoap weathersoap = weather.getWeatherSoap();
		
		ArrayOfWeatherDescription arrayOfWeatherDescription = weathersoap.getWeatherInformation();
		List<WeatherDescription> lwd = arrayOfWeatherDescription.getWeatherDescription();
		for(WeatherDescription l : lwd){
			System.out.println(l.getWeatherID() + " " + l.getDescription());
		}
	}
	
}
