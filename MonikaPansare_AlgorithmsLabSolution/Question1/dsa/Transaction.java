package com.greatlearning.dsa;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
	
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
         int size = scan1.nextInt();
         int[] transaction = new int[size];
         System.out.println("Enter the value of transaction");
         /*
          * transaction[0]..transaction[1]..transaction[2]..transaction[3]..transaction[4]..transaction[size]
          */
         for(int i=0;i<size;i++) {
        	 transaction[i] = scan1.nextInt();
         }
         System.out.println("Enter the the total number of targets that is to achieved");
	       int targetNo = scan1.nextInt();
	       while(targetNo > 0) {
	    	   int flag = 0;
	    	   int target;
	    	   System.out.println("Enter the value of the target");
	    	   target = scan1.nextInt();
	    	   long sumOfTransactions=0;
	    	   for(int i=0;i<size;i++) {
	    	 sumOfTransactions = sumOfTransactions+transaction[i];
	    	   if(sumOfTransactions >= target) {
	    		   System.out.println("target achieved after "+(i+1)+"Transaction");
	    		   flag = 1;
	    		   break;
	    	   }
	    	   targetNo--;
	       }
	       }
	       
	}
	}


