/*==================================
���� �ڹ��� �ֿ�(�߿�) Ŭ��������
- Calendar Ŭ����
===================================*/

/*
�� java.util.Calendar Ŭ������
	��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
	��, ��, ��, ����, ��, ��, �� ������
	�ð��� ��¥�� ���õ� ������ �����Ѵ�.
	�׸��� Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
	�������� �޼ҵ� ������  Calendar  Ŭ������ ���� Ŭ������
	GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

	�ý������κ��� ���� �ý��� �ð� ������ ���� ��
	getInstance() ��� ���� �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
	������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
	�� ��ü�� �����Ǹ� ���� �ִ� �ð� ��������
	get() �޼ҵ带 �̿��Ͽ� ���� ������ �� �ִ�.

	GregorianCalendar()�޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
	�����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
	���� ���� �ִ�.

*/

//�� �ǽ�����
//	����ڷκ��� ��, ���� �Է¹޾�
//  �ش� �� ���� �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//  ��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

//���� ��
//���� �Է� : 0
//���� �Է� : 2019
//�� �Է�: -2
//�� �Է�: 16
//�� �Է�: 7

/*
	[ 2019�� 7�� ]

 ��	��	ȭ	��	��	��	��
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

		//�ֿ� ���� ����
		int y,m;
		int w;
		int i;

		
		do
		{
			System.out.print("���������� �Է��ϼ��� :");
			y=Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�������� �Է��ϼ��� :");
			m=Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		//����ڷκ��� �Է¹��� ������ ��(y), ��(m)�� �̿��Ͽ�
		//�޷��� ��¥ ����

		cal.set(y,m-1,1);
		//--�� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//   �Է°����� 1�� �A ������ ���� �����ؾ� �Ѵ�,
		//--�� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�,
		
		//���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		//Ȯ��
		//System.out.println(w);
		//--==> 2019�� 3�� ����   6  => �ݿ��� -> 2019�� 3�� 6�� �ݿ���

		
		System.out.println();
		System.out.println("\t [" + y+ " �� " + m +" �� ] ");
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");  
		System.out.println("===============================");
		for (i=1; i<w; i++ )
			System.out.print("    "); // �� ĭ ����

		//�׽�Ʈ
		//System.out.printf("%4d" ,1);
		
		//Ķ���� Ŭ������ getActualMaximum() �޼ҵ�~
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++ )  
		{
			System.out.printf("%4d",i);
			w++;    //--�ݺ����� �����ϸ� ��¥�� ������ �� ���� ���ϵ� �Բ� ������ �� �ֵ��� ó��

			//���࿡ ���� ����
			if (w%7==1) //�Ͽ��ϸ���
			{
				System.out.println();  //����
			}
		}

		if (w%7==1) //�Ͽ��ϸ���
				System.out.println();  //����



		System.out.println();
		System.out.println("===============================");
			
		
		
		

	
		
	}
}
	