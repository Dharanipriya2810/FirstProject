package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class dominos {

	public static void main(String[] args) {
		copyconstructor c = new copyconstructor("priya","24");
		copyconstructor d = new copyconstructor(c);//shallow constructor
		System.out.println(c.getName()+" "+d.getName());//shallow constructor
		System.out.println(c.getAge()+" "+d.getAge());//shallow constructor
		deepConstructor  e = new deepConstructor("prasath","22");
		deepConstructor f = new deepConstructor(e);//deep constructor
		System.out.println(e.getName()+" "+f.getName());//deep constructor
		System.out.println(e.getAge()+" "+f.getAge());//deep constructor
		System.out.println(c.getName()==d.getName());// true // shallow copy // dependent copies
		System.out.println(e.getName()==f.getName());// false // deep copy //independent copies
		 List<String> people = Arrays.asList("dhatarni","priya");
		 List<Integer> numbs = Arrays.asList(1,2,6);
		int arr[] = {1,9,2,8,9};
		 List<person> people1 = Arrays.asList(
		            new person("Alice", 30,"concentrix"),
		            new person("Bob", 25,"cognizant"),
		            new person("Charlie", 35,"capgemini")
		        );
		 
		person[] people2 = {
		            new person("Alice", 30,"concentrix"),
		            new person("Bob", 25,"cognizant"),
		            new person("Charlie", 35,"capgemini")
		};
		int sum=10;
		Set<int[]> bh = new HashSet<>();
		Set<String> h = new HashSet<>();

		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					int a = Math.min(arr[i], arr[j]);
					int b = Math.max(arr[i], arr[j]);
					String s = a+","+b;
					h.add(a+","+b);
					}
			}
		}

		Iterator<String> fg = h.iterator();
		while(fg.hasNext() ) {
			String name = fg.next();
			System.out.println(name);
		}
		

		Collections.sort(people,(a,b)->a.compareTo(b));
		Collections.sort(numbs,(a,b)->a.compareTo(b));
		Collections.sort(people1,(a,b)->Integer.compare(a.getAge(), b.getAge()));
		Arrays.sort(arr);
		Arrays.sort(people2,Comparator.comparing((person p) -> p.getAge()));
		Collections.sort(people1,Comparator.comparing((person p) -> p.getAge()));
		Arrays.sort(people2,(a,b)->Integer.compare(a.getAge(), b.getAge()));
		people1.sort(Comparator.comparing((person p) -> p.getAge()));
		Collections.sort(people1,Collections.reverseOrder(Comparator.comparing((person p) -> p.getAge())));
		
		Iterator<String> dfg = people.iterator();
		while(dfg.hasNext()) {
			String name = dfg.next();
			System.out.println(name);
		}
		
		String s = "foo";
		String t = "raa";
	       Map<Integer,Character> sc = new HashMap<Integer,Character>();
	       Map<Integer,Character> tc = new HashMap<Integer,Character>();
	       int count = 0;
		for(char r: s.toCharArray()) {
			sc.put(count++, r);
		}
		count = 0;
		for(char r: t.toCharArray()) {
			tc.put(count++, r);
		}
		
	boolean ans = sc.keySet().equals(tc.keySet());
	System.out.println(ans);
	List<int[]> arr1 = new ArrayList<>();
	List<int[]> arr3= new ArrayList<>();

	arr1.add(new int[]{7, 8});
	arr1.add(new int[]{1, 5});
	arr1.add(new int[]{2, 4});
	arr1.add(new int[]{4, 6});
	arr1.sort(Comparator.comparingInt(a -> a[0]));
	

	Iterator<int[]> b = arr1.iterator();
	while(b.hasNext()) {
		int[] name = b.next();
		System.out.println(Arrays.toString(name));
	}
	List<Integer> a = new ArrayList<>();
	for(int[] r: arr1) {
		for(int g : r)
		a.add(g);
	}
	System.out.println(a);
	int left = 0;
	int right = 1;
	while(right<a.size()) {
	 if(a.get(left)>=a.get(right)) {
			arr3.add(new int[] {a.get(left-1),a.get(right+1)});
			
		}
	 left++;
	 right++;
		
	}
	
	Iterator<int[]> g = arr3.iterator();
	while(g.hasNext()) {
		int[] name = g.next();
		System.out.println(Arrays.toString(name));
	}
	
	}
}


