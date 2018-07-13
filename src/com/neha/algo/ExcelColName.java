package com.neha.algo;

//Print name of the excel column number lile 1=A, 26 = Z

public class ExcelColName {
	public static void main(String[] args) {
		
		printString(27);
		
//        printString(26);
//        printString(51);
//        printString(52);
//        printString(80);
//        printString(676);
//        printString(702);
//        printString(705);
	}
	
	public static void printString(int colNum){
		StringBuilder sb = new StringBuilder();
		while(colNum>0){
			int rem = colNum%26;
			if(rem==0){
				sb.append("Z");
				colNum=colNum/26-1;
			}else{
				colNum=colNum/26;
				sb.append((char)((rem - 1) + 'A'));
			}
		}
		System.out.println(sb.reverse());
	}

}
