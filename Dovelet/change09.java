package Dovelet;

import java.util.Scanner;

public class change09 {
	
	/**
	 * 
	 * 제한시간: 1 초
		상점에서 물건을 사고 지폐로 돈을 내면 거스름 돈을 줘야 한다. 이 때 동전을 어떻게 해서 줘야 하는지 계산하시오.
		돈은 반드시 1000 원을 내며 , 거스름 돈은 10 원 , 50 원 , 100 원 동전으로 하고 큰 동전 우선으로 준다.
		
		입력
		물건 값으로 세자리 자연수가 입력으로 주어진다. 일의 자리는 0 이다.
		
		출력
		동전 100 원 , 50 원 , 10 원의 개수를 출력한다.
		
		입출력 예
		입력
		530
		
		출력
		4 1 2
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b,c,d,e,f,g;
		
		b = 1000 - a ; //거슬러 줄 돈 .. 470
		c = b / 100 ; // 거슬러 줄 100 원 동전 개수 ..4
		d = b % 100 ; // 100 원을 거슬러 주고 남은 돈 .. 70
		e = d / 50 ; // 거슬러 줄 50 원 동전 개수 .. 1
		f = d % 50 ; // 마지막으로 거슬러 줄 돈 20
		g = f / 10 ; // 거슬러 줄 10 원 동전 개수 
		 
		
		System.out.println(c + " " + e + " " + g);
	}
}
