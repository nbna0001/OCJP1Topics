package com.nbna.array;

//This is the first program in arrays

import java.lang.reflect.Array;

public class SimpleArrayPrinting {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * To Demo array declaration using array initializer {}
		 */
		/*int a[] = {1,22,33,4,5};
		
		for(int j = 0; j<a.length;j++){
		System.out.println(a[j]);			
		}*/
		
		/*
		 * To Demo array declaration, using array initializer {} second approach. 
		 */
		/*
		int[] b = {10,20,30,40};
		
		for(int k: b){			
			System.out.println(k);
		}*/
		
		/*
		 * To Demo array declaration, using anonymous array expression new int[]
		 */
		 //int[]  c = {3,4};
		
		 /*
		  * To explain the difference between array initializer and anonymous array expression
		  */
		 //int d[];// = {4,5,6,7,8};
		 //d = new int[]{4,5,6,7,8}; //why is system throwing error here?
		 
		 
		/*
		 * To Demo simple array declaration fourth approach;
		 */
		
		 /*int[] e = new int[5]; 
		 	
		 for(int i=0; i<5; i++){			 
			 e[i] = i+10;
			 System.out.println(e[i]);
		 }*/
		
		
		/*
		 * To Demo that the array could be array of non premetive types
		 */		
		/*String[] str = {"hi","guys"};
		//System.out.println(str.toString());
		
		for (String st: str){
			System.out.println(st);
		}*/
		 
	}

}

/**
 * Write it down 20 times
 * int a[] = {1,2,3,4,5};
 * int[] b = {10,20,30,40};
 *  int[]  c = new int[]{3,4};
 *  int[] d = new int[5];
 *  String[] str = {"hi","guys"};
 */
