package com.restassuredpractice.vishwa;



import static org.junit.Assert.assertThat;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.Matchers;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.*;

public class Mainclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String result = FileUtils.readFileToString(new File("C:\\Users\\Vishwadeep\\eclipse-workspace\\Restassured Project\\src\\com\\restassuredpractice\\vishwa\\result.json") );
		System.out.println(result);
		
		System.out.println(parser.getvalue(result, "store.book.category"));
		
		

		Matchers m = new Matchers();
		
	
	c1 todo1 = new c1(0, 0, 0);
	c1 todo2 = new c1(1, 1, 1);
	c1 todo3 = null;
	
	assertThat(todo1, hasProperty("c"));
	assertThat(todo1, m.hasProperty("a",m.equalTo(0)));
	

	result = FileUtils.readFileToString(new File("C:\\Users\\Vishwadeep\\eclipse-workspace\\Restassured Project\\src\\com\\restassuredpractice\\vishwa\\result.xml") );
	System.out.println(result);
	
	System.out.println(parser.getvaluexml(result, "note.to"));
	
	

	
	
	
}
	
	
	
	
	
	
}
