package co.edu.dimension;

public class ArrayExample2 {
	public static void main(String[] args) {

		//학급 1 ~ 3반
		//1반 : 3명
		//2반 : 4명
		//3반 : 2명
		
		int[][] scores = 
			    { 
				  {59, 63, 72} //
				  , {56, 77, 33, 24} //
				  , {55, 76} //
				};
		
		System.out.println(scores[0][2]);
		System.out.println(scores.length); // 배열의 크기
		System.out.println(scores[0].length); // 첫번째 배열의 배열크기.
		System.out.println(scores[1].length); // 두번째 배열의 배열크기.
		System.out.println(scores[2].length); // 세번째 배열의 배열크기.
		
		double avg = 0;
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
			avg = (double) sum / scores[i].length;
			System.out.println((i+1)+"번째 반의 합계:" + sum + ", 평균: " + avg);
		}
	}

}
