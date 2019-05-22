package Dovelet;

import java.util.Scanner;

public class swap03 {
	
	/*
	 * 
	 * 두 정수를 입력으로 받아 수를 교환하는 프로그램을 작성하시오.
	 * 
		입력
		두 정수가 입력으로 주어진다.
		
		출력
		두 정수를 바꾸어서 출력한다.
		
		입출력 예
		입력
		10 20
		
		출력
		20 10
		
		입력
		5 1
		
		출력
		1 5
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("입력 : " + num1 + " " + num2);
		
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println("출력 : " + num1 + " " + num2 );
		
		
		
		
	}

}
