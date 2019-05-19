package Dovelet;

import java.util.Scanner;

public class area01 {
	
	
	/*
	 * 
	 * 프로그램 명: area
		제한시간: 1 초
		두 자연수를 입력으로 받아 직사각형의 넓이를 구하는 프로그램을 작성하시오.
		
		입력
		두 자연수가 입력으로 주어지고 , 각각 가로 , 세로 길이이다.단위는 같은 것으로 가정한다.
		두 수는 1000 을 넘지 않는다.
		
		
		온라인 저지를 처음 사용하는 분들을 위해....
		"입력의 제한 조건 1000 을 넘지 않는다" 이 부분은 따로 처리 하지 않으셔도 됩니다. 입력 데이터가 이 범위를 넘어서 들어오지 않는다는 것입니다.
		이 제한 조건이 없으면 20 억 이상의 수가 입력으로 주어지는 경우 정수형 변수로 해결할 수가 없습니다. 즉 정수 범위 안의 입력이니 정수로 처리할 수 있다는 것입니다.
		
		"입력" "출력"...이 부분도 출력해서는 안되고 단지 두 수만 입력으로 받아서 결과 값만을 출력해야 합니다.
		시간초과 오류란 각 문제 당 제한 시간이 있어 이 제한 시간내에 결과가 나오지 않으면 이 오류를 출력합니다. 이 오류가 발생할 경우 조금 더 좋은 알고리즘을 생각해서 해결해야 합니다.
		출력
		직 사각형의 넓이를 출력한다.
		입출력 예
		입력
		
		10 20
		
		출력
		
		200
	 */
	
	public static void main(String[] args) {
		
		int length ; //가로  
		int width ; //세로 
		
		Scanner sc1 = new Scanner(System.in);
		length = sc1.nextInt();
		System.out.println("가로 : " + length);
		
		
		Scanner sc2 = new Scanner(System.in);
		width = sc2.nextInt();
		System.out.println("세로 : " + width);
		
		int output = length * width;
		
		System.out.println("넚이 : " + output);
	}

}
