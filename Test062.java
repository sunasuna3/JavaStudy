/*==========================================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  -  �ݺ���(for��) �ǽ�
  -  ����� �ǽ�
===========================================================*/

//�۰���
//������ ���� ������ ��µ� �� �ֵ���
//�ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����Ѵ�.

/*

*********  
 *******  
  *****   
   ***   
   	*   

*/

public class Test062
{
	public static void main(String[] args) 
	{
		int a; //��
		int b; //����
		int c; //*

		for (a=1;a<=5 ;a++ )        //a=1
		{
			for (b=0; b<(a-1); b++) //
			{
				System.out.print(" "); //0�� ���
			}
			for (c=9;c>=(2*a-1);c-- )      // 1->9 ..1->1
			{
				System.out.print("*");  //9�� ���
			}

			System.out.println();		//����
		}
	}
}


//������
/*
*********
 *******
  *****
   ***
    *
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/