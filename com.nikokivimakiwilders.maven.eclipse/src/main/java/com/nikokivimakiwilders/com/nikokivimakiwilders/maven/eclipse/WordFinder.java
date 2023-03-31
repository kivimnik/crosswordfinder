package com.nikokivimakiwilders.com.nikokivimakiwilders.maven.eclipse;

import java.util.ArrayList;

public class WordFinder {
	private Parser p;

	private ArrayList<String> words;

	public WordFinder() {
		p = new Parser();
		words = p.parse();
	}

	public ArrayList<String> getWords(int minLen, int maxLen, char[] chars) {

		ArrayList<String> results = new ArrayList<String>();
		String word;
		boolean compatible;

		for(int i = 0; i < words.size(); i++) {
			word = words.get(i).toLowerCase();
			compatible = true;
			if(word.length() > minLen-1 && word.length() < maxLen+1) {
				for(int j = 0; j < chars.length; j++) {
					if(chars[j] != '0') {
						if(chars[j] != word.charAt(j)){
							compatible = false;
						}
					}
				}
				if(compatible) {
					results.add(word);
				}
			}
		}

		return results;
	}


}
