/*==============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  -   - switch �� �ǽ�
===============================================*/

//�ǽ� ����
//1���� 3������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
//�Է¹��� ������ŭ �����ڡڰ� ���µǴ� ���α׷��� �ۼ��Ѵ�.
//��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

//1)switch ���� �Ϲ� ���� Ȱ���Ѵ�.
//2)switch ���� �⺻ ���� Ȱ���ϵ�,
//  break �� �� �� ���� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
//������ ���� �Է�(1~3) : 3
//�ڡڡ�
//����Ϸ��� �ƹ� Ű�� �����ÿ�...

// ���� ��)
//������ ���� �Է�(1~3) : 7
//�Է� ����~~
//����Ϸ��� �ƹ� Ű�� �����ÿ�...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


		int n;

		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());

/*
		switch (n)
		{
		case 3 : System.out.print("��");
		case 2 : System.out.print("��");
		case 1 : System.out.print("��");break;
		default : System.out.print("�Է� ����~");
		
		}

		System.out.println();


		switch(n)
		{
		case 1 :System.out.println("��");break;
		case 2 :System.out.println("�ڡ�");break;
		case 3 :System.out.println("�ڡڡ�");break;
		default : System.out.print("�Է� ����~");
		}
		System.out.println();
*/

// ���� Ǭ ���� (�Ϲ� ��)
/*		switch(n)
		{
		case 1 :System.out.println("��");break;
		case 2 :System.out.println("�ڡ�");break;
		case 3 :System.out.println("�ڡڡ�");break;
		default : System.out.println("�Է� ����~!!!");
		}
*/

//���� Ǭ ����(�⺻ ��)
		
		switch (n)
		{
		default : System.out.println("�Է� ����~!!!");
		case 3 :System.out.print("��");
		case 2 :System.out.print("��");
		case 1 :System.out.print("��\n");break;
		//default : System.out.println("�Է� ����~!!!"); // ���� �־ ����
		}


	}
}
