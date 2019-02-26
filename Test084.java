/*=========================
  ■■■ 배열 ■■■
  - 배열의 기본적인 활용
==========================*/
//○과제
//사용자로부터 학생 수를 입력받고, 그 만큼의 점수(정수형태)를 입력받아
//전체 학생 점수의 합, 평균, 편차를 구하여 결과를 출력하는 프로그램을 구현한다.
//단, 배열을 활용하여 구현할 수 있도록 한다.

//실행 예)
//학생 수 입력 : 5
//1번 학생의 점수 입력 : 90
//2번 학생의 점수 입력 : 82
//3번 학생의 점수 입력 : 64
//4번 학생의 점수 입력 : 36
//5번 학생의 점수 입력 : 98

// >>합 : 370
// >>평균 : 74.0
// >>편차
// 90 : -16.0
// 82 : -8
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
//계속하려면 아무 키나 누르세요...
import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		int total; //입력 받을 학생 수
		System.out.print("학생 수 입력 : ");
		total=sc.nextInt();

		int [] arr = new int [total]; //배열의 길이가 total인 int형 배열 선언
		int sum=0;   //합 초기화
		for (int i=0; i<total; i++ )  
		{
			System.out.printf("%d번 학생의 점수 입력 : ",i+1);
			arr [i] =sc.nextInt();
			sum += arr[i];  //합 구하기
		}

		double avg = (double)sum/total;   //평균구하기
		
		double [] arr2 = new double[total]; //배열의 길이가 total인 double형 배열 선언
		for (int i=0;i<total ;i++ )
		{
			arr2 [i]=avg-arr[i];
			 
		}

		//결과 출력
		System.out.println();
		System.out.printf(">> 합 : %d\n",sum);
		System.out.printf(">> 평균 : %.1f\n",avg);
		System.out.println(">>편차 ");

		for (int i=0; i<total; i++ )
		{
			System.out.printf("%d : %.1f\n" , arr[i],arr2[i]);
		}

	}
}

//실행 결과
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>> 합 : 370
>> 평균 : 74.0
>>편차
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
계속하려면 아무 키나 누르십시오 . . .

*/