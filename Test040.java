/*==============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  -   - switch 문 실습
===============================================*/

/*
- 다중 선택문이라 하며, switch 문 다음의 수식 값에 따라
  실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

 -형식 및 구조
   switch (수식)
   {
	   case 상수1 : 문장1;[break;]
	   case 상수2 : 문장2;[break;]
			.
			.
	 [defult : 문장n+1;] [break;]
	}

	switch 문의 수식과 case 의 상수는
	byte, short, int, long 형이어야 한다.

	case 문뒤에 break; 이 없는 형태인 경우
	다음 case문의 문장을 계속해서 수행하게 된다. (기본 모델)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test040
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		int kor,eng,mat;
		String name;

		System.out.print("이름을 입력하세요 : ");
		name=br.readLine();

		System.out.print("국어 점수를 입력 :");
		kor=Integer.parseInt(br.readLine());

		System.out.print("영어 점수를 입력 :");
		eng=Integer.parseInt(br.readLine());

		System.out.print("수학 점수를 입력 :");
		mat=Integer.parseInt(br.readLine());

		
		//총점 산출
		int tot = kor + eng + mat;
		
		//평균 산출
		int avg = tot/3; 

		char grade = 'F';
		
		//등급 산출
		switch (avg/10 )
		{
			case 10 : case 9 : grade =  'A'; break;
			case 8 : grade =  'B'; break;
			case 7 : grade =  'C'; break;
			case 6 : grade =  'D'; break;
			default : grade =  'E'; 
	
		}

		System.out.println();
		System.out.printf("당신의 이름은 %s 입니다. \n", name);
		System.out.printf(">>국어 점수는 : %d \n", kor);
		System.out.printf(">>영어 점수는 : %d \n", eng);
		System.out.printf(">>수학 점수는 : %d \n", mat);
		System.out.printf(">>총점은 %d 이고, 평균은 %d 입니다.\n", tot, avg);
		System.out.printf(">>등급은 %c 입니다.\n", grade);

		


	}
}