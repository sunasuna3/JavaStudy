/*==============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  -   - switch �� �ǽ�
===============================================*/

//�ǽ� ����
//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
//���� ����� ���ǻ� ���� ���·� ó���ϵ��� �Ѵ�.

//���� ��)
//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� : 10
//������ �Է�(+ - * /) : +

//>> 10+28 = 38
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test042
{
	public static void main(String [] args)throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


		//���� Ǭ ����
		/*
		int num1,num2;
		
		char ch;

		System.out.print("ù ��° ���� �Է� : ");
		num1=Integer.parseInt(br.readLine());
 
 		System.out.print("�� ��° ���� �Է� : ");
		num2=Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		ch = (char)System.in.read();

		
		switch (ch)
		{
		case '+' : System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));break;		
		case '-' : System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));break;			
		case '*' : System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));break;		
		case '/' : System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));break;		
		default : System.out.println("�Է� ����~!!!");break;		
		}
		

		switch (ch)
		{
		case 43 : System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));break;		
		case 45 : System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));break;			
		case 42 : System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));break;		
		case 47 : System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));break;		
		default : System.out.println("�Է� ����~!!!");break;	
		
		}
		*/

		//���� Ǭ ����

		int a,b, result;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a=Integer.parseInt(br.readLine());
 
 		System.out.print("�� ��° ���� �Է� : ");
		b=Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		switch (op)
		{  // case ���1  => ����� �� �� �־��µ� JDK1.5 �̻���� ĳ�������� ĳ�������� ��� ���� 
		case '+' : result = a+b;break;
		case '-' : result = a-b;break;
		case '*' : result = a*b;break;
		case '/' : result = a/b;break;			
		default : return;    //-- �޼ҵ� ���� -> return Ű���带 ǰ���ִ� main() �޼ҵ带 ���� -> ���α׷��� ����
		}

		//�� return : 1.���� ��ȯ
		//			  2.�޼ҵ� ����

		System.out.println();
		System.out.printf(">> %d %c %d =%d\n",a,op,b,result);





		


	}
}
/* ���� ���
ù ��° ���� �Է� : 1
�� ��° ���� �Է� : 2
������ �Է�(+ - * /) : +

>> 1 + 2 =3
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



*/