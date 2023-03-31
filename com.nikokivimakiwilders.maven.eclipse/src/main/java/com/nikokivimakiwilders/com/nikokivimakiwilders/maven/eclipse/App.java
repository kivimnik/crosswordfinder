package com.nikokivimakiwilders.com.nikokivimakiwilders.maven.eclipse;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        WordFinder w = new WordFinder();
        ArrayList<String> test = w.getWords(6, 8, new char[]{'0', '0', 'k', 'r'});
        if(test.size() > 0) {
        	for(int i = 0; i < test.size(); i++) {
        		System.out.println(test.get(i));
        	}
        }
    }
}
