/*===============================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ���� ����
  -�迭 Ȱ��
================================*/

//�۽ǽ� ����
//�Ʒ��� Ŭ����(WeekDay)�� �ϼ��Ѵ�.
//����ڷκ��� ��,��,���� �Է¹޾�
//�ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
//��, �޷� Ŭ����(Calendar)�� ������� �ʴ´�.
//����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
//�׸���, �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.

//���� ��)
// �� �� �� �Է�(���� ����) : 2019 2 26

//>> 2019�� 2�� 26�� -> ȭ����
//����Ϸ��� �ƹ� Ű�� ��������....

//�� ���� �ν� �� �м�
//	-���� �� ����� ���� ����    
									
//	-1�� 1�� 1�� -> ������ 

import java.util.Scanner;


class WeekDay
{
	//�ֿ� ���� ����(�Ӽ� ����)
	private int y, m, d;  //--����ڰ� �Է��� ��, ��, ���� ���� ����
	
	//�޼ҵ� ����(�Է¹ޱ�)
	void input() 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print(" �� �� �� �Է�(���� ����) : ");
		y=sc.nextInt();
		m=sc.nextInt();
		d=sc.nextInt();		

	}

	//�޼ҵ� ����(���� �����ϱ�)
	void week()
	//String week()
	{
		//�� ���� ������ ��¥(�� ���� �ִ밪)�� �迭 ���·� ����
		int [] months ={31,0,31,30,31,30,31,31,30,31,30,31};
		
		//���ϸ��� ���� �迭 ����
		String[]weekName={"��","��","ȭ","��","��","��","��"};
		
		//������ ������ ����, ���� ����, ���� ����
		int nalsu, i, w;

		//���⿡ ���� 2���� �� �� ���
		//�����̶��...2���� ������ ��¥�� 29�Ϸ� ���� -> months[1] = 29
		//����̶��...2���� ������ ��¥�� 28�Ϸ� ����- > months[1] = 28
		if (y%4==0 && y%100!=0 ||y%400==0) //�Է� �⵵�� �����̶��....
		{
			//2���� ������ ��¥�� 29�Ϸ� ����
			months[1] = 29;
		}
		else			//�Է� �⵵�� ����̶��...
		{
			//2���� ������ ��¥�� 28�Ϸ� ����			
			months[1] = 28;
		}

		// �� 1�� 1�� 1�� ���� �Է¹��� �⵵�� ���� �⵵ 12�� 31�� ������ �� �� ���
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		//�׽�Ʈ
		System.out.print(nalsu);


	}

	//�޼ҵ� ����(��� ����ϱ�)
	/*void print(String day)
	{
		System.out.printf(">> %d�� %d�� %d�� -> %s\n",y,m,d,day);
	}

}*/
	
public class Test091_1
{
	public static void main(String[] args)
	{
		WeekDay wd =new WeekDay();
		
		wd.input();		//--�Է� �޼ҵ� ȣ��
		wd.week();
		//String result=wd.week();  //--���� ���� �޼ҵ� ȣ��
		//wd.print(result);         //--��� ��� �޼ҵ� ȣ��

	}
}