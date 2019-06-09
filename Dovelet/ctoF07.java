package Dovelet;

import java.util.Scanner;

public class ctoF07 {
	
	
/*
 * 
 * 
 * 섭씨 온도를 화씨 온도로 변환하는 프로그램을 작성하세요.
	화씨 온도 = 9 / 5 * 섭씨온도 + 32
	
	입력
	1 에서 100 사이의 자연수가 입력으로 주어진다.
	
	출력
	소수 첫째 자리까지 출력한다.
	
	입출력 예
	입력
	50
	
	출력
	122.0

 * */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double input = sc.nextInt();
		System.out.println(input);
	
		double output = (9.0 / 5.0) * input + 32;
		System.out.println(output);
		
		
		
	}

}
