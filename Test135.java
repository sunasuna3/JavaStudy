/*==================================
���� �ڹ��� �ֿ�(�߿�) Ŭ��������
- StringTokenizer Ŭ����
===================================*/

/*
�� StringTokenizer Ŭ������
	���ڿ� �Ľ��� ���� ������ �����ϴ� Ŭ������
	�Ľ�(parsing)�ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
	���⿡�� �Ľ��̶� �ϳ��� ���ڿ��� ���� ���ڿ���
	������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ� ���ڿ���
	��ū(token)�̶�� �Ѵ�.

	StringTokenizer Ŭ������ ����ϱ� ���ؼ���
	java.util ��Ű���� StringTokenizer �� import �ؾ� �Ѵ�.

	StringTokenizer Ŭ������ ȣȯ���� �����ϴ� ��������  
	���� �����ǰ� ������ ���ڿ��� �Ľ��ϱ� ���ؼ���      
	String Ŭ������split() �޼ҵ峪 java.util.regex ��Ű����
	����� ���� �����ϰ� �ִ�.

�� ������
	- ����
	StringTokenizer(String str)
	StringTokenizer(String str, Stirng delim)
	StringTokenizer(String str, Stirng delim, boolean returnDelims)
	-> �־��� ���ڿ� str�� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
	   ����(����) ���ڴ� delim�� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
	   ���� returnDelims �� true ���....����(����)���ڵ�
	   �и��� ��ȿ�� �����ͷ� �����Ѵ�.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test135
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ�����) : ");
		strTemp =br.readLine();
		//--"���,����,�ٳ���,������"
		
		//StirngTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//--strTemp�� ��� ���ڿ���
		// ��,�� �� �����ڷ�..
		
		//Ȯ��
		//System.out.println(st.countTokens());
		//--��int countTokens()��
		//	: �Ľ̵� ���ڿ��� ������ ����(��ȯ)�Ѵ�.

		strArr = new String[st.countTokens()];
		//--�迭���� ������ ��ū���ҵ� ������ŭ �����Ѵ�.

		n=0;

		while (st.hasMoreTokens())
		{
			strArr[n++] = st.nextToken();
		}
		//--��hasMoreTokens()��
		//  : ����� �� �ִ� ��ū�� �����ִ� ��� true �� ��ȯ
		//	  �� �̻� ����� ��ū�� �������� ���� ��� false �� ��ȯ
		//	  Ȯ�� ����� ��ȯ�� ��... ��带 �̵���Ű���� �ʴ´�.

		//--��nextToken()��
		//	 : ���� ��ū�� ���´�.
		//	   ���� ��ū�� ������ ��带 �̵���Ű�� �ȴ�.
		//	   ���� �����ڸ� �ٲپ��� ��� ���� ȣ�⿡��
		//	   �ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.


		System.out.println("�Ľ̵� ��ū(���ڿ�) : ");
		for (String  srt :  strArr  )
		{
			System.out.print(srt + " ");
		}
		System.out.println();

	

	}	
}

/*
�Ľ��� ���ڿ� �Է�(�ĸ�����) : ���,����,�ٳ���,����,������,����,���ξ� ��
�Ľ̵� ��ū(���ڿ�) :
��� ���� �ٳ��� ���� ������ ���� ���ξ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/