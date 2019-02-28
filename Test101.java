/*====================================
���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
====================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����

	1. ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	  123456-1234567(-> �ֹι�ȣ)
	  ****** ******
	  234567 892345 (->�� �ڸ��� ������ ��)

	2. ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.
	
	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * * * 
		2 3 4 5 6 7   8 9 2 3 4 5
		---------------------------
	-> 14+15+0+30+6+35+8+72+12+6+4+15 

		==217

	3. ������ ������� 11�� ������ ������������ ���Ѵ�.
		 19   -> ��
	   ---------
	11 | 217
		 11
	   ---------
	     107
		  99      
	   ---------
	   	   8  -> ������
   132%11 
	4. 11���� �������� �� ������� ���Ѵ�.
		11-8 
		
	5. 4��°���� ó���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ��ġ�ϴ��� ���Ѵ�.
	   11-8  ������ 3  == �ֹι�ȣ ������ ���� 3
						 ��ġ

	�� ������ ���ڿ� ���� ��� ��ȿ�� �ֹε�Ϲ�ȣ 
*/


//���� ��)
//�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-12345678 -> �Է°��� �ʰ�
//>>�Է¿���~!!!

//�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-123456  -> �Է°��� ����
//>>�Է¿���~!!!

//�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252085 -> ��ȿ�� �ֹι�ȣ
//>> ��Ȯ�� �ֹι�ȣ~~!!

//�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252086 -> ��ȿ���� ���� �ֹι�ȣ
//>> �߸��� �ֹι�ȣ~!!!

//�ع��ڿ�.length() -> ���ڿ��� ���� ��ȯ
//	���ڿ�.substring()  -> ���ڿ� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101
{
	public static void main(String[] arg)throws IOException
	{
		//�׽�Ʈ

		//String strTemp = "���ع�����λ��� ������⵵��";
		//System.out.println(strTemp.length());

		//�׽�Ʈ
		//System.out.println("�������� �� �ҳ���".length());

		//�׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3,4));
		//--==> de

		//�׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3,50));
		//--==> StringIndexOutOfBoundsException ���� �߻�

		//�׽�Ʈ
		//System.out.println("���̿��������װڳ�".substirng(4,9));
		//--==>�����װڳ�
		
		//�׽�Ʈ
		//System.out.println("������������".substring(3));
		//System.out.println("������������".substring(3,"������������".length()));
		//--==>������
		
		String num;
	
		int q=0;
		int a=0;
		int r=0;

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		num=br.readLine();

		if (num.length()<14 || num.length()>14)
		{
			System.out.println(">>�Է¿���~!!!");	
		}
		
		int[] arr2 ={2,3,4,5,6,7,8,9,2,3,4,5};

		String [] arr = new String [num.length()];

		int[] arr3 =new int[13];
		for (int i=0,j=0; i<num.length(); i++,j++ )
		{
			if (i!=6)
			{
				arr3[j] = Integer.parseInt(num.substring(i,i+1));     //��Ʈ���迭�� 
			}
			else
			j--;	
			
		}

	
		for (int i=0; i<arr2.length; i++ )
		{
			q += arr3[i] * arr2[i];		
		}
		


		a = 11- (q%11);

		//System.out.println(a);
			if (a==10 || a==11)
			{
				r=a%10;

				
			}
			else{
				r=a;

				
			}

		
		if (r==arr3[(arr3.length)-1])
		{
			
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~~!!");

		}
		else{
			
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");

		}

		



		

		






		




		
		
	

		

		

		
	
		







	}
}

//234567 892345