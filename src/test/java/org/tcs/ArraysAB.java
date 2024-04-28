package org.tcs;


public class ArraysAB {
	
	public Object[][] m1(){
		Object[][] object = new Object[][] {{"username", "password"},
											{"userName2", "passWord2"}};
					return object;				     
		}
	
	public void m2(String[][]x) {
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
	
	public String[][] m3() {
		String[][]x= {{"username", "password"},
					{"userName2", "passWord2"}};
		return x;
		
	}
	public static void main(String[] args) {
		
		ArraysAB ab = new ArraysAB();
		Object[][] m1 = ab.m1();
		
		String[][] m3 = ab.m3();
		ab.m2(m3);
		ab.m4();
	}
	
	public void m4() {
		int a[][]= new int[][] {{1,2,3},{4,5,6}};
		System.out.println(a[1][2]);
		
		
	}
}

