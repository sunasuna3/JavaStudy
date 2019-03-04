/*==================================
���� ����(Sort) �˰��� ����
-- ���� ���� ����(Bubble Sort)
===================================*/
/*
�� �ռ� ������ Selection Sort �� Bubble Sort�� ������ ����.(�ݺ��� Ƚ���� ��û)
	������, ���� Bubble Sort�� ��� �������� ������ ����
	�Ϲ� Bublle Sort �� Selection Sort ���� ������ ����.

	���� ������ = 61 15 20 22 30
				  15 20 22 30 61  --1ȸ�� (���� �߻� true) -- ���� ȸ�� ��
				  15 20 22 30 61  --2ȸ�� (���� �߻� false) -- ���� ȸ�� X

==> 1ȸ�� ����...2ȸ�� ����...�� �� ���Ҵ���...
	2ȸ���� �����ϴ� �������� ������ ���� �Ͼ�� �ʾұ� ������
	���ʿ��� �߰� ����(ȸ�� : �ݺ�)�� �������� �ʴ´�.


				 
*/
public class Test104
{
	public static void main(String[] args)
	{
		int [] a = {10, 50, 20, 33, 40};
		/*
		10, 50, 20, 33, 40		0	1
		======
		10, 20, 50, 33, 40		1	2
			======
		10, 20, 33, 50, 40		2	3
				======
		10, 20, 33, 40, 50		3	4
					======

		----------------------------------- 1ȸ��

		10, 20, 33, 40, 50		0	1
		======					
			======				1	2
				======			2	3
		
		----------------------------------- 2ȸ��

		X
		X
		X

			
		*/
		/*
		int i,j;
		

		for (i=1; i<a.length; i++ )
		{
			boolean q=false;
			for (j=0; j<a.length-i;j++ )
			{
				
				
				if (a[j] > a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];
					q=true;
				}

			}

			if (q==false)
			{
				break;

			}		
			System.out.print(i+ "ȸ�� ");

			
		}

		for (int n :a )
		{
			System.out.print(n + " ");
		}
		System.out.println();
		*/
		
		System.out.print("Source Date : ");
		for (int n : a )
		{
			System.out.print( n + " ");
		}
		System.out.println();

		int pass;
		boolean flag;

		pass=0;

		do
		{
			flag =false;
			pass++;
			for (int i=0; i<a.length-pass; i++ )
			{
				if (a[i] > a[i+1])
				{
					a[i]=a[i]^a[i+1];
					a[i+1]=a[i+1]^a[i];
					a[i]=a[i]^a[i+1];
					
					flag =true;
				}
			}

		}
		while (flag);
		//ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� ���� ����
		// �� �̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ�~!!
		

		System.out.print("Sorted Date : ");
		for (int n :a )
		{
			System.out.print(n + " ");
		}
		System.out.println();


	}
}

/*
10 50 20 33 40
10 20 33 40 50
*/