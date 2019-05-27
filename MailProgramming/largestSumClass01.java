package largestSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class largestSumClass {
	
	 /*
	  * 
	  * 정수 배열(int array)가 주어지면 가장 큰 이어지는 원소들의 합을 구하시오. 단, 시간복잡도는 O(n).
		Given an integer array, find the largest consecutive sum of elements.
		
		﻿
		예제}
		
		Input: [-1, 3, -1, 5]
		Output: 7 // 3 + (-1) + 5
		
		Input: [-5, -3, -1]
		Output: -1 // -1
		
		Input: [2, 4, -2, -3, 8]
		Output: 9 // 2 + 4 + (-2) + (-3) + 8
	  * 
	  * 
	  * 
	  * */


	/*
	 * 
	 * 
	 * 1)[-1, 3, -1, 5]
	  	-1
		-1 + 3 = 2
		-1 + 3 + -1 = 1
		-1 + 3 + -1 + 5 = 6
		3 + -1 = 2
		3 + -1 + 5 = 7 (채택)
		-1 + 5 = 6
		5
		
		첫 번째 배열부터 하나씩 차례로 더하는데, 더한 값(sumResult)이 현재 가장 큰 값(maxResult) 보다 작으면 버려지고, 더한 값(sumResult)이 현재 가장 큰 값(maxResult) 보다 크면 더한 값(sumResult)이 현재 가장 큰 값(maxResult)가 된다.
		sumResult < maxResult ::: maxResult = maxResult
		sumResult > maxResult ::: maxResult = sumResult

		2)[-5, -3, -1]
		-5
		-5 + -3 = -8
		-5 -3 -1 = -9
		-3 -1 = -4
		-1 (채택)
		
		3)[2, 4, -2, -3, 8]
		2
		2+4=6
		2+4-2=4
		2+4-2-3=1
		2+4-2-3+8=9 (채택)
		4-2=2
		4-2-3=-1
		4-2-3+8=7
		-2-3=-5
		-2-3+8=3
		-3+8=5
		
	 * 
	 * */
	
	public static void main(String[] args) {
		
		System.out.print("Input : ");

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); //[-1, 3, -1, 5]

		input = input.replaceAll("\\[", "");
		input = input.replaceAll("\\]", "");
		
		System.out.println("Input : " + input);

		//입력받은 배열 길이 
		int cnt = 0;
	    int fromIndex = -1;
	    while ((fromIndex = input.indexOf(",", fromIndex + 1)) >= 0) {
	    	cnt++;
	    }
		
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0; i < cnt+1; i++) 
			arr.add(input.split(",")[i].trim());
			
			
		//StringTokenizer tokens = new StringTokenizer(input, ",");
		//for(int i=1; tokens.hasMoreElements(); i++) System.out.println("tokens : " + tokens.nextToken().trim());
		
		int maxSum =0; //현재 가장 큰 
		int currentSum=0 ; //더한 값 
		
		for(int i = 0; i < arr.size(); i++) {
			
	
			  currentSum = Integer.parseInt(arr.get(i));
				if(Integer.parseInt(arr.get(i))>maxSum) {
					maxSum = Integer.parseInt(arr.get(i));
				}
				for(int j=i+1; j<arr.size(); j++) {
					currentSum += Integer.parseInt(arr.get(j));
					if(currentSum>maxSum) {
						maxSum = currentSum;
					}
				}

		/*	  
		 *방법 2) 
		 *    currentSum = Math.max(currentSum + Integer.parseInt(arr.get(i)), Integer.parseInt(arr.get(i)));
			  maxSum = Math.max(currentSum, maxSum);
			
			  System.out.println("currentSum : " + currentSum);
			  System.out.println("maxSum : " + maxSum);
		 */
			  

		
		/*	
		 * 미해결- 삽질 코딩 ) 순환으로 해결하려 했지만.. (별만들기 원리로 생각 https://www.youtube.com/watch?v=j8gtO00QxYQ )
		 *  
		 * for(int j=0; j<=i; j++) { //순환 j는 i만큼 
				
				int fst=0;
				int scd=0;
				
				fst= Integer.parseInt(arr.get(i));
				scd+=fst + Integer.parseInt(arr.get(j+1));
				System.out.println("fst : " + fst);
				System.out.println("scd : " + scd);
				int largest = Math.max(fst, scd);
				System.out.println("largest : " + largest);
			}*/
			
			
		}
		
		System.out.println("result maxSum ~~!! : " + maxSum);
	}
	
	
	
	
	
	/*
	 * * 해설지 )
	 * 
	 * 이 문제는 두개의 정수 변수로 현재의 합(currentSum) 과 전체의 제일 큰 합(max Sum)을 저장해야 합니다. 각 원소마다 (currentSum + 원소) 값을 원소 값이랑 비교하고, 더 큰 값이 currentSum이 됩니다. maxSum은 currentSum 이 바뀔때마다 체크하여 제일 큰 값을 저장하면 됩니다. 

		int solution(int[] arr) {
		  int maxSum = arr[0];
		  int currentSum = arr[0];
		  for(int i = 1; i < arr.length; i++) {
		    currentSum = Math.max(currentSum + arr[i], arr[i]);
		    maxSum = Math.max(currentSum, maxSum);
		  }
		  return maxSum;
		}
		
		시간 복잡도: O(n)
		공간 복잡도: O(1)
	 */
}
