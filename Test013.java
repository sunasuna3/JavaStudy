/*==============================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ��� �⺻ ����� 
=============================================*/

//  �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� �ﰢ���� ���� ���ϱ� ��
//- �ﰢ���� �غ� �Է� : 3
//- �ﰢ���� ���� �Է� : 5

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� �ﰢ���� ���� = �غ� * ���� /2


import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException;

// import java.io.*;

public class Test013
{
	public static void main(String [] args) throws IOException
	{
		
		//���� Ǯ���� ����
		/*

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�ֿ� ���� ����
		int a, b;
		double c;

		//���� �� ó��
		System.out.print("�ﰢ���� �غ� �Է� : " );
		
		a = Integer.parseInt( br.readLine()); 

		System.out.print("�ﰢ���� ���� �Է� : ");
		
		b = Integer.parseInt( br.readLine());

		c = a*b/2.0;

		
		//��� �� ���
		
		
		System.out.printf("n>> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n " ,a,b,c);

		*/




		//�Բ� Ǯ���� ����

		//�ܺηκ��� �����͸� �Է¹޵��� ó���ϱ� ���ؼ�
		//BurfferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		// �ֿ� ���� ó��

		int underLenght, height ;   //-- �غ��� ����
		double area;				//-- ����

		// ���� �� ó��
		// 1) ����ڿ��� �ȳ� �޼��� ���
		System.out.println("��ﰢ���� ���� ���ϱ��");
		System.out.print(" - �ﰢ���� �غ� �Է� : ");

		// 2) ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� 
		// ���� underLenght �� ��Ƴ���
		underLenght = Integer.parseInt(br.readLine());

		// 3) �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("- �ﰢ���� ���� �Է� : ");
		
		// 4) ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� 
		// ���� height �� ��Ƴ���
		height = Integer.parseInt(br.readLine());

		// 5) �ﰢ���� ���̸� ���ϴ� ���� ó��
		area = underLenght * height / 2.0;
		//       ����         ����   ����
		//-- �Ǽ� �ڷ����� ��������� ������ ��������
		//   �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//   ������ ��2���� �ƴ� �Ǽ��� ��2.0������ ������ ������ �����ϰ� �Ǹ�
		//   �� ������ �Ǽ� ������� ó���ȴ�.

		// ��� ���
		//System.out.println();  //����
		System.out.printf(">>�غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n" , underLenght, height, area);
		

		

	}
}

// ���� ���
/*
��ﰢ���� ���� ���ϱ��
 - �ﰢ���� �غ� �Է� : 3
- �ﰢ���� ���� �Է� : 5
>>�غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
