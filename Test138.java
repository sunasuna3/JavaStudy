/*==================================
■■■ 자바의 주요(중요) 클래스■■■
- Calendar 클래스
===================================*/

/*
○ java.util.Calendar 클래스는
	날짜와 시간을 객체 모델링화 한 클래스로
	연, 월, 일, 요일, 시, 분, 초 까지의
	시간과 날짜와 관련된 정보를 제공한다.
	그리고 Calendar 클래스는 추상클래스이므로 직접 객체를 생성할 수 없으며
	실제적인 메소드 구현은  Calendar  클래스의 서브 클래스인
	GregorianCalendar 클래스에 정의되어 있다.

	시스템으로부터 현재 시스템 시간 정보를 얻어올 떄
	getInstance() 라고 정적 메소드를 이용하여 객체를 생성할 수 있다.
	생성된 Calendar 클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며,
	이 객체가 생성되면 갖고 있는 시간 정보들을
	get() 메소드를 이용하여 쉽게 가져올 수 있다.

	GregorianCalendar()메소드는 내부적으로 GregorianCalendar 객체를 생성하여
	돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를
	구할 수도 있다.

*/

//○ 실습문제
//	사용자로부터 연, 월을 입력받아
//  해당 연 월의 달력을 그려주는(출력하는) 프로그램을 구현한다.
//  단, Calendar 클래스를 활용하여 작성할 수 있도록 한다.

//실행 예
//연도 입력 : 0
//연도 입력 : 2019
//월 입력: -2
//월 입력: 16
//월 입력: 7

/*
	[ 2019년 7월 ]

 일	월	화	수	목	금	토
 ==========================
  	 1	 2	 3	 4	 5	 6
 7	 8	 9	10	11	12	13
14	15	16	17	18	19	20
21	22	23	24	25	26	27
28	29	30	31
==========================
*/

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test138
{
	public static void main(String[] args) throws IOException
	{

		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Calendar cal = Calendar.getInstance();

		//주요 변수 선언
		int y,m;
		int w;
		int i;

		
		do
		{
			System.out.print("『연도』를 입력하세요 :");
			y=Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("『월』을 입력하세요 :");
			m=Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		//사용자로부터 입력받은 데이터 연(y), 월(m)을 이용하여
		//달력의 날짜 세팅

		cal.set(y,m-1,1);
		//--월 구성 시 입력값(m)을 그대로 사용하는 것이 아니라
		//   입력값에서 1을 뺸 값으로 월을 설정해야 한다,
		//--일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야 한다,
		
		//요일 가져오기
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		//확인
		//System.out.println(w);
		//--==> 2019년 3월 기준   6  => 금요일 -> 2019년 3월 6일 금요일

		
		System.out.println();
		System.out.println("\t [" + y+ " 년 " + m +" 월 ] ");
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");  
		System.out.println("===============================");
		for (i=1; i<w; i++ )
			System.out.print("    "); // 네 칸 공백

		//테스트
		//System.out.printf("%4d" ,1);
		
		//캘린더 클래스의 getActualMaximum() 메소드~
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++ )  
		{
			System.out.printf("%4d",i);
			w++;    //--반복문을 수행하며 날짜가 증가할 때 마다 요일도 함께 증가할 수 있도록 처리

			//개행에 대한 조건
			if (w%7==1) //일요일마다
			{
				System.out.println();  //개행
			}
		}

		if (w%7==1) //일요일마다
				System.out.println();  //개행



		System.out.println();
		System.out.println("===============================");
			
		
		
		

	
		
	}
}
	