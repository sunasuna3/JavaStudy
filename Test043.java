/*==============================================
  ���� ���� �帧�� ��Ʈ�� (�ݺ���) ����
  -   - �ݺ���(while) �ǽ�
===============================================*/

/*
�� �ݺ����� ����

	 �־��� ���ǹ��� �� �� ���
	 ������ ������ ������� �ݺ� �����ϴٰ�
	 ���ǽ��� ������ �Ǵ� ������ ����,
	 �ݺ� ������ �ߴ��ϴ� �����̴�.
	 �̿� ���� �ݺ������� ��while�� , ��do~while�� ,��for�� �� ���� ������
	 �ݺ����� ��� ���� ��break�� , ��continue�� ����
	 �Բ� ����ϴ� ��쵵 �ִ�.
*/

/*
�� while ��

	���ǽ��� ���� ���Ͽ�
	���ǽ��� ����� ���� ���, Ư�� ������ �ݺ� �����ϴ� ��������
	�ݺ� Ƚ���� ������ ���� ���� ��쳪
	�ݺ� Ƚ���� ���� ��� �ַ� ����Ѵ�.
	while���� ������ ���� �ʴ� ���
	�ݺ��� Ŀ�� �� �� ���� ������� ���� �� �ִ�.

�� ���� �� ���� 

	While (���ǽ�)
	{
		���๮;
	}
*/


public class Test043
{
	public static void main(String [] args)
	{
	
		 /*
		 //0~10
		int n=0;
		while (n<=10)
		{
			System.out.println("n = " + n );
			n++;
		}
		*/


		/*
		//1~11
		int n=0;
		while (n<=10)
		{
			n++;
			System.out.println("n = " + n );
		}
		*/


		//1~10
		/*
		int n=0;
		while (n<10)
		{
			System.out.println("n = " + ++n );
		}
		*/

		/*
		//2,4,6,8,10
		int n=0;
		while (n++<10)
		{
			System.out.println("n = " + ++n );
		}

		*/

		//1 ���� 100������ ���� ����Ͽ�
		// ����� ����ϴ� ���α׷��� �����Ѵ�.
		// ��, while �ݺ��� Ȱ���Ѵ�.

		//���� ��)
		//1 ���� 100������ �� : 5050
		//����Ϸ��� �ƹ� Ű�� ��������.


		/*
		int n=0;
		int a=0;
		

		while (n<=100)
		{
			a=a+n;
			n++;

		}
		
		System.out.println("1 ���� 100������ �� : " + a );
		*/

		/*
		int sum=0;
		int n=1;
		while (n<=100)
		{
			sum+=n;
			n++;
		}
			System.out.println("1 ���� 100������ �� : " + sum );
		*/
		/*
		int a = 0;
		int sum =0;
		
		while (a<=100)
		{
			sum=sum + a;
			a++;
			
		}
			System.out.println("1 ���� 100������ �� : " + sum );
		*/

		//���� �ν� �� �м�
		//	1. ��� ������ �ݺ����� ���� �ۿ� ��ġ�ؾ� �Ѵ�. (��� ���� 1��)
		//	2. 1���� 1�� ������ ������ �������� ���� ����
		//		�� ���� ������ �ʿ��ϴ�.

		// 1���� ���ʷ� ��� 1�� �����ϴ� ���� ���� �� �ʱ�ȭ
		int n=1;

		//�������� ����Ͽ� ��ֳ� ���� ���� �� �ʱ�ȭ
		int sum=0;

		//���� �� ó��(�ݺ��� ����)
		while (n<=100)
		{
			//n�� 1�� ������ ������ ���� �ʿ�~!!
			//������ n ��ŭ �������� ���� ����(sum)�� 
			//�� ��ŭ��(n��ŭ��) ������ ������ ���� �ʿ�~!!!
			
			sum += n ;    //sum�� n ��ŭ�� �������Ѷ�..

			n++;         //n�� 1��ŭ�� �������Ѷ�...

		}
	
			//��� ���
			System.out.println("1���� 100������ �� : " + sum);

	}

}