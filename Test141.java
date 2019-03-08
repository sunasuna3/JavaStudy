/*==================================
���� �ڹ��� �ֿ�(�߿�) Ŭ��������
- Random Ŭ����
===================================*/
/*
�� java.util.Random Ŭ������

	���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
	Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
	0.0~1.0  ������ �Ǽ� ���¸� �߻��ϰ� �ʷ�
	�ʿ��� ���� ������ ������ ���þ�� ���ؼ��� �߰����� ������� �����ؾ� �Ѵ�,
	�׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
	���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/

//�ζ� ��ȣ ������ (���� �߻� ���α׷�)

//���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
// 2 39 40 41 42 45
// 1 2 8 16 28 42
// 4 9 10 13 14 28
// 20 24 31 33 37 41
// 5 7 8 11 36 40
//����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Random;
import java.util.Arrays;


class Lotto
{
	//�迭 ���� ���� �� �޸� �Ҵ� -> �ζ� ��ȣ�� ��Ƶ� �迭��
	private int[] num=new int[6];

	//getter
	public int[] getNum()
	{
		return num;
	}

	//6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		int cnt=0;
		Random rd = new Random();
		int n;
		
		jump:
		while (cnt<6) // cnt -> 0 1 2 3 4 5 
		{
			n=rd.nextInt(45)+1;  //45�̸� 0~44 ���� +1

			for (int i=0;i<cnt ;i++)
			{
				if (num[i]==n)
				{
					continue jump;
				}
			
			}
			
			num[cnt++] =n;		
		}

		sorting();
	}

	//���� �޼ҵ�
	private void sorting()
	{
		Arrays.sort(num);  //�迭 
	}


}


public class Test141
{
	public static void main(String[] args)
	{

		/*
		for (int k=0;k<6; k++ )
		{
			int[]arr=new int[6];
			
			for (int i=0; i<6;i++ )
			{
				boolean flag = false;
				Random rd =new Random();
				int num = rd.nextInt(45)+1;  

				for (int j=0;j<i;j++ )   i=0 j=0 �϶��� �Ʒ� ����
				{

					if (arr[j]==num)
					{
						flag = true;
					}
				}

				if (flag==false)
				{
					arr[i] = num; 
					System.out.print(arr[i]+ " ");
				}
				else
					i--;
				



			}
			
		System.out.println();
 		}

		*/
		
		//Lotto Ŭ���� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		//�⺻ 5����
		
		for (int i=1; i<=5; i++ )
		{
			lotto.start();

			//��� ���
			for (int n : lotto.getNum() )
			{
				System.out.printf("%4d",n);
			}
			System.out.println();

		}

			
	}
}

//���� ���
/*
  13  20  22  25  40  44
   5  18  33  34  37  39
   6  11  12  16  20  32
   1  11  21  25  37  45
   5   6   7  20  21  44
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
