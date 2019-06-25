package com.restassuredpractice.vishwa;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.common.exception.PathException;


  



public class parser {
	
	 public  static String getvalue(String object,String Jpath) {
		
		 String value = null;
		 JsonPath jp = new JsonPath(object);
		 
		 value = jp.getString(Jpath);
		 return value;
	}
	 
	 
	 public  static String getvaluexml(String object,String Jpath) {
			
		 String value = null;
		 XmlPath jp = new XmlPath(object);
		 
		 value = jp.getString(Jpath);
		 return value;
	}
}
