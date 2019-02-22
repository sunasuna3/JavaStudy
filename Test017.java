/*==============================================
  ■■■ 자바의 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : java.util.Scanner 
===============================================*/

// ※ java.utill.Scanner
// 단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
// 디폴트(default) 로 사용되는 단락 문자는 공백이다.
// 작성된 다음 토큰은 next() 메소드를 사용
// 다른 형태의 값으로 변환할 수 있다.

import java.util.Scanner;

public class Test017
{
	public static void main(String [] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//주요 변수 선언
		String name;
		int kor, eng, mat;
		int sum;

		//연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();

		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;

		//결과 출력
		System.out.println("이름 : " + name);
		System.out.printf("%d\n",sum);




	}
}
/*
이름을 입력하세요 : 권홍비
국어 점수 입력 : 10
영어 점수 입력 : 0
수학 점수 입력 : 10
이름 : 권홍비
20
계속하려면 아무 키나 누르십시오 . . .
*/