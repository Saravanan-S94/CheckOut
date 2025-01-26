package payilagam;

import java.util.regex.Pattern;

public class PatternLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int row = 1; row <= 7; row++) {
//			for(int col = 1; col <= 7; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

//		for(int row = 1; row <= 7; row++) {						I
//			for(int col = 1; col <= 7; col++) {
//				if( row == 1 || row == 7 || col == 4) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int row = 1; row <= 7; row++) {						//C
//			for(int col = 1; col <= 7; col++) {
//				if( row == 1 || row == 7 || col == 4) {
//					if(row == 1 && col == 1 || row ==7 && col == 1) {
//						System.out.print(" ");
//					}
//					else {
//						System.out.print("* ");
//					}
//				}
//			}
//			System.out.println();
//		}

//		for(int row = 1; row <= 7; row++) {						//D
//			for(int col = 1; col <= 7; col++) {
//				if( row == 1 || row == 7) {
//					if(col != 7) 
//						System.out.print("* ");
//				} 
//				else if(col == 1 || col == 7){
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//
//			System.out.println();
//		}
		
//		for(int row = 1; row <= 7; row++) {						//P
//			for(int col = 1; col <= 7; col++) {
//				if( row == 1 || row == 7) {
//					if(col != 7) 
//						System.out.print("* ");
//				} 
//				else if(col == 1 || col == 7){
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//
//			System.out.println();
//		}
//		for(int row = 1; row <= 7; row++) {						
//			for(int col = 1; col <= 7; col++) {
//				if(col == 1) {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int row = 1; row <= 7; row++) {						//R
//			for(int col = 1; col <= 7; col++) {
//				if( row == 1 || row == 7) {
//					if(col != 7) 
//						System.out.print("* ");
//				} 
//				else if(col == 1 || col == 7){
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//
//			System.out.println();
//		}
//		for(int row = 1; row <= 7; row++) {						
//			for(int col = 1; col <= 7; col++) {
//				if(col == 1 || col == 7) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int row = 1; row <= 7; row++) {						//B
//			for(int col = 1; col <= 7; col++) {
//				if( row == 1 || row == 7) {
//					if(col != 7) 
//						System.out.print("* ");
//				} 
//				else if(col == 1 || col == 7){
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//
//			System.out.println();
//		}
//		for(int row = 1; row <= 7; row++) {						
//			for(int col = 1; col <= 7; col++) {
//				if(row != 7) {
//					if(col == 1 || col == 7)
//					System.out.print("* ");
//				else 
//					System.out.print("  ");
//				}
//				else {
//					if(col != 7) 
//						System.out.print("* ");
//					}
//			}
//			System.out.println();
//			}
		
//		for(int row = 1; row <= 7; row++) {						//R2
//			for(int col = 1; col <= 7; col++) {
//				if( row == 1 || row == 7) {
//					if(col != 7) 
//						System.out.print("* ");
//				} 
//				else if(col == 1 || col == 7){
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//
//			System.out.println();
//		}
//		for(int row = 1; row <= 7; row++) {						
//			for(int col = 1; col <= 7; col++) {
//					if(col == 1 || col == row) {
//					System.out.print("* ");
//					}
//				else {
//						System.out.print("  ");
//					}
//			}
//			System.out.println();
//			}
		
//		for(int row = 1; row <= 7; row++) {			N			
//			for(int col = 1; col <= 7; col++) {
//				if(col == 1 || col == row || col == 7) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int row = 1; row <= 7; row++) {			Z			
//			for(int col = 1; col <= 7; col++) {
//				if(row == 7 || row == 1 || row + col == 8 ) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int row = 1; row <= 7; row++) {		X				
//			for(int col = 1; col <= 7; col++) {
//				if(row == col || row + col == 8 ) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int row = 1; row <= 7; row++) {		Y				
//			for(int col = 1; col <= 7; col++) {
//				if((row == col && col <=4) || row + col == 8 ) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int row = 1; row <= 7; row++) {		M				
//			for(int col = 1; col <= 7; col++) {
//				if((row == col && col <=4) || (row + col == 8 && row <=4) || col == 1 || col == 7 ) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int row = 1; row <= 7; row++) {			Y2			
//			for(int col = 1; col <= 7; col++) {
//				if((row == col && col <=4) || (row + col == 8 && row <=4) || (col == 4 && row >3)) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

		for(int row = 1; row <= 7; row++) {						
			for(int col = 1; col <= 7; col++) {
				if(row == 1 || row == 4 || row == 7) 
					System.out.print("* ");
				else {
					if(row == 2 || row == 3) {
						if(col == 1)
							System.out.print("* ");
					}
					else if(row == 5 || row == 6)
					{
						if(col == 7)
							System.out.print("* ");
					else
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
}
}