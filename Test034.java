/*==============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else �ǽ�
===============================================*/

//�ǽ� ����
//������ �� ������ �����ڸ� �Է¹޾�
//�ش� �������� ó�� ����� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
//���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

//���� ��)
//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� : 14
//������ �Է� (+ - * /) : +

// >>10+14 = 24
// ����Ϸ��� �ƹ� Ű��...

//ù ��° ���� �Է� : 5
//�� ��° ���� �Է� : 3
//������ �Է� (+ - * /) : /

// >>5 / 3 = 1
// ����Ϸ��� �ƹ� Ű��...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test034
{
	public static void main(String [] args) throws IOException
	{
		/* ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, tot;
		char a;

		System.out.print("ù ��° ���� �Է� :");
		num1= Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է� (+ - * /) :");
		 a =(char)br.read();

		 

		if (a == '+')
		{
			tot =num1 + num2;
				
		}
		else if (a == '-' )
		{
			tot = num1 - num2;
				
		}
		else if (a == '*')
		{
			tot = num1 * num2;
				
		}
		else 
		{
			tot = num1 / num2;
				
		}
		

		System.out.printf(">>%d %c %d = %d\n",num1,a,num2,tot);

	
		*/

		//��� ��
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b;
		char op;
		

		System.out.print("ù ��° ���� �Է� : ");
		a=Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b=Integer.parseInt(br.readLine());

		System.out.print("������ �Է� (+ - * /) :");
		//op=Integer.parseInt(br.readLine());   -X
		//op = br.readLine();					-x
		op = (char)System.in.read();  //�ڵ�����ȯ�� ����� char��

		//"1234" -> Integer.parseInt(); ->1234
		//"abcd" -> Integer.parseInt(); -> X  
		//���� ����� ���������� �ٲ��ִ°�


		if (op == '+')
		{
			System.out.printf("\n>> %d + %d =%d\n" ,a,b,(a+b));
		}
		else if( op =='-')
		{
			System.out.printf("\n>>%d - %d = %d\n" ,a,b,(a-b));
		}
		else if( op =='*')
		{
			System.out.printf("\n>>%d * %d = %d\n" ,a,b,(a*b));
		}
		else if( op =='/')
		{
			System.out.printf("\n>>%d / %d = %d\n" ,a,b,(a/b));
		}
		else
		{
			System.out.printf("�Է� ������ ������ �����մϴ�.");
		}
		*/

	
		//��Ĩ�
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b,op;

		System.out.print("ù ��° ���� �Է� : ");
		a=Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b=Integer.parseInt(br.readLine());


		System.out.print("������ �Է�(+ - * /) : ");
		op=System.in.read();

		System.out.println("op : " + op);
		// --> + 43
		// --> - 45
		// --> * 42
		// --> / 47

		if (op == 43) //+
		{
			System.out.printf("\n>> %d + %d =%d\n" ,a,b,(a+b));
		}
		else if( op ==45) //-
		{
			System.out.printf("\n>>%d - %d = %d\n" ,a,b,(a-b));
		}
		else if( op ==42) // *
		{
			System.out.printf("\n>>%d * %d = %d\n" ,a,b,(a*b));
		}
		else if( op ==47) // /
		{
			System.out.printf("\n>>%d / %d = %d\n" ,a,b,(a/b));
		}
		else
		{
			System.out.printf("�Է� ������ ������ �����մϴ�.");
			
		}
		*/

		//��Ĩ�

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b, result=0; 
		char op;
		

		System.out.print("ù ��° ���� �Է� : ");
		a=Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b=Integer.parseInt(br.readLine());

		System.out.print("������ �Է� (+ - * /) :");
		//op=Integer.parseInt(br.readLine());   -X
		//op = br.readLine();					-x
		op = (char)System.in.read();  //�ڵ�����ȯ�� ����� char��

		//"1234" -> Integer.parseInt(); ->1234
		//"abcd" -> Integer.parseInt(); -> X  
		//���� ����� ���������� �ٲ��ִ°�


		if (op == '+')
		{
			result = a + b;
		}
		else if( op =='-')
		{
			result = a - b;
		}
		else if( op =='*')
		{
			result = a * b;
		}
		else if( op =='/')
		{
			result = a / b;
		}



		System.out.printf(">>%d %c %d = %d\n",a,op,b,result);

	}
}
/* ���� ���
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 10
������ �Է� (+ - * /) :+
>>5 + 10 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/