package com.oocl.ita.yapo.day6.assigment;

import java.util.ArrayList;
import java.util.List;

public class TwelveBalls {
	
	public TwelveBalls() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> balls = new ArrayList<Integer>();
//		balls.add(0);
//		
//		
//		for(int x=1; x<12; x++) {
//			balls.add(1);
//		}
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		
		A.add(1);
		A.add(1);
		A.add(1);
		A.add(1);
		
		B.add(1);
		B.add(1);
		B.add(1);
		B.add(1);
		
		C.add(1);
		C.add(1);
		C.add(0);
		C.add(1);
		
		System.out.println("A: " + A.toString());
		System.out.println("B: " + B.toString());
		System.out.println("C: " + C.toString());
		
		int sumA = A.get(0).intValue() + A.get(1).intValue() + A.get(2).intValue() + A.get(3).intValue();
		int sumB = B.get(0).intValue() + B.get(1).intValue() + B.get(2).intValue() + B.get(3).intValue();
		int sumC = C.get(0).intValue() + C.get(1).intValue() + C.get(2).intValue() + C.get(3).intValue();
		
		if(sumA == sumB) {
			sumA = A.get(0).intValue() + A.get(1).intValue() + A.get(2).intValue(); 
			sumC = C.get(0).intValue() + C.get(1).intValue() + C.get(2).intValue();
			System.out.println("A group and B group is equal");
			System.out.println("C group has the odd ball");
			System.out.println("Remove A4 in A group and remove C4 in C group");
			System.out.println("Compare A1, A2, A3 and C1, C2, C3");
			if (sumA == sumC) {
				System.out.println("A group ");
				System.out.println("C4 is the odd ball");
			} else if (sumC < sumA) {
				System.out.println("C group is lighter than A group");
				System.out.println("Either C1, C2, C3 is the odd (lighter) ball");
				System.out.println("Remove C3 in C group and compare C1 and C2");
				if (C.get(0).intValue() <  C.get(1).intValue()) {
					System.out.println("C1 is lighter than C2");
					System.out.println("C1 is the odd ball");
				} else if (C.get(0).intValue() >  C.get(1).intValue()) {
					System.out.println("C2 is lighter than C1");
					System.out.println("C2 is the odd ball");
				} else if (C.get(0).intValue() ==  C.get(1).intValue()) {
					System.out.println("C1 and C2 is equal");
					System.out.println("C3 is the odd ball");
				}
			} else if (sumA > sumC) {
				
			}
		} else if(sumA > sumB) {
			
		} else if(sumA < sumB) {
			
		}
		

//		 static int randomWithRange(int min, int max)
//		 {
//		    int range = (max - min) + 1;     
//		    return (int)(Math.random() * range) + min;
//		 } 

		
	}

}
