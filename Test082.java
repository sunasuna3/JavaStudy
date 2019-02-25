/*=========================
  ■■■ 배열 ■■■
  - 배열의 기본적인 활용
==========================*/
//○실습 문제
// 사용자로부터 인원 수를 입력받고
//이렇게 입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받아
//입력받은 내용을 전체 출력하는 프로그램을 구현한다.
//단, 배열을 활용하여 처리할 수 잇도록 한다.

//실행 예)
//입력 처리할 학생 수 입력(명, 1~10) : 3
//이름 전화번호 입력[1](공백 구분) : 곽한얼 010-1111-1111
//이름 전화번호 입력[2](공백 구분) : 권홍비 010-2222-2222
//이름 전화번호 입력[3](공백 구분) : 김경환 010-3333-3333

//---------------------
//전체 학생 수 :3명
//--------------------
//이름      전화번호
//곽한얼  010-1111-1111
//권홍비  010-2222-2222
//김경환  010-3333-3333
//---------------------
//계속하려면 아무 키나 누르세요...


import java.util.Scanner;

public class Test082
{
	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in);
		
		//사용자가 입력하는 학생수를 담아둘 변수
		int memCount=0;
		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10);

		//테스트
		//System.out.println("사용자가 입력한 인원 수 : "+memCount);

		//이름 저장 배열 구성  -> 입력받은 인원 수 만큼의 배열방 갯수
		 String[] names = new String [memCount];

		//전화번호 저장 배열 구성 -> 입력받은 인원 수 만큼의 배열방 갯수
		String [] tels = new String[memCount];

		//반복문을 활용하여 사용자의 입력 데이터를 배열에 담아내기
		for (int n=0;n<memCount;n++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) :",n+1);
			names[n] = sc.next();
			tels[n] = sc.next();
		}
		//최종 결과(이름, 전화번호 )출력
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("전체 학생 수 : %d명\n",memCount);		
		System.out.println("---------------------");		
		System.out.println("이름	전화번호");

		for (int m=0;m<memCount ;m++ )
		{
			System.out.printf("%3s %14s\n",names[m],tels[m]);
		}
		System.out.println();

//실행 결과
/*
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) :김선아 010-1111-1111
이름 전화번호 입력[2](공백 구분) :김선아 010-2222-2222
이름 전화번호 입력[3](공백 구분) :김선아 010-3333-3333

---------------------
전체 학생 수 : 3명
---------------------
이름    전화번호
김선아  010-1111-1111
김선아  010-2222-2222
김선아  010-3333-3333

계속하려면 아무 키나 누르십시오 . . .
*/







		


	}
}