/*=========================
���� Ŭ���� ��� ����
- �������̽�(Interface)
===========================*/

//�� �ǽ� ����
//	���� ó�� ���α׷��� �����Ѵ�.
//   ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

//���� ��)
//�ο� �� �Է�(1~10) : 2
//1��° �л��� �й� �̸� �Է�(���鱸��) : 1921004 �̿���
//���� ���� ���� ���� �Է�	 (���鱸��) : 90 100 85
//2��° �л��� �й� �̸� �Է�(���鱸��) : 1921005 ������
//���� ���� ���� ���� �Է�	 (���鱸��) : 85 70 65

// 1921004 �̿��� 90 100 85              275  91
//                ��  �� ��
// 1921005 ������ 85  70 65              220  73
//                ��  �� ��
//����Ϸ��� �ƹ� Ű�� ��������....

//�Ӽ��� �����ϴ� Ŭ���� -> �ڷ��� Ȱ��

import java.util.Scanner;

class Record
{
	String hak,name;     //--�й�, �̸�
	int kor, eng, mat;   //--����, ����, ���� ����
	int tot, avg;         //--����, ���(���ǻ� ����)
}

interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

//���� �ذ� �������� �����ؾ� �� Ŭ����

//�������̽��� ��ӹ��� �������̽��� ������ �߻� Ŭ����
//abstract class SungjukImpl implements Sungjuk
//   ��
//�������̽��� ��ӹ��� �������̽��� ������  Ŭ����
class SungjukImpl implements Sungjuk
{
	int num=0;
	Record[] arr;
	
	public void set()
	{
		Scanner sc =new Scanner(System.in);
		//�Է��� ���� 1���� �۰ų� 10���� ũ�� �ٽ� �Է¹ޱ�
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);

		//�迭���� num ��ŭ ����
		arr = new Record[num];
				
	}


	public void input()
	{
		Scanner sc= new Scanner(System.in);

		//Record Ŭ���� ����� �ν��Ͻ� ����
		arr = new Record[num];
		for (int i=0; i<arr.length; i++ ) //�Է¹��� �л� �ο� �� ��ŭ �ݺ�
		{
			arr[i]=new Record();
			//�ȳ� �޼��� ���
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���鱸��) : ",i+1);
			//����ڰ� �Է��� �����͸� arr �迭�� ��Ƴ���
			arr[i].hak=sc.next();
			arr[i].name=sc.next();
			//�ȳ� �޼��� ���
			System.out.print("���� ���� ���� ���� �Է�(���鱸��) : ");
			//����ڰ� �Է��� �����͸� arr �迭�� ��Ƴ���
			arr[i].kor=sc.nextInt();
			arr[i].eng=sc.nextInt();
			arr[i].mat=sc.nextInt();
		}

		for (int i=0; i<num ;i++ )
		{	//���� �����ϱ�
			arr[i].tot = arr[i].kor +arr[i].eng + arr[i].mat;
			//��� �����ϱ�
			arr[i].avg = arr[i].tot/3; 
		}

	}

	
	public void print()
	{
		for (int i=0; i<num; i++ )
		{	
			//�й�, �̸�, ��������, ��������, ��������, ����, ��� ����ϱ�
			System.out.printf(" %s %s %d %d %d %d  %d\n",arr[i].hak,arr[i].name,arr[i].kor,arr[i].eng,arr[i].mat,arr[i].tot,arr[i].avg);
		
		//��������, ��������, ���������� ���� ����̾簡 ����ϱ�
		//90-��
		//80-��
		//70-��
		//60-��
		//50-��
		switch (arr[i].kor/10)
		{
		case 10:case 9: System.out.print("\t\t��"); break;
		case 8 : System.out.print("\t\t��"); break;
		case 7 : System.out.print("\t\t��"); break;
		case 6 : System.out.print("\t\t��"); break;
		case 5 : System.out.print("\t\t��"); break;
		default : System.out.print("\t\t��"); break;
		}
		switch (arr[i].eng/10)
		{
		case 10:case 9: System.out.print(" ��"); break;
		case 8 : System.out.print(" ��"); break;
		case 7 : System.out.print(" ��"); break;
		case 6 : System.out.print(" ��"); break;
		case 5 : System.out.print(" ��"); break;
		default : System.out.print(" ��"); break;
		}
		switch (arr[i].mat/10)
		{
		case 10:case 9:System.out.println(" ��"); break;
		case 8 : System.out.println(" ��"); break;
		case 7 : System.out.println(" ��"); break;
		case 6 : System.out.println(" ��"); break;
		case 5 : System.out.println(" ��"); break;
		default : System.out.print(" ��"); break;
		}
			
		}
	}
		
	
}


public class Test116
{
	public static void main(String[] args)
	{

		Sungjuk ob= new SungjukImpl();

		//���� �ذ� �������� �ۼ��ؾ� �� ob ����

		ob.set();
		ob.input();
		ob.print();
	}
}

//���� ���
/*
�ο� �� �Է�(1~10) : 2
1��° �л��� �й� �̸� �Է�(���鱸��) : 1921004 �̿���
���� ���� ���� ���� �Է�(���鱸��) : 90 100 85
2��° �л��� �й� �̸� �Է�(���鱸��) : 1921005 ������
���� ���� ���� ���� �Է�(���鱸��) : 85 70 65
 1921004 �̿��� 90 100 85 275  91
                �� �� ��
 1921005 ������ 85 70 65 220  73
                �� �� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/