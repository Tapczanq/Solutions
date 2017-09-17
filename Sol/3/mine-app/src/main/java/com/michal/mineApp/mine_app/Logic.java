package com.michal.mineApp.mine_app;

import java.util.Random;

public class Logic {
	private String mineField;
	private String exampleLine1="*...";
	private String exampleLine2=".*..";
	private String exampleLine3="..*.";
	private String exampleLine4="...*";
	private String[] examples ={exampleLine1,exampleLine2,exampleLine3,exampleLine4};
	private char[][] board;
	private char field='-';
	 public String randomLine() {    
		 int random = (int) (Math.random()* examples.length);    
		 return examples[random]; 
		 }
	 public String createMineField(){
		 String s1=randomLine();
		 String s2=randomLine();
		 String s3=randomLine();
		return  mineField=s1+"\n"+s2+"\n"+s3;
	 }
	
	 
	 public void show(){
		 
	        System.out.println("\n     Lines");
	        for(int Line = 3 ; Line > 0 ; Line--){
	            System.out.print("       "+Line + " ");
	            
	            for(int Column = 1 ; Column < 4 ; Column++){
	                
	            }
	                
	            System.out.println();
	        }
	            
	        System.out.println("\n            1   2   3   4  ");
	        System.out.println("                      Columns");
	        
	    }
}

