package com.qa.sentenceShortener;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		System.out.println(compressor("Digital alarm clocks scare area each children"));

	}

	public static String compressor(String sentence) {
		String[] words = sentence.split(" ");
		List<String> newWords = new ArrayList<String>();

		for (int i = 0; i < words.length - 1; i++) {
			int shortest;
			int n = 0;
			if (words[i].length() > words[i + 1].length()) {
				shortest = words[i + 1].length();
			} else {
				shortest = words[i].length();
			}

			for (int j = shortest; j > 0; j--) {
				if (words[i].substring(words[i].length() - j, words[i].length()).equals(words[i + 1].substring(0, j))) {
					newWords.add(words[i] + words[i + 1].substring(j, words[i + 1].length()));
					i++;
					break;
				}
				n++;
			}
			if (n == shortest) {
				newWords.add(words[i]);
			}

			if (i == words.length - 2) {
				newWords.add(words[i + 1]);
			}

		}

		String endSentence = "";

		for (String i : newWords) {
			endSentence += i + " ";
		}

		endSentence = endSentence.substring(0, endSentence.length() - 1);

		if (!sentence.equals(endSentence)) {
			System.out.println(endSentence);
			endSentence = compressor(endSentence);
		}
		return endSentence;

	}
}
