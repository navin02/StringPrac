package com.ns.prep.siemens;

public class SeparateCamelCaseWord {
	public static void main(String[] args) {
		String name = "NavinShah";
		String[] nameArr = name.split("(?=[A-Z])");

		for (String val : nameArr) {
			System.out.print(val + " ");
		}
	}
}
