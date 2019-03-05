/*========================
���� Ŭ���� ��� ����
- ���(Inheritance)
=========================*/

/*
�� �޼ҵ� �������̵�(Method overrding)�� Ư¡

	- �޼ҵ� �̸�, ���� Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.
	- �ݵ�� ��� ���谡 �־�� �Ѵ�.
	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
	  ����Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protectd���� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(overrding)�ϴ� ���
	  �������������ڴ� ��protectd���Ǵ¡�public���̾�� �Ѵ�.
	- ��static��,��final��(�޼ҵ忡���� ��밡��,Ʃ�� X),��private�� �޼ҵ�� �������̵�(overrding) �� �� ����.
	- Exception�� �߰��� �Ұ����ϴ�.
	  ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� ���� ���� ���׿�
	  ���ο� Exception �� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�.
*/

// ���� Ŭ����, �θ� Ŭ����, super class
class SuperTest03
{
	private int a=5;
	protected int b=10;
	public int c=20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " +a+" : "+b+" : "+c);
	}

}
//���� Ŭ����, �ڽ� Ŭ���� , sub class
class SubTest03 extends SuperTest03
{
	/*
	private int a=5; //-->x
	protected int b=10;
	public int c=20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " +a+":"+b+":"+c);
	}
	*/
 
	protected int b=100;  //�ڱⰡ �� �������� �� �ʱ�ȭ

	public void print()
	{
		//System.out.println("Sub print() �޼ҵ� : "+a+" : " + b + " : "+c);
		System.out.println(b);  //this.b  ->  �����ϸ� �������� ���
		System.out.println(super.b);

		System.out.println("Sub print() �޼ҵ� : " + b + " : "+c);
		//--==> Sub print() �޼ҵ� : 100 : 20
		//-- ���� Ŭ�������� ����� ���� a������ ������ �� ����.
		//   ->private ���� �̱� ������
		
		System.out.println("Sub print() �޼ҵ� : " + super.b + " : "+c);
		//--==>Sub print() �޼ҵ� : 10 : 20
		//--���� Ŭ�������� ����� ���� b�� �����ϱ� ���ؼ���
		//  ��super�� Ű���带 ����ϸ� �����ϴ�.

		System.out.println("Sub print() �޼ҵ� : " +c);
		System.out.println("Sub print() �޼ҵ� : " +this.c);
		System.out.println("Sub print() �޼ҵ� : " +super.c);
		//--==>	Sub print() �޼ҵ� : 20
		//		Sub print() �޼ҵ� : 20
		//		Sub print() �޼ҵ� : 20
		//-- ���� Ŭ�������� ����� ���� c�� �����ϴ� ������
		//	 �ƹ��� ����� ������ ����.


	}

		@Override
		public void write()
		{
			//System.out.println("Sub write() �޼ҵ� : " +a+" : "+b+" : "+c);
			System.out.println("Sub write() �޼ҵ� : " +b+" : "+c);
			//--==>Sub write() �޼ҵ� : 100 : 20
			//--���� Ŭ�������� ����� ����a�� ������ �� ����.
			//	->private �����̱� ������..
			//  ����, �̶� ������ ����b�� �θ�� ���� �������� b�� �ƴ�
			//  �ڽ��� ���� b �� ���� Ȯ���� �� �ִ�.
		}
}

//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ���� 
public class Test109
{
	public static void main(String[] args)
	{
		//���� Ŭ����(SubTest03) �ν��Ͻ� ����
		SubTest03 ob=new SubTest03();

		ob.print();

		ob.write();
		

		System.out.println("----------------------------���м�");

		((SuperTest03)ob).write();                 //Check~!!
		//--==>Sub write() �޼ҵ� : 100 : 20

		System.out.println(ob.b);
		//--==> 100

		System.out.println(((SuperTest03)ob).b);   //Check~!!
		//--==> 10

		// �� ���� �θ�

		// �� �޼ҵ�� ������ �� �����Ͽ� ������ ��~!!!

	}
}
