package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class demo {

	public static void main(String[] args) {
		String str = "Hello World";
		Map<Character, Long> countStr = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countStr);
 
	
	 String st = "bbacba";
	 char[] s = st.toCharArray();
	 String finals ="";
	 Set<Character> strSet = new HashSet<>();
     for (char c : st.toCharArray()) {
         strSet.add(c);
     }
     String strt = strSet.toString();
     System.out.println(strt);
    String str2 = strt.replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
    System.out.println("sub"+str2.substring(0, str2.length()));
     System.out.println(str2);
     int count=0;
	 int h =0;
     HashMap<String,Integer> has = new HashMap<>();
     for(int i=0;i<s.length;i++) {
    	 count=0;
     
    	 for(int j=i;j<s.length;j++) {
    		 finals = finals+ st.charAt(j);
    	    	 if(finals.contains(Character.toString(str2.charAt(0))) && finals.contains(Character.toString(str2.charAt(1))) && finals.contains(Character.toString(str2.charAt(2)))) 
    	    	 {
    	    		 count++;
    	    		has.put(finals, has.getOrDefault(finals, 0) + 1);//another method to get the accurate count
    	     }
    			 
    	 }
    	 finals = "";
    	 
     }
     
     
     System.out.println(has.size());
     System.out.println(has);
     
     // algorithm 2
     
     
   
	
	
	}
}
