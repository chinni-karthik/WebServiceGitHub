package com.ck.client;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class MyClient {
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("One IP Address should be required.. .!!!");
		}else{
			GeoIPService service			= new GeoIPService();
			GeoIPServiceSoap serviceSoap 	= service.getGeoIPServiceSoap();
			GeoIP stub 						= serviceSoap.getGeoIP(args[0]);
			System.out.println(stub.getCountryName());
		}
		
	}
}
