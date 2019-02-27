

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	int user;
	int com;


	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3) +1;
	}

	public void input()
	{
		runCom();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1: 가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}


	public void middleCalc()
	{
		String[] str ={"가위", "바위", "보"};

	    System.out.println("- 유저 : " +str[user-1]);
	    System.out.println("- 컴퓨터 : " +str[com-1]);

	}

	public String resultCalc()
	{
		String result = "무승부";

		if ((user==1&&com==3) ||(user==2&&com==1) ||(user==3&&com==2) )
			result = "당신이 승리했습니다.";

		if ((user==3 && com==1) || (user==1 && com==2) || (user==2 && com==3)) 
		
		  result =" 컴퓨터가 승리했습니다.";

		  return result;
	}

	public void print(String result)
	{
		System.out.println(">> 승부최종결과 : " +result);
	}


}



public class Test094_1
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();
		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);


	}
}

//실행 결과
/*
1: 가위, 2:바위, 3:보 중 입력(1~3) : 1
- 유저 : 가위
- 컴퓨터 : 보
>> 승부최종결과 : 당신이 승리했습니다.
계속하려면 아무 키나 누르십시오 . . .
*/
/*
1: 가위, 2:바위, 3:보 중 입력(1~3) : 3
- 유저 : 보
- 컴퓨터 : 바위
>> 승부최종결과 : 당신이 승리했습니다.
계속하려면 아무 키나 누르십시오 . . .
*/