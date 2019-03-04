/*==================================
■■■ 정렬(Sort) 알고리즘 ■■■
-- 향상된 버블 정렬(Bubble Sort)
===================================*/


//○ 실습 문제
//	 사용자로부터 여러 학생의 성적 정보를 정수 형태로 입력받아
//   점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
//   단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행예)
// 인원수 입력 : 5
// 이름 점수 입력(1) : 나주영 90
// 이름 점수 입력(2) : 남상현 80
// 이름 점수 입력(3) : 유진석 85
// 이름 점수 입력(4) : 윤희진 75
// 이름 점수 입력(5) : 이기승 95

//==============
//1등 이기승 95
//2등 나주영 90
//3등 유진석 85
//4등 남상현 80
//5등 윤희진 75
//==============
//계속하려면 아무 키나 누르세요..
import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);

		int num=0;
		String name;
		
		String temp;


		System.out.print("인원수 입력 : ");
		num=sc.nextInt();
		
		int[] arr =new int[num];
		String[] arr2 =new String[num];
		String temp1;


		for (int i=0; i<arr2.length; i++ )
		{
			System.out.printf("이름 점수 입력(%d) : ",i+1);
			arr2[i] = sc.next();
			arr[i] = sc.nextInt();
			
		}

		for (int i=1; i<arr.length; i++ )
		{
			boolean q = false;
			for (int j=0; j<arr.length-i; j++ )
			{
				if (arr[j] < arr[j+1])
				{
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j+1]^arr[j];
					arr[j]=arr[j]^arr[j+1];
					
					temp1=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp1;

					q=true;
				}

			}

			if (q==false)
			{
				break;

			}
			

			
		}

		System.out.println("=============");
		for (int i=0; i<arr.length; i++ )
		{
			System.out.printf("%d등 %s %d\n",i+1,arr2[i],arr[i]);
		}
		System.out.println();

	}
}