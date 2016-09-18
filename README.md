# SOAP Automation using Java

- The following weather soap service was used for automation testing

- <http://wsf.cdyne.com/WeatherWS/Weather.asmx> 

- The service wsdl is located at <http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL>

#### Generating Stub files from wsdl

```

	//this generates java stub files
	$ wsimport -keep -s src http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL

```

- The files should be moved under src/main/java source directory
