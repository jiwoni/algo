package Dovelet;

import java.util.Scanner;

public class average06 {
	
	/*
	 * 
	 * 네 정수를 입력 받아 평균을 출력하는 프로그램을 작성하세요.
		정수 입력 사이에는 공백으로 구분되며 , 평균은 소수 2 째 자리까지 출력하세요.(소수 3 번째 자리에서 반올림)
		
		입력
		입력은 1 에서 100 사이의 자연수가 입력된다.
		출력
		
		입출력 예
		입력
		7 7 7 7
		
		출력
		7.00
		
		입력
		2 5 9 5
		
		출력
		5.25
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		double num3 = sc.nextInt();
		double num4 = sc.nextInt();
		
		double avg = (num1 + num2 + num3 + num4)/4 ; 
		System.out.println(String.format("%.2f", avg) ); //소수점 n번째 자리까지 반올림
	}
}
