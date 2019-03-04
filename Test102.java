/*===============================
���� ����(Sort) �˰��� ����
-- ���� ����(Seletion sort)
===============================*/

/*
�� ����
	: �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
	: ������ ó�� ������ ���Ǽ��̳� �������� ������ ����
		-> ��������... �˻��ϱ� ����

�� ������ ����
	: ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ����,..
*/

public class Test102
{
	public static void main(String[] args)
	{
		int [] a = {52, 42, 12, 62, 60};
		 /*
		 52, 42, 12, 62, 60		0	1
		 ======
		 42, 52, 12, 62, 60		0	2
		 ==      ===
		 12, 52, 42, 62, 60		0	3
		 ==          ==
		 12, 52, 42, 62, 60		0	4
		 ==              ==   
		 
		 -------------------- 1ȸ�� ��
		 12, 52, 42, 62, 60		1	2
		     ==  ==
		 12, 42, 52, 62, 60		1	3	
		     ==      ==
			 ==          ==		1	4
		 -------------------- 2ȸ�� ��
		 12, 42, 52, 62, 60		2	3
		         == ===
				 ==      ==		2	4
		 -------------------- 3ȸ�� ��
		 12, 42, 52, 62, 60		3	4
					 ==  == 	i   j
		 -------------------- 4ȸ�� ��
		 */
		/*
		 for (int i=0; i<a.length; i++ )
		 {
			 for (int j=1+i; j<a.length; j++ )
			 {
				 if (a[i] > a[j] )
				 {
					 a[i] = a[i]^a[j];
					 a[j] = a[j]^a[i];
					 a[i] = a[i]^a[j];
				 }
			 }
		 }

		
		for (int i=0; i<a.length; i++ )
		 {
			System.out.println(a[i] +" ");
		 }
		 */

		 int i, j;
		/*
		 System.out.print("Source Date : " );
		 for (i=0; i<a.length; i++ )
		 {
			System.out.println(a[i] +" ");
		 }
		 System.out.println();
		 */

		 //���� for�� -> forEach ����
		 System.out.print("Sorted Date : ");
		 for (int n : a ) //a-> �����   n-> a�� �����ϰ� �ִ� �ϳ��� ������ Ÿ��(���⼭�� int)  ex) Record[] recArr;  -> for(Record n : recArr) Record Ÿ��			//--> �������� �ƹ��ų� (���⼭�� n)
			 System.out.print(n + " ");
		 System.out.println();
		 //--==> Source Date : 52, 42, 12, 62, 60  (�����Ѱ� �ƴ�)

		 //Selection sort ����
		 for (i=0;i<a.length-1; i++ ) //0123(4) -> �� ���� �������� �ε���
		 {
			 //System.out.println("��");
			 for (j=i+1; j<a.length;j++ ) //0-1234 -> �� ��� �������� �ε���
			 {							 //1-234 
				//System.out.println("��");
				 if (a[i]>a[j])			//�������� ���� ����  -> ���������϶� <
				 {
					 //�ڸ� �ٲٱ�
					 a[i]=a[i]^a[j];
					 a[j]=a[j]^a[i];
					 a[i]=a[j]^a[i];
				 }
			 }
		 }

		 //����� ���
		for (int n : a )
			System.out.print(n + " ");
		System.out.println();


	}
}

/*
Sorted Date : 52 42 12 62 60
12 42 52 60 62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
