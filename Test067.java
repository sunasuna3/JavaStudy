/*==========================================================
  ���� �޼ҵ� ���ȣ�� (��� �޼ҵ�) ����
===========================================================*/

public class Test067
{
	public static void main(String[] args) 
	{
		showHi(3);  //hi�� 3�� ����ϱ� ���ؼ� 


	}

	public static void showHi(int cnt)  
	{
		
		System.out.println("Hi~~!!!");
		

		if (cnt==1)
		{
			return;
		}

		showHi(--cnt);   ///cnt-- ���� ���� x ��������   ���� cnt-- �϶� 3�� ���ѷ���   
		
	
	}

}