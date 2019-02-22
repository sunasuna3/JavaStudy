/*==============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  -   - switch �� �ǽ�
===============================================*/

/*
- ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
  ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

 -���� �� ����
   switch (����)
   {
	   case ���1 : ����1;[break;]
	   case ���2 : ����2;[break;]
			.
			.
	 [defult : ����n+1;] [break;]
	}

	switch ���� ���İ� case �� �����
	byte, short, int, long ���̾�� �Ѵ�.

	case ���ڿ� break; �� ���� ������ ���
	���� case���� ������ ����ؼ� �����ϰ� �ȴ�. (�⺻ ��)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test040
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		int kor,eng,mat;
		String name;

		System.out.print("�̸��� �Է��ϼ��� : ");
		name=br.readLine();

		System.out.print("���� ������ �Է� :");
		kor=Integer.parseInt(br.readLine());

		System.out.print("���� ������ �Է� :");
		eng=Integer.parseInt(br.readLine());

		System.out.print("���� ������ �Է� :");
		mat=Integer.parseInt(br.readLine());

		
		//���� ����
		int tot = kor + eng + mat;
		
		//��� ����
		int avg = tot/3; 

		char grade = 'F';
		
		//��� ����
		switch (avg/10 )
		{
			case 10 : case 9 : grade =  'A'; break;
			case 8 : grade =  'B'; break;
			case 7 : grade =  'C'; break;
			case 6 : grade =  'D'; break;
			default : grade =  'E'; 
	
		}

		System.out.println();
		System.out.printf("����� �̸��� %s �Դϴ�. \n", name);
		System.out.printf(">>���� ������ : %d \n", kor);
		System.out.printf(">>���� ������ : %d \n", eng);
		System.out.printf(">>���� ������ : %d \n", mat);
		System.out.printf(">>������ %d �̰�, ����� %d �Դϴ�.\n", tot, avg);
		System.out.printf(">>����� %c �Դϴ�.\n", grade);

		


	}
}