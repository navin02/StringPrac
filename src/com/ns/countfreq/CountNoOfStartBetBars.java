package com.ns.countfreq;

public class CountNoOfStartBetBars {
	// String : "*|**|****|***|***"
	// startIndex: 1
	// endIndex:13
	// result = 2+4+3 = 9
	//
	// startIndex: 1
	// endIndex:6
	// result = 2
	public static void main(String[] args) {
		System.out.println(countNoOfStars("*|**|****|***|***", 4, 13));
	}

	public static int countNoOfStars(String str, int startIndex, int endIndex) {

		int firstIndexOfBar = 0;
		int lastIndexOfBar = 0;
		boolean isFirstIndexFound = false;
		int countBar = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			if (str.charAt(i) == '|' && !isFirstIndexFound) {
				firstIndexOfBar = i;
				countBar++;
				isFirstIndexFound = true;
			} else if (str.charAt(i) == '|') {
				lastIndexOfBar = i;
				countBar++;
			}

		}
		return (lastIndexOfBar - firstIndexOfBar) - (countBar - 1);
	}
}
