/*==============================
���� ����(Exception)ó������
==============================*/

/*
�� ���α׷����� �߻��ϴ� ������

	1. �߸��� ������ ����ϰų� ���� ���� �������� ���� ���¿���
	   ��������ν� ������ �ܰ迡�� �߻��ϴ� ������ ����

	2. ���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ������ ���� �� �ִ�.

	   - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
	   	 ������ ����� �������� �Ǵ� ������ ������

	   - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����, �׸���
	     
	   - ���α׷� �ǻ� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
	   	 ���ܻ����� �ִ�.
		
		 ���� ���
		  -> � ���� 0���� �����ų�...
		  -> �迭 ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�...
		  -> �������� �ʴ� ������ �����Ͽ� �о���δٰų�...

==> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
    ������ �����ϱ� ���� ������ �����ϵ��� ������ ������ ���� ��.
	�� �� ó ��

�� ������ ���� ����~~~!!!(->Exception Ŭ����)

	- ���ܴ� ���α׷� ���� �� �߻��� �� �ִ�
	  ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
	  �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(��ü ) �̴�

	- ���α׷� ���� �߿� �޼ҵ� �ȿ� ������ �߻��ϰ� �� ���,
	  �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
	  �װ��� �ڹ� ��Ÿ�� �ý��ۿ� ������ �ش�.

	- �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
	  Thorwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.

	- Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
	  ���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�.

	- Throwable Ŭ�������� �Ļ��� Ŭ����
		
		1) Exception Ŭ����
		   Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
		   ������ �� �ִ� ���� ��Ȳ���� �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.

		2) Error Ŭ����
		   �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.

�� ������ ����

	-checked exception
	 �޼ҵ� ������ ���ܰ� �߻��� ���
	 �޼ҵ带 ������ �� throws ���� �޼ҵ� ������ �߻��� �� �ִ�
	 ���ܵ��� ����� �ְų� �Ǵ� �� ���ܸ� try~catch �ؼ�
	 ó���� �־�߸� �ϴ� �����̴�.
	 �����Ϸ��� ������ �ϴ� �������� checked exception ��
	 throws �Ǵ°��� ���γ� Ȥ�� try~catch �Ǵ����� ���θ� �Ǵ��Ͽ�
	 ���α׷����� ���ܸ� ó������ ������ ������ ��ü�� �Ұ����ϴ�.


	-unchecked exception
	 ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�...
	 ��Ÿ�� �ÿ� �߻��ϴ� ����.

�� java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�

	- String toString()
	 : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
	- void printStackTrace(printStream s)
	- void printStackTrace(printWriter w)
	 : ǥ�� ��� ��Ʈ�ӿ� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.

�� �ֿ� ��Ÿ�� ���� Ŭ����
   - ArithmeticException
   : ��ġ ������ ����(0���� ������ ��)
   - ArrayStroreException
   : �迭�� �߸��� ������ ���� �����Ϸ� ���� �� �߻��ϴ� ����
   - IndexOutOfBoundsException
   : �迭 ���ڿ� ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����
   - ClassCastException
   : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����
   - NullPointException
   : �� ��ü�� �����ϴ� ��� �߻��ϴ� ����
   - securityException
    : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����

		:
		:
		:
		:

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test142
{										   // ��
	public static void main(String[] args) //throws IOException
	{
		//BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		//�ֿ� ���� ����

		int a,b,c;
		//��
		/*
		try //try ��~!!!
		{
			System.out.print("ù ��° ���� �Է�:");
			a= Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�:");
			b= Integer.parseInt(br.readLine());		
			c= a+b;
			System.out.println("��� : "+c);
			
		}
		catch (IOException e)
		{
			//IOEXception -> checked exception
			//--�޼ҵ带 �����ϴ� �������� throws �� ����.
			//  ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e.toString());
		}
		*/


		// ��
		/*
		try 
		{
			System.out.print("ù ��° ���� �Է�:");
			a= Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�:");
			b= Integer.parseInt(br.readLine());		
			c= a+b;
			System.out.println("��� : "+c);
			
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch(NumberFormatException e2)
		{
			//NumberFormatException -> unchecked exception
			//--��Ÿ�� �� �߻��� �� �ִ� ���ܷ�
			// �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.
			System.out.println(e2.toString());
			System.out.println("���� ������ �����͸� �Է��ϼ���~!!!");
		}
		*/

		//��
		/*
		try 
		{
			System.out.print("ù ��° ���� �Է�:");
			a= Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�:");
			b= Integer.parseInt(br.readLine());		
			c= a+b;
			System.out.println("��� : "+c);
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
		*/

		//etc.....

		try 
		{
			System.out.print("ù ��° ���� �Է�:");
			a= Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�:");
			b= Integer.parseInt(br.readLine());		
			c= a+b;
			System.out.println("��� : "+c);
			
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch(NumberFormatException e2)
		{

			System.out.println("���� ������ �����͸� �Է��ϼ���~!!!");
		}
		finally
		{
			//���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ����
			System.out.println("��� �����̽��ϴ�. �����մϴ�.");
		}




	}
}