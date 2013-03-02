package com.nbna.multidimensionalarray;

public class AddingTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1,2,3},{1,2,3},{1,2,3}};	
		int b[][] = {{0,0,1},{0,1,0},{0,0,1}};
		
		
		for(int i=0;i<3; i++){
			
			System.out.println();
			for (int j=0; j<3; j++){
				
				System.out.print(a[i][j]+"\t");
			}
		}
		System.out.println("\n+");
				
		for(int i=0;i<3; i++){			
			System.out.println();
			for (int j=0; j<3; j++){				
				System.out.print(b[i][j]+"\t");
			}
		}
		
		System.out.println("\n-----------------");
		for(int i=0;i<3; i++){
			
			System.out.println();
			for (int j=0; j<3; j++){				
				a[i][j] =  a[i][j] + b[i][j]; 
				//a[i][j] += b[i][j];
				System.out.print(a[i][j]+"\t");
			}
		}

	}

}
