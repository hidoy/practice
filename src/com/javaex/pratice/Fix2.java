package com.javaex.pratice;
import java.util.Scanner;

public class Fix2 {
	public static void main(String[] args){
		int[] num=new int[6];
		for(int i=0;i<6;i++) {
			num[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(num[j]==num[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<6;i++) {
			System.out.println(num[i]);
		}
	}
}
