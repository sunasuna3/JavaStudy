

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
			System.out.print("1: ����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}


	public void middleCalc()
	{
		String[] str ={"����", "����", "��"};

	    System.out.println("- ���� : " +str[user-1]);
	    System.out.println("- ��ǻ�� : " +str[com-1]);

	}

	public String resultCalc()
	{
		String result = "���º�";

		if ((user==1&&com==3) ||(user==2&&com==1) ||(user==3&&com==2) )
			result = "����� �¸��߽��ϴ�.";

		if ((user==3 && com==1) || (user==1 && com==2) || (user==2 && com==3)) 
		
		  result =" ��ǻ�Ͱ� �¸��߽��ϴ�.";

		  return result;
	}

	public void print(String result)
	{
		System.out.println(">> �º�������� : " +result);
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

//���� ���
/*
1: ����, 2:����, 3:�� �� �Է�(1~3) : 1
- ���� : ����
- ��ǻ�� : ��
>> �º�������� : ����� �¸��߽��ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
1: ����, 2:����, 3:�� �� �Է�(1~3) : 3
- ���� : ��
- ��ǻ�� : ����
>> �º�������� : ����� �¸��߽��ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/