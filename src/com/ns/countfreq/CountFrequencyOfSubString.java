package com.ns.countfreq;

public class CountFrequencyOfSubString {
	public static void main(String[] args) {
		System.out.println(findNumberOfSubstring("aaacaabbaa"));
	}

	public static int countFreqOfString(String str, String ptr) {
		int k = ptr.length();

		int countFreqOfString = 0;
		for (int i = 0; i <= str.length() - k; i++) {
			int j;
			for (j = 0; j < k; j++) {
				if (str.charAt(i + j) != ptr.charAt(j)) {
					break;
				}
			}
			if (j == k) {
				countFreqOfString++;
			}

		}
		return countFreqOfString;
	}

	public static int countMaxSubString(String str, int k) {
		int maxStringCount = 0;
		int subStringLength = 1;
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1) && subStringLength != k) {
				subStringLength++;
			} else if (subStringLength == k) {
				maxStringCount++;
				subStringLength = 1;
				i--;
			} else {
				subStringLength = 1;
			}
		}
		return maxStringCount;
	}

	static int maxSubStrings(String s, int k) {
		int maxSubStr = 0, n = s.length();

		// Iterate over all characters
		for (int c = 0; c < 26; c++) {
			char ch = (char) ((int) 'a' + c);

			// Count with current character
			int curr = 0;
			for (int i = 0; i <= n - k; i++) {
				if (s.charAt(i) != ch)
					continue;
				int cnt = 0;
				while (i < n && s.charAt(i) == ch && cnt != k) {
					i++;
					cnt++;
				}
				i--;

				// If the substring has a length
				// k then increment count with
				// current character
				if (cnt == k)
					curr++;
			}

			// Update max count
			maxSubStr = Math.max(maxSubStr, curr);
		}
		return maxSubStr;
	}

	public static int findNumberOfSubstring(String str) {
		int n = str.length();
		return n * (n + 1) / 2;
	}
}
