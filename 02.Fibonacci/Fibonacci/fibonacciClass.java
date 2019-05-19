package Fibonacci;

import java.awt.print.Printable;
import java.util.Scanner;

public class fibonacciClass {
	
	
	/*
	 * 
	 * 피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다. 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.

	Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers. Given an integer N, find the sum of all even fibonacci numbers.

	예제)

	Input: N = 12

	Output: 10 // 0, 1, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.
	 
	 *
	 */	
	
	/*
	 * 
	 * 동적 프로그래밍
	개념 : 큰 문제의 해답에 그보다 작은 문의 해답이 포함되어 있을 떄 프로그램의 속도를 비약적으로 향상 시킨다.
	
	피보나치 수열
	개념 : 대표적인 동적 프로그래밍의 사례로 자기자신은 자신과 닮은 자기 보다 작은 것들로 구성된다.
	
	1 1 2 3 5 8 13 21 34 ..
	점화
	f(n) =f(n-1) + f(n-2)
	f(1) = f(2) = 1*/

	//비효율 
	/*static int fibonacci (int n) {
		if(n ==1 || n==2){
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	*/
	
	
	static int fibonacci (int n) {
		/*
		 * debugging....
		 * 
		
		 n = 4 , f[4]=0
		 f[4]=fib(3)+ fib(2) = 2+1=3
		 
		 n = 3 , f[3]=0
		 f[3]=fib(2)+ fib(1) = 1+1=2
		 
		 n = 2 , f[2]=0
		 f[2]=fib(1)+ fib(0) = 1
		 
		  n = 1 , f[1]=1
		  if(f[n]!=0) 로 들어감 
		  
		  ...
		  
		 */
		
		if(f[n]!=0) { //f[1] = 1 경우, 처음으로 돌아왔을 때, 
			return f[n];
		}
		else {
			if(n ==1 || n==2){
				f[n] = 1;
				
			}
			else {
				f[n] = fibonacci(n-1) + fibonacci(n-2);
				//System.out.println("f[n] : " +  f[n]);
					
			}
			
			return f[n];
		}
		
	}
	
	
	static int [] f;
	public static void main(String[] args) {
		
		System.out.print("Input : ");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		f = new int[input]; //배열 생성시 0으로 초기화 됨, 배열요소는 자동적으로 int의 기본값(default)인 0으로 초기화 된다. 
		
		System.out.println("Input : N = " + input);
		
		int sum = 0;
		
		for(int i = 1; fibonacci(i) < input; i++ ) { 
			//System.out.println("i : " + i);
			
			int tmp = fibonacci(i);
			
			if( (tmp < input) && (tmp % 2 == 0)) {
				//System.out.println("짝수 : " + odd);
				sum += tmp;
			}
		
		}
		System.out.println("Output : " + sum);
		
		/*
		 * 
		 * 
		 	Input : 12
			Input : N = 12
			Output : 10


		 	Input : 35
			Input : N = 35
			Output : 44
			
			Input : 145
			Input : N = 145
			Output : 188

		 
		 * 
		 * */
		
			
		
		
		
	}
	
}
