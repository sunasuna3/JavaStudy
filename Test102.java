/*===============================
■■■ 정렬(Sort) 알고리즘 ■■■
-- 선택 정렬(Seletion sort)
===============================*/

/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높기이 위함
		-> 보기좋게... 검색하기 위함

○ 정렬의 종류
	: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬,..
*/

public class Test102
{
	public static void main(String[] args)
	{
		int [] a = {52, 42, 12, 62, 60};
		 /*
		 52, 42, 12, 62, 60		0	1
		 ======
		 42, 52, 12, 62, 60		0	2
		 ==      ===
		 12, 52, 42, 62, 60		0	3
		 ==          ==
		 12, 52, 42, 62, 60		0	4
		 ==              ==   
		 
		 -------------------- 1회전 끝
		 12, 52, 42, 62, 60		1	2
		     ==  ==
		 12, 42, 52, 62, 60		1	3	
		     ==      ==
			 ==          ==		1	4
		 -------------------- 2회전 끝
		 12, 42, 52, 62, 60		2	3
		         == ===
				 ==      ==		2	4
		 -------------------- 3회전 끝
		 12, 42, 52, 62, 60		3	4
					 ==  == 	i   j
		 -------------------- 4회전 끝
		 */
		/*
		 for (int i=0; i<a.length; i++ )
		 {
			 for (int j=1+i; j<a.length; j++ )
			 {
				 if (a[i] > a[j] )
				 {
					 a[i] = a[i]^a[j];
					 a[j] = a[j]^a[i];
					 a[i] = a[i]^a[j];
				 }
			 }
		 }

		
		for (int i=0; i<a.length; i++ )
		 {
			System.out.println(a[i] +" ");
		 }
		 */

		 int i, j;
		/*
		 System.out.print("Source Date : " );
		 for (i=0; i<a.length; i++ )
		 {
			System.out.println(a[i] +" ");
		 }
		 System.out.println();
		 */

		 //향상된 for문 -> forEach 구문
		 System.out.print("Sorted Date : ");
		 for (int n : a ) //a-> 대상구조   n-> a를 구성하고 있는 하나의 데이터 타입(여기서는 int)  ex) Record[] recArr;  -> for(Record n : recArr) Record 타입			//--> 변수명은 아무거나 (여기서는 n)
			 System.out.print(n + " ");
		 System.out.println();
		 //--==> Source Date : 52, 42, 12, 62, 60  (정렬한거 아님)

		 //Selection sort 구현
		 for (i=0;i<a.length-1; i++ ) //0123(4) -> 비교 기준 데이터의 인덱스
		 {
			 //System.out.println("웅");
			 for (j=i+1; j<a.length;j++ ) //0-1234 -> 비교 대상 데이터의 인덱스
			 {							 //1-234 
				//System.out.println("쑝");
				 if (a[i]>a[j])			//오름차순 조건 구성  -> 내림차순일때 <
				 {
					 //자리 바꾸기
					 a[i]=a[i]^a[j];
					 a[j]=a[j]^a[i];
					 a[i]=a[j]^a[i];
				 }
			 }
		 }

		 //결과물 출력
		for (int n : a )
			System.out.print(n + " ");
		System.out.println();


	}
}

/*
Sorted Date : 52 42 12 62 60
12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/
