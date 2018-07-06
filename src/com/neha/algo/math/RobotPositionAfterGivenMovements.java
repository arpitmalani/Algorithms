package com.neha.algo.math;

public class RobotPositionAfterGivenMovements {
	public static void main(String[] args) {
        String move = "UDDLLRUUUDUURUDDUULLDRRRR";
        finalPosition(move);
	}
	
	public static void finalPosition(String move){
		int countUp=0, countDown=0;
		int countLeft=0, countRight =0;
		
		for(int i=0;i<move.length();i++){
			if(move.charAt(i) == 'U'){
				countUp++;
			}
			if(move.charAt(i) == 'D'){
				countDown++;
			}
			
			if(move.charAt(i) == 'L'){
				countLeft++;
			}
			if(move.charAt(i) == 'R'){
				countRight++;
			}
		}
	}

}
