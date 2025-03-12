package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class singleton {

	private static singleton single;

	private singleton() {

	}

	public static singleton getSingleton() {
		if (single == null) {
			single = new singleton();
		}
		return single;
	}
}

public class dog {

	public static void main(String[] args) throws NumberFormatException{
		singleton s = singleton.getSingleton();
		singleton s1 = singleton.getSingleton();

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

		String str = "abc";
		permute(str, "");
		
		int[] array = {5, 2, 9, 1, 6};
		int temp= array[0];
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++) {
				if(temp<array[j]) {
					temp = array[j];
				}
			}
		}
	}

	static void permute(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String r =  str.substring(0, i);
				String rem = r+str.substring(i + 1);
				permute(rem, prefix + str.charAt(i));
			}
		}
	}

	
}
