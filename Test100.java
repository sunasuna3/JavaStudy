/*======================
  ���� ����޷� ����
=======================*/ 
//���� ��)
//���������� �Է��ϼ��� : 2019
//�������� �Է��ϼ��� : 7

/*
	[ 2019�� 7�� ]

 ��	��	ȭ	��	��	��	��
 ==========================
  	 1	 2	 3	 4	 5	 6
 7	 8	 9	10	11	12	13
14	15	16	17	18	19	20
21	22	23	24	25	26	27
28	29	30	31
==========================
*/
import java.util.Scanner;

class Test
{
	int y,m,d;
	int [] arr ={31,28,31,30,31,30,31,31,30,31,30,31};

	void input()
	{
		Scanner sc= new Scanner(System.in);

		System.out.print("���������� �Է��ϼ��� : ");
		y=sc.nextInt();
		
		System.out.print("�������� �Է��ϼ��� : ");
		m=sc.nextInt();
	}

	int week()
	{
		
		int py=y-1;
		py = (py)*365+(py/4)-(py/100)+(py/400);

		for (int i=0; i<m-1 ;i++ )
		{
			if (m==1 && m%4==0 && m%100!=0 || m%400==0)
			{
				py+=1;
			}
			py+=arr[i];
			
		}
		return py;
	}

	void print()
	{
		int count =1;
		int p = py%7+1;

		int[][]arr2=new int[5][7];

		for (int i=0; i<arr.length; i++ )
		{
			for (int j=0; j<arr[i].length; j++ )
			{
				if (j>=p)
				{
					arr[i][j] += count;
					count++;
					p=0;
				}
				if (count>arr[m-1] || j<p)
				{
					arr[i][j]=0;
				}
				


			}
		}

		for (int i=0; i<arr.length; i++ )
		{
			for (int j=0; j<arr.lengt; j++ )
			{
				System.out.print(arr[i][j]+ " ");
			}
		}


	}



	
}


public class Test100
{
	public static void main(String[] args)
	{
		Test ob = new Test();

		
		int py=ob.week();
		ob.print(py);
		


	}
}