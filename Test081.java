/*=========================
  ���� �迭 ����
  - �迭�� ����� �ʱ�ȭ
  - �迭�� �⺻���� Ȱ��
==========================*/

//�� �ǽ� ����
//��char�� �ڷ����� �迭�� ����� ���ĺ� �빮�ڸ� ä���
// ä���� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//A B C D ......W X Y Z
//����Ϸ��� �ƹ� Ű��....



public class Test081
{
	public static void main(String[] args)
	{
		
		/*
		char []arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		*/

		//��� 3

		char [] arr3 =new char[26];
		for (int i=0, ch=65;i<arr3.length ;i++, ch++)
		{
			arr3[i] = (char)ch;
		}

	
		//�迭 ��� ��ü ���
		for (int i=0;i<arr3.length ;i++ )
		{
			System.out.print(arr3[i] + " ");
		}
		System.out.println();


	}
}
//���� ���
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/