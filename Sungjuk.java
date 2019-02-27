import java.util.Scanner;

public class Sungjuk
{
	/*
	int num;

	Record[] arr;

	
	 void input()
	{

		Scanner sc = new Scanner(System.in);//class에 하지말구!!

		do
		{
			System.out.print("인원 수 입력(1~100) :");
			num = sc.nextInt();
		}
		while (num<1 || num>100);

	}

	 void names()
	{


		 arr =new Record[num];
		 for (int i=0; i<num; i++ )
		{
			
		 arr[i]=new Record();


		System.out.printf("%d번째 학생의 이름 입력 : \n",i+1);
		arr[i].name = sc.next();

		System.out.print("국어 점수 : ");
		arr[i].kor = sc.nextInt();

		System.out.print("영어 점수 : ");
		arr[i].eng = sc.nextInt();

		System.out.print("수학 점수 : " );
		arr[i].mat = sc.nextInt();

		}

	}

	void cla ()
	{
		for (int i=0; i<num ;i++ )
		{
			arr[i].tot = arr[i].kor +arr[i].eng + arr[i].mat;
			arr[i].avg = arr[i].tot/3; 
		}

	}
	

	void print()
	{
		for (int i=0; i<num ;i++ )
		{
			System.out.printf("%s %d %d %d %d %.2f\n",arr[i].name,arr[i].kor,arr[i].eng,arr[i].mat,arr[i].tot ,arr[i].avg);
		}		
	}
	*/

	//주요 속성 구성
	int inwon;//--인원수
	Record[] recArr;   //-레코드 배열
						//(학생 1명 당 레코드 배열의 방 1개 활용)

	//기능(메소드 정의)
	//1.인원수 정의
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100) :");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);  //1보다 작거나 100보다 크면
		

		//체크!★★
		//Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		//배열방을 inwon 만큼 생성한 것이지,
		// Record 클래스의 인스턴스를 생성한 것은 아니다.
		recArr = new Record[inwon];
	}


	//기능(메소드 정의)
	//2.상세 데이터 입력 + 3.총점/평균 산출
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String [] subTitle ={"국어 점수 : ", "영어 점수 : ","수학 점수 : "};

		for (int i=0; i<inwon; i++ )  //1번만 입력 받는게 아니라 반복해서 입력 받아야 하니까 반복문안에 //인원수 만큼 반복~!!!(==recArr.length)
		{

			//체크 ★★
			//Record 클래스 기반의 인스턴스 생성
			recArr[i] = new Record();

			System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			recArr[i].name = sc.next();

			for (int j=0; j<subTitle.length; j++ )
			{
				// 안내 메세지 출력
				System.out.print(subTitle[j]);

				//사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				recArr[i].score[j]=sc.nextInt();

				//국어,영어,수학 점수 데이터를 반복적으로 입력받는 동안
				//그 과정에서 총점 누락하기
				recArr[i].tot += recArr[i].score[j];

			}

			//평균 산출하기
			recArr[i].avg = recArr[i].tot/3.0; //그래야 실수기반의 연산 진행


		}

	} //end input()


	//기능(메소드 정의)
	//4.결과 출력
	
	public void print()
	{
		//석차 산출 메소드 호출구문 추가~!!
		ranking();

		//개행
		System.out.println();

		//학생 1인 당 반복 출력 구문
		for (int i=0; i<inwon; i++  ) //학생 인원 수 만큼 반복 (==recArr.length)
		{
			//이름 출력
			System.out.printf("%5s",recArr[i].name);

			//성적(국어,영어,수학)반복 출력
			for (int j=0; j<inwon; j++ )
				System.out.printf("%4d",recArr[i].score[j]);

			//총점, 평균 출력
			System.out.printf("%5d",recArr[i].tot);
			System.out.printf("%8.2f",recArr[i].avg);

			//석차 출력
			System.out.printf("%5d",recArr[i].rank);

			//개행
			System.out.println();  

		}
	}//end print();


	//기능(메소드 정의)
	//4.석차 산출 메소드 추가~!!!

	private void ranking()   //오로지 프린트에서만 불러지니까 private 가능 
	{
		//루프 변수
		int i,j;

		//모든 학생들의 등수(석차)를 1로 초기화
		for (i=0; i<inwon; i++ )
			recArr[i].rank =1;

		//등수(석차)산출
		for (i=0; i<inwon-1; i++ )  // i => 비교 기준을 설정하는 인덱스
		{
			for (j=i+1; j<inwon; j++ ) // j => 비교 대상을 설정하는 인덱스
			{
				if (recArr[i].avg>recArr[j].avg) //기준 데이터가 비교 데이터보다 크다면...
				{
					//비교 데이터의 rank를 1만큼 증가  (등수는 높을수록 낮은 점수)
					recArr[j].rank++;
				}
				else if (recArr[j].avg>recArr[i].avg) //비교 데이터가 기준 데이터 보다 크다면...
				{
					//기준 데이터의 rank를 1만큼 증가
					recArr[i].rank++;
				}
			}
		}

	}//end ranking



	


}
