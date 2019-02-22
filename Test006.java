 /*=============================
 ■■■■ 변수와 자료형 ■■■
  - 지역변수의 초기값 테스트
  - 형 변환 / 접미사
 ===============================*/
 
public class Test006
{
	public static void main(String [] args)
	{
		//변수 선언(지역 변수 a)
		int a;

		//System.out.println("a의 결과 :" + a );
		//---> 에러 발생 (컴파일 에러)
		// ※ 지역 변수를 초기화 하지 않고 사용했기 때문에 발생하는 에러

		//※ Primetive Type 의 지역 변수는
		//  초기화 과정을 거지치 않고 사용하지 못한다.
		//  값이 담기지 않은 상태에서 출력하고자 하면
		//  에러가 발생하는 것이다.
		
		//초기화(->메모리에 값 할당)
		a = 10;

		//초기화 이후 다시 출력
		System.out.println("a의 결과 : " + a);
		//---===> a의 결과 : 10

        // 변수 선언 및 초기화
		byte b =20;

		// 결과 출력
		System.out.println("b의 결과 : " + b );
		//----> b의 결과 : 20


		//변수 선언
		short c;

		//연산 및 처리 (대입 연산)

		//c = a;
		//-- 에러 발생
		//에러 사유 ---> 자료형이 작은 것에 큰 것을 담지 못한다.
		//             ( 자동 형 변환 규칙 위반)


		//명시적인 형 변환(강제 형 변환)
		c = (short) a;
		//00000000 00000000 00000000 00001010
		//
		//00000000 00001010
		//a가 가지고 있는 데이터를
		//short 형으로 형 변환한 후 c에 대입한다.


		
		//결과 출력
		System.out.println("c의 결과 : " + c );
		//--==>c의 결과 : 10

		//변수 선언 및 초기화
		long d = 10000000000L;
		// --접미사 『L』 이 중요하다.
		//   long형은 숫자(상수)뒤에 『L』또는 『l』을 붙여
		//  상수를 표현해야 한다
		//  즉, 약 21억 이상 되는 상수에는 뒤에 접미사를 꼭
		//  붙여줄 수 있도록 한다.

		System.out.println("d의 결과 : " + d);
		//--==> d의 결과 : 10000000000

		
		int e = 030;
		System.out.println("e의 결과: " + e);
		//-- 접두사 『0』 -> 8진수
		//--==> e의 결과: 24
		
		int f = 0xa6;
		System.out.println("f의 결과 : " + f);
		//--접두사 『0x』 -> 16진수
		//--==> f이 결과 : 166

		float g = 0;
		System.out.println("g의 결과  : " + g);
		
		//--==> g의 결과  : 0.0

		float h = 0.0f;
		System.out.println("h의 결과  : " + h);


	
	}
}

//실행 결과
/*
a의 결과 : 10
b의 결과 : 20
c의 결과 : 10
d의 결과 : 10000000000
e의 결과: 24
f의 결과 : 166
g의 결과  : 0.0
h의 결과  : 0.0
계속하려면 아무 키나 누르십시오 . . .
*/