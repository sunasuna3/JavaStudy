/*==================================
���� �ڹ��� �ֿ�(�߿�) Ŭ��������
- Calendar Ŭ����
===================================*/


// �ǽ�����
// ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
// Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, Calendar Ŭ������ Ȱ���Ͽ� ó���Ѵ�.

//���� ��
// ���� ��¥ : 2019-3-8-�ݿ���
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�?? 200

//========[Ȯ�ΰ��]==========
// 200�� �� : 2019-xx-xx x ����
//============================
//����Ϸ��� �ƹ� Ű�� ��������..




import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test139
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		Calendar cal = Calendar.getInstance();
		
		int y,m,d,w,nal;

		String[] week ={"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;  //--��+1�� check~!!!!
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK)-1;


		System.out.println( "���� ��¥ : "+ y + "-" + m + "-" + d + " " +week[cal.get(Calendar.DAY_OF_WEEK)-1]);

		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�??  ");
		nal = Integer.parseInt(br.readLine());
		

		cal.add(Calendar.DATE,nal);

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;  
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK)-1;


		System.out.println("========[Ȯ�ΰ��]==========");
		System.out.println( nal +"�� �� : "+ y + "-" + m + "-" + d + " " +week[cal.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println("============================");

		*/

		Calendar now = Calendar.getInstance();
		int nalsu;		//-- ����ڷκ��� �Է¹��� �� �� 
		int y,m,d,w;	//-- ��,��,��,����
		String[] week ={"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};

		//������ ��, ��, ��, ���� Ȯ��(��������: get())
		y=now.get(Calendar.YEAR);
		m=now.get(Calendar.MONTH)+1;
		d=now.get(Calendar.DATE);
		w=now.get(Calendar.DAY_OF_WEEK);

		//������ ��, ��, ��, ���� Ȯ�ΰ�� ���
		System.out.println( "���� ��¥ : "+ y + "-" + m + "-" + d + " " +week[w-1]);

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�??  ");
			nalsu = Integer.parseInt(br.readLine());
		}
		while (nalsu<1);
		//�� �� ���ϱ� ����
		now.add(Calendar.DATE,nalsu);
		
		//��� ���
		System.out.println("========[Ȯ�ΰ��]==========");
		System.out.printf("%d�� �� : %tF %tA\n",nalsu,now,now);
		System.out.println("============================");
		
		//%t ��¥(�ð�)Ÿ�� => �ȿ� ������ �ִ°� DATEŸ��
	

	}
}

//���� ���
/*
���� ��¥ : 2019-3-8 �ݿ���
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�??  100
========[Ȯ�ΰ��]==========
100�� �� : 2019-06-16 �Ͽ���
============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/