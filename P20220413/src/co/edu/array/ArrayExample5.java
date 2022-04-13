package co.edu.array;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] scores = new int[5];
//		int max=0, min=100;
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생점수를 입력>>>>");
			scores[i] = scn.nextInt();
			sum +=scores[i];
		}
		
		int maxVal, minVal;
		maxVal = minVal = scores[0];
		
		for (int i = 0; i < scores.length; i++) {
			//최고점.
			if (scores[i] > maxVal) {
				maxVal = scores[i];
			}
			//최저점.
			if (scores[i] < minVal) {
				minVal = scores[i];
			}
		}
/*
		for(int j = 0; j < scores.length; j++) {
		if(scores[j] > max) {
			max = scores[j];
			
		} if (scores[j] < min){
			min = scores[j];
		}
	       // 학생중에 최고점, 최저점.
		}
		*/
		System.out.printf("최고점은 %d, 최저점은 %d\n", maxVal, minVal);
		System.out.println("총합은" + sum);
		
		//학생 이름, 점수
		//배열, 배열 0 => 학생, 90
	}

}
