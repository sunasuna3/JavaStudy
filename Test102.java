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
		 52, 42, 12, 62, 60
		 ======
		 42, 52, 12, 62, 60
		 ==      ===
		 12, 52, 42, 62, 60
		 ==          ==
		 12, 52, 42, 62, 60
		 ==              ==   
		 
		 -------------------- 1회전 끝
		 12, 52, 42, 62, 60
		     ==  ==
		 12, 42, 52, 62, 60
		     ==      ==
			 ==          ==
		 -------------------- 2회전 끝
		 12, 42, 52, 62, 60
		         == ===
				 ==      ==
		 -------------------- 3회전 끝
		 12, 42, 52, 62, 60
					 ==  == 
		 12, 42, 52, 60, 62
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
		 for (int n : a ) //a-> 대상구조   n-> a를 구성하고 있는 하나의 데이터 타입(여기서는 int)  ex) Record[] recArr;  -> for(Record n : recArr) Record 타입			//--> 변수명은 아무거나 (여기서는 n)
			 System.out.print(n + "");
		 System.out.println();
		 //--==> Source Date : 52, 42, 12, 62, 60  (정렬한거 아님)


	}
}