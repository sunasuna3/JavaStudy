/*==================================
���� ����(Sort) �˰��� ����
-- ���� ���� ����(Bubble Sort)
===================================*/


//�� �ǽ� ����
//	 ����ڷκ��� ���� �л��� ���� ������ ���� ���·� �Է¹޾�
//   ������ ���� ������ ����� �ο��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//   ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���࿹)
// �ο��� �Է� : 5
// �̸� ���� �Է�(1) : ���ֿ� 90
// �̸� ���� �Է�(2) : ������ 80
// �̸� ���� �Է�(3) : ������ 85
// �̸� ���� �Է�(4) : ������ 75
// �̸� ���� �Է�(5) : �̱�� 95

//==============
//1�� �̱�� 95
//2�� ���ֿ� 90
//3�� ������ 85
//4�� ������ 80
//5�� ������ 75
//==============
//����Ϸ��� �ƹ� Ű�� ��������..
import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);

		int num=0;
		String name;
		
		String temp;


		System.out.print("�ο��� �Է� : ");
		num=sc.nextInt();
		
		int[] arr =new int[num];
		String[] arr2 =new String[num];
		String temp1;


		for (int i=0; i<arr2.length; i++ )
		{
			System.out.printf("�̸� ���� �Է�(%d) : ",i+1);
			arr2[i] = sc.next();
			arr[i] = sc.nextInt();
			
		}

		for (int i=1; i<arr.length; i++ )
		{
			boolean q = false;
			for (int j=0; j<arr.length-i; j++ )
			{
				if (arr[j] < arr[j+1])
				{
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j+1]^arr[j];
					arr[j]=arr[j]^arr[j+1];
					
					temp1=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp1;

					q=true;
				}

			}

			if (q==false)
			{
				break;

			}
			

			
		}

		System.out.println("=============");
		for (int i=0; i<arr.length; i++ )
		{
			System.out.printf("%d�� %s %d\n",i+1,arr2[i],arr[i]);
		}
		System.out.println();

	}
}