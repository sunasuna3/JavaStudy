/*=========================
  ���� �迭 ����
  - �迭�� ����� �ʱ�ȭ
==========================*/

/*
�� �迭�� ����

	1.�迭�̶� ũ��� ������ ���� �Ϸ��� ���ҵ��� ��
	  ������ ���� ������ ���� �ڷ��� ����ü�� �ǹ��ϴ� ������
	 ���������� ������ ���� �ڷ�须�� ����
	  ���������� �ڷ���(Data Type)�� �ο����� �ʰ�
	  �ϳ��� �̸��� ������ �ϰ������� ó���� �������� ���ȴ�.

	2.�ڹٿ����� �迭�� ������ ���� ������ ���� ���ȴ�.
	  �迭 ���� -> �迭�� �޸� �Ҵ� -> �迭 ����� ���

	3.���� �� ����
	  �ڷ���[] ������;
	  ������ = new �ڷ���[���ũ��];
	  ������[�ε���] = ��;

	  int [] arr;
	  arr = new int[3];
	  arr[0] = 10;
	  arr[1] = 20;
	  arr[2] = 30;

*/

public class Test079
{
	public static void main(String[]args)
	{
		//�迭 ����
		int[] arr;

		//�޸� �Ҵ�
		arr = new int[10];

		//�迭�� ������ ���� ����� ���ÿ�
		//�޸� �Ҵ� �� �ʱ�ȭ�� �����ϴ�.
		int[]arr2 = new int[10];   
		int[]arr3={1,2,3,4,5,6,7,8,9,10}; 
		int arr4 []={1,2,3,4,5,6,7,8,9,10}; 

		//�迭 ��� ���(���� -> �ε����� ����...)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		//�� ���� �Ҵ����� ���� ������ �迭 ������
		//	�ڵ����� �ʱ�ȭ �ȴ�. -> 0(int�� �迭)

		//�迭�� ��� ������(���)�� �� ���(����)
		System.out.println("arr : "+arr);
		//--==> arr : [I@15db9742
		//--�迭�� ����ϱ� ���� �迭���� �Ϲ� ����ó�� ����Ͽ� ����ϴ�
		//	�������� �ۼ��ϰ� �Ǹ� �迭�� �� �濡 ����ִ� �����Ͱ�
		//  ��µǴ� ���� �ƴ϶� �츮�� �˾ƺ� �� ���� �ڵ尡 ��µȴ�.


		System.out.println("arr[0] : " +arr[0]);
		//--==> arr[0] : 1
		System.out.println("arr[1] : " +arr[1]);
		//--==> arr[1] : 2
		System.out.println("arr[2] : " +arr[2]);
		//--==> arr[2] : 3

		//System.out.println(arr[0] + "," + arr[1] + ","+arr[2] + ....+arr[9]);

		//�ݺ����� Ȱ���Ͽ� �迭�� ��� ������ ��ü ���
		for (int i=0;i<10 ;i++ ) //i -> 0 1 2 3 4 5 6 7 8 9
		{
			//System.out.printf("%2d", arr[i]);
			//--==> 1 2 3 0 0 0 0 0 0 0
			
			System.out.printf("arr �迭�� %2d��° �� : %d \n",i,arr[i]);
			/*
			arr �迭�� 0��° �� :  1
			arr �迭�� 1��° �� :  2
			arr �迭�� 2��° �� :  3
			arr �迭�� 3��° �� :  0
			arr �迭�� 4��° �� :  0
			arr �迭�� 5��° �� :  0
			arr �迭�� 6��° �� :  0
			arr �迭�� 7��° �� :  0
			arr �迭�� 8��° �� :  0
			arr �迭�� 9��° �� :  0
			*/
		}
		System.out.println();






	}
}