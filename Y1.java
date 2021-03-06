public class Y1
{

	//○실습 문제
//아래의 클래스(WeekDay)를 완성한다.
//사용자로부터 년,월,일을 입력받아
//해당 날짜의 요일을 출력하는 프로그램을 구현한다.
//단, 달력 클래스(Calendar)는 사용하지 않는다.
//또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
//그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.

//실행 예)
// 년 월 일 입력(공백 구분) : 2019 2 26

//>> 2019년 2월 26일 -> 화요일
//계속하려면 아무 키나 누르세요....

//※ 문제 인식 및 분석
//	-윤년 및 평년의 개념 적용    
									
//	-1년 1월 1일 -> 월요일 

//(y%4==0 && y%100!=0 || y%400==0)

	class WeekDay
	{
	//주요 변수 선언(속성 구성)
	//주요 변수 선언(속성 구성)
	private int y, m, d;  //--사용자가 입력한 년, 월, 일을 담을 변수
	
	//메소드 정의(입력받기)
	void input() 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print(" 년 월 일 입력(공백 구분) : ");
		y=sc.nextInt();
		m=sc.nextInt();
		d=sc.nextInt();		

	}

	//메소드 정의(요일 산출하기)
	String week()
	{
		int py=y-1;
		py = (py)*365+(py/4)-(py/100)+(py/400);

		int [] arr ={31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i=0; i<m-1 ;i++ )
		{
			if (m==1 && m%4==0 && m%100!=0 || m%400==0)
			{
				py+=1;
			}
			py+=arr[i];			
		}
		py+=d;
		

		String q;
		
	}

	//메소드 정의(결과 출력하기)
	void print(String day)
	{
		
	}

}
	


	public static void main(String[] args)
	{
		WeekDay wd =new WeekDay();
		
		wd.input();		//--입력 메소드 호출
		String result=wd.week();  //--요일 산출 메소드 호출
		wd.print(result);         //--결과 출력 메소드 호출

	}
}
