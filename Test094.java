/*===============================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ������ �ν��Ͻ� Ȱ��
================================*/

//�۽ǽ� ����
//1~3 ������ ���� ������ ������ �߻�����
//����,����,�� ���� ���α׷��� �����Ѵ�.
//��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
//����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

//���� ������ -> 1: ����, 2:����, 3:��

//���� ��)
// 1: ����, 2:����, 3:�� �� �Է�(1~3) : 4
// 1: ����, 2:����, 3:�� �� �Է�(1~3) : -12
// 1: ����, 2:����, 3:�� �� �Է�(1~3) : 2
// - ����   : ����
// - ��ǻ�� : ��
// >> �º�������� : ��ǻ�Ͱ� �̰���ϴ�.
//����Ϸ��� �ƹ� Ű�� ��������....

import java.util.Scanner;
import java.util.Random;

class Test
{
	int num;
	int k;

	String [] arr ={"����","����","��"};
	
	void input()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1: ����, 2:����, 3:�� �� �Է�(1~3) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>3);
		--num;
		
		
	}

	void nan()
	{
		Random rd =new Random();
		
		

		k = rd.nextInt(3);

	}

	void print()
	{
		
		System.out.println("- ���� : " + arr[num]);
		System.out.println("- ��ǻ�� :" + arr[k]);



		if ((num==0 && k==2) || (num==1 && k==0) || (num==2 && k==1)) 
		
			System.out.print(">> �º�������� : ������ �̰���ϴ�.");
		
		
		if ((num==2 && k==0) || (num==0 && k==1) || (num==1 && k==2)) 
		
			System.out.print(">> �º�������� : ��ǻ�Ͱ� �̰���ϴ�.");
		
		if (num==k)
		
			System.out.print(">> �º�������� : �����ϴ�.");
		

	}
}



	//0 -> 2 
	//1 -> 0
	//2 -> 1 

	// 2->0
	// 0->1
	// 1->2

	




public class Test094
{
	public static void main(String[] args)
	{
		Test ob = new Test();

		ob.input();
		ob.nan();
		ob.print();

	}
}