/*==============================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 자바의 기본 입출력  : BufferedReader
=============================================*/

// 사용자로부터 이름과 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

//===[결과]===
//이름 : 한승원
//총점 : 240
//============
//계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test014 
{

	public static void main(String[] args) throws IOException
	{
	
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//주요 변수 선언
		
		String name;
		int a,b,c,d;

		//연산 및 처리

		System.out.print("이름을 입력하세요 : ");

		name =  br.readLine();

		System.out.print("국어 점수 입력 : ");

		a = Integer.parseInt( br.readLine()); 

		System.out.print("영어 점수 입력 : ");
		b = Integer.parseInt( br.readLine()); 

		System.out.print("수학 점수 입력 : ");
		c = Integer.parseInt( br.readLine()); 

		d = a + b + c ;

		//결과 및 출력

		System.out.println("===[결과]===");
		System.out.printf("이름은 : %S\n", name);
		System.out.println("총점 : " + d);
		System.out.println("============");
		



      /*

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//주요 변수 선언
		String strName;   //--이름 변수
		int nKor, nEng, nMat, nTot;  //--국어, 영어, 수학, 총점 변수

		*/




	}
}