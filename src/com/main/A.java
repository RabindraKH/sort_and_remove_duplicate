package com.main;
import java.util.Scanner;

public class A {
	public static void main(String args[]) {
		//Scanner class used for User input numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store");
		int arraySize=scan.nextInt();
		int [] array = new int[arraySize];
		System.out.println("Enter the numbers you want to store");
		for(int i=0;i<arraySize;i++) {
			array[i]=scan.nextInt();
		}
		
		//below code for sort the array
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		System.out.print("Sorted array:");
		for(int sort:array) {
			System.out.print(+sort+",");
	
		}
		System.out.println();
		
		
		
		//below code for remove the duplicate numbers
		int [] temp=new int[array.length];
		int j=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1]) {
				temp[j]=array[i];
				j++;
			}
		}
		temp[j]=array[array.length-1];
		
		System.out.print("Sorted and Duplicates removed:");
		for(int val:temp) {
			System.out.print(val+",");
		}
		System.out.println();
		
		
		
		//below code for remove last present Zeros 
		System.out.print("Sorted & Duplicates removed last '0's :");
		for(int i=0;i<=j;i++) {
		System.out.print(temp[i]+",");	
		}
	}

}
