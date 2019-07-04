package com.ns.countfreq;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubStr {
	public static void main(String[] args) {
		System.out.println(longestUniqueSubStrUsingMap("abcdearpmnloh"));
	}

	static int longestUniqueSubStr(String str) {
		int max_len = 1;
		int curr_len = 1;
		int previous_index;
		int visited[] = new int[256];
		int i;
		for (i = 0; i < visited.length; i++)
			visited[i] = -1;

		visited[str.charAt(0)] = 0;

		for (i = 1; i < str.length(); i++) {
			previous_index = visited[str.charAt(i)];

			if (previous_index == -1 || i - curr_len > previous_index)
				curr_len++;
			else {
				max_len = curr_len > max_len ? curr_len : max_len;
				curr_len = i - previous_index;
			}
			visited[str.charAt(i)] = i;
		}
		return curr_len > max_len ? curr_len : max_len;
	}

	static int longestUniqueSubStrUsingMap(String str) {
		int max_len = 1;
		int curr_len = 1;
		int previous_index;

		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		int i;

		charCountMap.put(str.charAt(0), 0);

		for (i = 1; i < str.length(); i++) {
			previous_index = charCountMap.get(str.charAt(i)) == null ? -1 : charCountMap.get(str.charAt(i));

			if (previous_index == -1 || i - curr_len > previous_index)
				curr_len++;
			else {
				max_len = curr_len > max_len ? curr_len : max_len;
				curr_len = i - previous_index;
			}
			charCountMap.put(str.charAt(i), i);
		}
		return curr_len > max_len ? curr_len : max_len;
	}
}
