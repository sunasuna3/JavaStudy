/*=========================
■■■ 클래스 고급 ■■■
- 인터페이스(Interface)
===========================*/

//○ 실습 문제
//	성적 처리 프로그램을 구현한다.
//   단, 인터페이스를 활용할 수 있도록 한다.

//실행 예)
//인원 수 입력(1~10) : 2
//1번째 학생의 학번 이름 입력(공백구분) : 1921004 이원영
//국어 영어 수학 점수 입력	 (공백구분) : 90 100 85
//2번째 학생의 학번 이름 입력(공백구분) : 1921005 이재준
//국어 영어 수학 점수 입력	 (공백구분) : 85 70 65

// 1921004 이원영 90 100 85              275  91
//                수  수 우
// 1921005 이재준 85  70 65              220  73
//                우  미 양
//계속하려면 아무 키나 누르세요....

//속성만 존재하는 클래스 -> 자료형 활용

import java.util.Scanner;

class Record
{
	String hak,name;     //--학번, 이름
	int kor, eng, mat;   //--국어, 영어, 수학 점수
	int tot, avg;         //--총점, 평균(편의상 정수)
}

interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

//문제 해결 과정에서 설계해야 할 클래스

//인터페이스를 상속받은 인터페이스를 구현한 추상 클래스
//abstract class SungjukImpl implements Sungjuk
//   ↓
//인터페이스를 상속받은 인터페이스를 구현한  클래스
class SungjukImpl implements Sungjuk
{
	int num=0;
	Record[] arr;
	
	public void set()
	{
		Scanner sc =new Scanner(System.in);
		//입력한 수가 1보다 작거나 10보다 크면 다시 입력받기
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);

		//배열방을 num 만큼 생성
		arr = new Record[num];
				
	}


	public void input()
	{
		Scanner sc= new Scanner(System.in);

		//Record 클래스 기반의 인스턴스 생성
		arr = new Record[num];
		for (int i=0; i<arr.length; i++ ) //입력받은 학생 인원 수 만큼 반복
		{
			arr[i]=new Record();
			//안내 메세지 출력
			System.out.printf("%d번째 학생의 학번 이름 입력(공백구분) : ",i+1);
			//사용자가 입력한 데이터를 arr 배열에 담아내기
			arr[i].hak=sc.next();
			arr[i].name=sc.next();
			//안내 메세지 출력
			System.out.print("국어 영어 수학 점수 입력(공백구분) : ");
			//사용자가 입력한 데이터를 arr 배열에 담아내기
			arr[i].kor=sc.nextInt();
			arr[i].eng=sc.nextInt();
			arr[i].mat=sc.nextInt();
		}

		for (int i=0; i<num ;i++ )
		{	//총점 산출하기
			arr[i].tot = arr[i].kor +arr[i].eng + arr[i].mat;
			//평균 산출하기
			arr[i].avg = arr[i].tot/3; 
		}

	}

	
	public void print()
	{
		for (int i=0; i<num; i++ )
		{	
			//학번, 이름, 국어점수, 수학점수, 영어점수, 총점, 평균 출력하기
			System.out.printf(" %s %s %d %d %d %d  %d\n",arr[i].hak,arr[i].name,arr[i].kor,arr[i].eng,arr[i].mat,arr[i].tot,arr[i].avg);
		
		//국어점수, 수학점수, 영어점수를 각각 수우미양가 출력하기
		//90-수
		//80-우
		//70-미
		//60-양
		//50-가
		switch (arr[i].kor/10)
		{
		case 10:case 9: System.out.print("\t\t수"); break;
		case 8 : System.out.print("\t\t우"); break;
		case 7 : System.out.print("\t\t미"); break;
		case 6 : System.out.print("\t\t양"); break;
		case 5 : System.out.print("\t\t가"); break;
		default : System.out.print("\t\t가"); break;
		}
		switch (arr[i].eng/10)
		{
		case 10:case 9: System.out.print(" 수"); break;
		case 8 : System.out.print(" 우"); break;
		case 7 : System.out.print(" 미"); break;
		case 6 : System.out.print(" 양"); break;
		case 5 : System.out.print(" 가"); break;
		default : System.out.print(" 가"); break;
		}
		switch (arr[i].mat/10)
		{
		case 10:case 9:System.out.println(" 수"); break;
		case 8 : System.out.println(" 우"); break;
		case 7 : System.out.println(" 미"); break;
		case 6 : System.out.println(" 양"); break;
		case 5 : System.out.println(" 가"); break;
		default : System.out.print(" 가"); break;
		}
			
		}
	}
		
	
}


public class Test116
{
	public static void main(String[] args)
	{

		Sungjuk ob= new SungjukImpl();

		//문제 해결 과정에서 작성해야 할 ob 구성

		ob.set();
		ob.input();
		ob.print();
	}
}

//실행 결과
/*
인원 수 입력(1~10) : 2
1번째 학생의 학번 이름 입력(공백구분) : 1921004 이원영
국어 영어 수학 점수 입력(공백구분) : 90 100 85
2번째 학생의 학번 이름 입력(공백구분) : 1921005 이재준
국어 영어 수학 점수 입력(공백구분) : 85 70 65
 1921004 이원영 90 100 85 275  91
                수 수 우
 1921005 이재준 85 70 65 220  73
                우 미 양
계속하려면 아무 키나 누르십시오 . . .
*/