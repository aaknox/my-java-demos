package org.ranieri.questions;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a = 8;
		Integer b = 8;
		
		Integer y = 1000;
		Integer z = 1000;
		
		System.out.println(a==b);
		System.out.println(y==z);
		
		
		double start = 0; 
		double end = 0;
		
		start = System.currentTimeMillis();
		for (int i =0 ; i <100000; i++ ) {
			Integer x = 0;
			
			for(int j = 0; j<100;j++) {
				x++;
			}		
		}
		end = System.currentTimeMillis();
		
		System.out.println("Addition within byte range "+ (end-start) /1000);
		
	
		start = System.currentTimeMillis();
		for (int i =0 ; i <100000; i++ ) {
			Integer x = 300;
			
			for(int j = 0; j<100;j++) {
				x++;
			}		
		}
		end = System.currentTimeMillis();
		
		System.out.println("Addition outside of byte range "+(end-start) /1000);
	
	
	
	
	
	}

}
