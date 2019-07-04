package com.ns.prep.siemens;

import java.util.LinkedList;
import java.util.List;

public class ReplaceDuplicateWithVal {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 2, 10, 5, 3, 9, 2, 3, 11 };
		replaceDuplicateElementWithReplaceVAl(arr, 1);
		for (int a : arr) {
			System.out.println(a);
		}
	}

	public static void replaceDuplicateElementWithReplaceVAl(int arr[], int replaceVal) {
		List<Integer> valueList = new LinkedList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!valueList.contains(arr[i])) {
				valueList.add(arr[i]);
			} else {
				arr[i] = replaceVal;
			}
		}

	}
}
