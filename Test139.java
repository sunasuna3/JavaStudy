/*==================================
■■■ 자바의 주요(중요) 클래스■■■
- Calendar 클래스
===================================*/


// 실습문제
// 오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
// 확인하여 결과를 출력하는 프로그램을 구현한다.
// 단, Calendar 클래스를 활용하여 처리한다.

//실행 예
// 오늘 날짜 : 2019-3-8-금요일
// 몇 일 후의 날짜를 확인하고자 하십니까?? 200

//========[확인결과]==========
// 200일 후 : 2019-xx-xx x 요일
//============================
//계속하려면 아무 키나 누르세요..




import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test139
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		Calendar cal = Calendar.getInstance();
		
		int y,m,d,w,nal;

		String[] week ={"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;  //--『+1』 check~!!!!
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK)-1;


		System.out.println( "오늘 날짜 : "+ y + "-" + m + "-" + d + " " +week[cal.get(Calendar.DAY_OF_WEEK)-1]);

		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까??  ");
		nal = Integer.parseInt(br.readLine());
		

		cal.add(Calendar.DATE,nal);

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;  
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK)-1;


		System.out.println("========[확인결과]==========");
		System.out.println( nal +"일 후 : "+ y + "-" + m + "-" + d + " " +week[cal.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println("============================");

		*/

		Calendar now = Calendar.getInstance();
		int nalsu;		//-- 사용자로부터 입력받은 날 수 
		int y,m,d,w;	//-- 연,월,일,요일
		String[] week ={"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};

		//현자의 연, 월, 일, 요일 확인(가져오기: get())
		y=now.get(Calendar.YEAR);
		m=now.get(Calendar.MONTH)+1;
		d=now.get(Calendar.DATE);
		w=now.get(Calendar.DAY_OF_WEEK);

		//현재의 연, 월, 일, 요일 확인결과 출력
		System.out.println( "오늘 날짜 : "+ y + "-" + m + "-" + d + " " +week[w-1]);

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까??  ");
			nalsu = Integer.parseInt(br.readLine());
		}
		while (nalsu<1);
		//날 수 더하기 연산
		now.add(Calendar.DATE,nalsu);
		
		//결과 출력
		System.out.println("========[확인결과]==========");
		System.out.printf("%d일 후 : %tF %tA\n",nalsu,now,now);
		System.out.println("============================");
		
		//%t 날짜(시간)타입 => 안에 담을수 있는건 DATE타입
	

	}
}

//실행 결과
/*
오늘 날짜 : 2019-3-8 금요일
몇 일 후의 날짜를 확인하고자 하십니까??  100
========[확인결과]==========
100일 후 : 2019-06-16 일요일
============================
계속하려면 아무 키나 누르십시오 . . .

*/