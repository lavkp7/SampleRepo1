package com.training.utility;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input");
	//	String str = sc.next();
		String str= sc.nextLine();
		
		System.out.println(str);
		System.out.println("======");		
		StringTokenizer st = new StringTokenizer(str);
	//	int count=0;
	//	System.out.println(st.nextToken());
	//	while(st.hasMoreTokens()) {
//		while(st.nextToken()!=null) {
//		System.out.println(st.nextToken());
//			count++;
//			
//	}
		System.out.println("======");		

	System.out.println(st.countTokens());

		//System.out.println(count);
		}
	}


