
/*==============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if�� �ǽ�
===============================================*/
//�ǽ�����
//����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
//������ ���� ���·� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��
//�̸� �Է� : ���ȯ
//���� ���� : 90
//���� ���� : 80
//���� ���� : 70

//>>����� �̸��� ���ȯ�Դϴ�.
//>>���� ������ 90,
//>>���� ������ 80,
//>>���� ������ 70,
//>>������ 240�̰�, ����� 80�Դϴ�.
//>>����� B �Դϴ�.
//����Ϸ��� �ƹ� Ű��...

//�ص���� ��� ������ �������� ó���Ѵ�.


// 80 <= avg < 90 (x) ->  avg >=80 �������� avg <90   ->  avg >=80 && avg <90


//90��~ 100�� : A   80��~89�� : B
//70��~ 79�� : C      60��~69�� : D
//60�� �̸� : F

////��,BufferedReader�� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� ó���ϰ�
//printf ()�޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		

		/*���� Ǭ ����

		//���� ����

		int num1,num2,num3;
		int sum , a;
		String name;


		System.out.print("�̸� �Է� : ");
	     name = br.readLine();
	
		System.out.print("���� ���� : ");
		 num1 = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		num3 = Integer.parseInt(br.readLine());


		sum = num1 + num2 + num3;
		a = sum /3 ;



		//��� ���
		System.out.println();
		System.out.printf("����� �̸��� %s �Դϴ�. \n", name);
		System.out.printf(">>���� ������ : %d \n", num1);
		System.out.printf(">>���� ������ : %d \n", num2);
		System.out.printf(">>���� ������ : %d \n", num3);
		System.out.printf(">>������ %d �̰�, ����� %d �Դϴ�.\n", sum, a);


		if(a >=90 )		
			System.out.println( ">>����� A �Դϴ�.");
		  else if(a >=80)
			 System.out.println( ">>����� B �Դϴ�.");
		  else if(a >=70)
			  System.out.println(">>����� C �Դϴ�.");
		  else if(a>=60)
			  System.out.println(">>����� D �Դϴ�.");
		  else
			  System.out.println(">>����� F �Դϴ�.");

			  */ 

		//�Բ� Ǭ ����

		String name;
		int kor, eng, mat;

	    System.out.print("�̸� �Է� : ");
	    name = br.readLine();	
		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		//���� ����
		int tot = kor + eng + mat;
		
		//��� ����
		double avg = tot/3.0; //�Ǽ� ���

		//��� ����
		char grade ='F';

		if (avg >=90)
		{
			grade = 'A';
		}
		else if (avg >=80)   
		{
			grade = 'B';
		}
		else if (avg >=70)
		{
			grade = 'C';
		}
		else if (avg >=60)
		{
			grade = 'D';
		}
		/*else if (avg <60)
		{	
			grade = 'F';
        }*/     
		// char grade = 'F'�� �ʹݿ� �Է������ϱ� �������� ��� ok

		System.out.println();
		System.out.printf("����� �̸��� %s �Դϴ�. \n", name);
		System.out.printf(">>���� ������ : %d \n", kor);
		System.out.printf(">>���� ������ : %d \n", eng);
		System.out.printf(">>���� ������ : %d \n", mat);
		System.out.printf(">>������ %d �̰�, ����� %.1f �Դϴ�.\n", tot, avg);
		System.out.printf(">>����� %c �Դϴ�.\n", grade);

	}
}
/*  ���� ���

�̸� �Է� : ���ȯ
���� ���� : 90
���� ���� : 80
���� ���� : 70

����� �̸��� ���ȯ �Դϴ�.
>>���� ������ : 90
>>���� ������ : 80
>>���� ������ : 70
>>������ 240 �̰�, ����� 80.0 �Դϴ�.
>>����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
