package com.nikokivimakiwilders.com.nikokivimakiwilders.maven.eclipse;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

import java.util.ArrayList;


public class Parser {
	
	ArrayList<String> sanat = new ArrayList<String>();
	
	public ArrayList<String> parse() {
		File path = new File("assets/kotus-sanalista_v1.xml");
		
		try {

	        SAXBuilder sax = new SAXBuilder();
	        // XML is a local file
	        Document doc = sax.build(path);

	        Element rootNode = doc.getRootElement();
	        List<Element> list = rootNode.getChildren("st");

	        for (Element target : list) {

	            String sana = target.getChildText("s");

	            sanat.add(sana);

	        }
	        
	        return sanat;

	    } catch (IOException | JDOMException e) {
	        e.printStackTrace();
	        return new ArrayList<String>();
	    }
		
	}

}
