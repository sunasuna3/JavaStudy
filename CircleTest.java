/*=======================================
  ■■■ 클래스와 인스턴스 ■■■
========================================*/

//○실습 문제
//원의 넓이와 둘레 구하기

//원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로 (별도로) 생성한다.
//(클래스명 : CircleTest) -> CircleTest.java

//원의 넓이 = 반지름 * 반지름 * 3.141592
//원의 둘레 = 반지름 * 2 * 3.141592

//실행 예)
// 반지름 입력 :xxxxxx

// >> 반지름이 xxx인 원의
// >> 넓이 : xxxx.xxx
// >> 둘레 : xxx.xx
//계속하려면 아무 키나 누르세요....

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest 
{
	
	int r;
	
	void input() throws IOException 
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r =Integer.parseInt(br.readLine());
	}

	double calLentgh()
	{
		return r * r * 3.141592;

	}
	
	
	double calArea()
	{
		return r * 2 * 3.141592;

	}

	void print(double a, double l)
	{
		System.out.printf("반지름이 %d인 원의 넓이",r);
		System.out.println(">>넓이 : " + a);
		System.out.println(">>둘레 : " + l);

	}
	*/




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest 
{
	int r;
	final double PI = 3.141592;
		//final 쓰면 대문자 
	
	//BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	// 클래스 안에서 직접적으로 인스턴스 생성 구문은 바람직 xx
	// 메소드 안에서 사용하는것이 좋다.										

	void input() throws IOException 
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r =Integer.parseInt(br.readLine());

	}

	double calArea()
	{
		double result;
		
		result = r * r * PI;

		return result;
	}

	double calLentgh()
	{
		double result;

		result = r * 2 * PI;

		return result;
	}

	void print(double a, double l)
	{
		System.out.printf("n>>반지름이 %d인 원의 넓이\n",r);
		System.out.printf(">>넓이 : %.2f\n", a);
		System.out.printf(">>둘레 : %.2f\n", l);
	}

}