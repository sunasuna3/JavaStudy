/*==================================
���� �ڹ��� �ֿ�(�߿�) Ŭ��������
- Wrapper Ŭ����
===================================*/



public class Test129
{
	public static void main(String[] args)
	{
		byte b =3;
		int i =256;

		Byte b2 = new Byte(b);   	//--boxing
		Integer i2=new Integer(i);  //--boxing
		

		System.out.println(b2);     //--==>> 3
		System.out.println(i2);     //--==>> 256

		print(b2);
		print(i2);

		byte b3 = b2.byteValue();  //--unboxing
		int i3 = i2.intValue();		//--unboxing
		
	
		//check!!@@
		int i4 = i2.byteValue();
		//byte b4 = b2.intValue(); //--==>���� �߻�
		byte b4 =i2.byteValue();
		
		System.out.println("b3 : " +b3);    
		System.out.println("i3 : "+i3);
		

		//check!!@@
		System.out.println("b4 : " +b4);    
		System.out.println("i4 : " +i4);



	}
	
	//�� java.lang.Number Ŭ����(�߻�Ŭ����) ��
	//   ���  Warapper Ŭ�������� �θ� Ŭ����(���� Ŭ����, ���� Ŭ����)�̴�.
	//   b2 ,i2 �ڷ����� Number n�� �Ѿ���鼭
	//   �� ĳ������ �Ͼ�� �ȴ�.(Auto-Boxing ����)
	static void print(Number n)
	{
		System.out.println(n);
		System.out.println(n.intValue());
	}


}