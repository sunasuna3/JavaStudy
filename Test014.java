/*==============================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ��� �⺻ �����  : BufferedReader
=============================================*/

// ����ڷκ��� �̸��� ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : 
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

//===[���]===
//�̸� : �ѽ¿�
//���� : 240
//============
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test014 
{

	public static void main(String[] args) throws IOException
	{
	
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�ֿ� ���� ����
		
		String name;
		int a,b,c,d;

		//���� �� ó��

		System.out.print("�̸��� �Է��ϼ��� : ");

		name =  br.readLine();

		System.out.print("���� ���� �Է� : ");

		a = Integer.parseInt( br.readLine()); 

		System.out.print("���� ���� �Է� : ");
		b = Integer.parseInt( br.readLine()); 

		System.out.print("���� ���� �Է� : ");
		c = Integer.parseInt( br.readLine()); 

		d = a + b + c ;

		//��� �� ���

		System.out.println("===[���]===");
		System.out.printf("�̸��� : %S\n", name);
		System.out.println("���� : " + d);
		System.out.println("============");
		



      /*

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//�ֿ� ���� ����
		String strName;   //--�̸� ����
		int nKor, nEng, nMat, nTot;  //--����, ����, ����, ���� ����

		*/




	}
}