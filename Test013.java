/*==============================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 자바의 기본 입출력 
=============================================*/

//  삼각형이 밑변의 길이와 높이를 사용자로부터 입력받아
// 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예)
// ■ 삼각형의 넓이 구하기 ■
//- 삼각형의 밑변 입력 : 3
//- 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxxx
// 계속하려면 아무 키나 누르세요...

// ※ 삼각형의 넓이 = 밑변 * 높이 /2


import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException;

// import java.io.*;

public class Test013
{
	public static void main(String [] args) throws IOException
	{
		
		//내가 풀이한 내용
		/*

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//주요 변수 선언
		int a, b;
		double c;

		//연산 및 처리
		System.out.print("삼각형의 밑변 입력 : " );
		
		a = Integer.parseInt( br.readLine()); 

		System.out.print("삼각형의 높이 입력 : ");
		
		b = Integer.parseInt( br.readLine());

		c = a*b/2.0;

		
		//결과 및 출력
		
		
		System.out.printf("n>> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n " ,a,b,c);

		*/




		//함께 풀이한 내용

		//외부로부터 데이터를 입력받도록 처리하기 위해서
		//BurfferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		// 주요 연산 처리

		int underLenght, height ;   //-- 밑변과 높이
		double area;				//-- 넓이

		// 연산 및 처리
		// 1) 사용자에게 안내 메세지 출력
		System.out.println("■삼각형의 넓이 구하기■");
		System.out.print(" - 삼각형의 밑변 입력 : ");

		// 2) 사용자가 입력한 데이터를 정수 형태로 변환한 후 
		// 변수 underLenght 에 담아내기
		underLenght = Integer.parseInt(br.readLine());

		// 3) 다시 사용자에게 안내 메세지 출력
		System.out.print("- 삼각형의 높이 입력 : ");
		
		// 4) 사용자가 입력한 데이터를 정수 형태로 변환한 후 
		// 변수 height 에 담아내기
		height = Integer.parseInt(br.readLine());

		// 5) 삼각형의 넓이를 구하는 연산 처리
		area = underLenght * height / 2.0;
		//       정수         정수   정수
		//-- 실수 자료형이 결과값으로 나오는 과정에서
		//   실수 기반의 연산이 필요한 상황이다.
		//   정수형 『2』가 아닌 실수형 『2.0』으로 나눗셈 연산을 수행하게 되면
		//   이 연산은 실수 기반으로 처리된다.

		// 결과 출력
		//System.out.println();  //개행
		System.out.printf(">>밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n" , underLenght, height, area);
		

		

	}
}

// 실행 결과
/*
■삼각형의 넓이 구하기■
 - 삼각형의 밑변 입력 : 3
- 삼각형의 높이 입력 : 5
>>밑변이 3, 높이가 5인 삼각형의 넓이 : 7.50
계속하려면 아무 키나 누르십시오 . . .
*/
