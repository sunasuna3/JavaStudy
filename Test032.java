/*==============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else �ǽ�
===============================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int n;

		System.out.print("������ ���� �Է� : ");

		n=Integer.parseInt(br.readLine());

		/*(X)
		if (n%2 ==0)
		{
			System.out.println(n +  " ->¦��");
		
		}

		else if (n==0)
		{
			System.out.println( n + "-> ��");
		}

		else 
		{
			System.out.println(n + " ->Ȧ��");
		}
		*/


	    /*(X)
		if (n%2!=0)
		{
			System.out.println(n +  " ->Ȧ��");
		
		}

		else if (n%2==0)
		{
			System.out.println( n + "-> ¦��");
		}

		else if(n ==0)
		{
			System.out.println(n + " ->��");
		}
		*/
		
		
		/*(O)
		if (n==0)
		{
			System.out.println(n +  " ->��");
		
		}

		else if (n%2 ==0)
		{
			System.out.println( n + "-> ¦��");
		}

		else 
		{
			System.out.println(n + " ->Ȧ��");
		}


    //¦��, Ȧ�� , �� ��  ¦������ ���� ���� ǥ���ؾ���
		
		
		*/

		System.out.print("���̽�ũ�� ���� ���� (1.����, 2,����) : " );
		n=Integer.parseInt(br.readLine());

		/*
		if(n==1)
		{
			Systen.out.println("���� ���̽�ũ�� ����~~!");
		}
		else
		{
			System.out.println("���� ���̽�ũ�� ����~!!");
		}
		*/
		if(n==1)
		{
			System.out.println("���� ���̽�ũ�� ����~~!");
		}
		else if (n==2)
		
		{
			System.out.println("���� ���̽�ũ�� ����~!!");
		}

		else
		{
			System.out.println("���� �Ұ�~!!!");
		}




    
	}

}
