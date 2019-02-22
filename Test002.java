/*==================================
         자바 기본 프로그래밍
   -자바 소스 코드 입력 및 컴파일 실습
   - println() 과 print() 
   =================================*/



public class Test002
{
	public static void main(String[] args)
	{
		System.out.println("첫 번째 구문...");
		System.out.println("두 번째 구문...\n");
		System.out.print("세 번째 구문...\n");
		System.out.print("네 번째 구문...\n\n\n");
	
		
		//-- println() 메소드와 print()의 메소드의 차이는 
		//  라인 스킵(줄바꿈, 개행) 유무에 있다.
		// \n을 문자열에 포함하면 라인 스킵이 가능하다.
		// 여러 번 사용하는 것도 가능하다.

		System.out.println(7);
		System.out.println('7');
		System.out.println("7");
		
		System.out.println(7+7);
		System.out.println('7'+'7');
		System.out.println("7"+"7");
		
	}
	
}
//실행 결과
/*
첫 번째 구문...
두 번째 구문...

세 번째 구문...
네 번째 구문...

  
7
7
7
14
110
77
계속하려면 아무 키나 누르십시오 . . .
*/






