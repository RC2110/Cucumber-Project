package org.tcs;

import java.util.Arrays;
import java.util.List;

public class ArraysAA {
	
	public void m1() {
		int a[]= new int[] {1,2,3,4};
		List<int[]> asList = Arrays.asList(a);
		System.out.println(asList);

	}
	public void m2() {
		String b[]= new String[] {"hello", "hi", "new"};
		List<String> asList = Arrays.asList(b);
		System.out.println(asList);
		
	}
	
	public static void main(String[] args) {
		ArraysAA a = new ArraysAA();
		a.m1();
		a.m2();
		
	}

}
