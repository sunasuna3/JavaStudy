/*==================================
���� �ڹ��� �ֿ�(�߿�) Ŭ��������
- StringBuffer Ŭ����
===================================*/
/*
�� StringBuffer Ŭ������
   ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִٴ� ���̴�.

   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� ������ ���� ũ�⸦ �ٲ� �� �ִ� ����� �����ϴ� ���̴�.

   ����, JDK1.5 ���ĺ��ʹ�
   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�
   StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
   ���� ū �������� mult-thread unsafe ��� ���̴�.
   �� syncronization �� ���� ������
   StringBuffer���� ������ ���ü�(����ȭ) ������ ���ٸ�
   StringBuilder�� ����ϴ� ���� ������ ��� ��ų�� �ִ�.
   */

public class Test133
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);			//--==>false
		System.out.println(sb1.equals(sb2));	//--==>false  ���⼭ equals�� object��
		
		System.out.println(sb1.toString().equals(sb2.toString()));  //----- ���⼭ equals�� String��
		//--==>true 


		StringBuffer sb3 = new StringBuffer();  
		//--  StringBuffer �⺻ ������ ȣ���(�ν��Ͻ� ���� ����)
		//     �⺻������ �����Ǵ� ���� ũ�� == 16

		System.out.println("����ũ�� : " + sb3.capacity());
		//--==> ����ũ�� : 16


		//////////////////////////////////////////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>  ��

		sb3.append("seoul");		// sb3 += "seoul";
		//append -> �߰��ϰڴ�
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");



		System.out.println(sb3);
		//--==> seoulkorea�츮������ѹα�

		System.out.println(sb3.toString());
		//--==> seoulkorea�츮������ѹα�

		System.out.println("����ũ�� : "+sb3.capacity());
		//--==> ����ũ�� : 34

		//////////////////////////////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>JAVA AND ORACLE
		//to ~~ ~�� �ٲ㼭 ����ض�

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==> java and oracle


		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		System.out.println(temp3.toLowerCase());
		System.out.println(sb3.toString().toUpperCase());


		//seoulkorea�츮������ѹα�

		//�� ��� ���ڿ�(sb3) �� seoul ���ڿ� �տ�
		//	 �ѱ� �̶�� ���ڿ� �߰�
		sb3.insert(0, "�ѱ�");
		System.out.println("seoul �տ� �ѱ� �߰� : "+sb3.toString());
		//--==>seoul �տ� �ѱ� �߰� : �ѱ�seoulkorea�츮������ѹα�


		//�� ��� ���ڿ�(sb3) �� seoul ���ڿ� �ڿ�
		// ��� �̶�� ���ڿ� �߰�
		// ��, ��� ���ڿ��� �ε����� ���� Ȯ������ ����
		
		//step 1
		System.out.println(sb3.toString());


		//step 2
		//sb3.insert(7,"���");
		//System.out.println("seoul �ڿ� ��� �߰� : "+sb3.toString());


		//step 3
		//sb3.indexOf("seoul");
		System.out.println(sb3.indexOf("seoul"));
		//--==>2
		

		//step 4
		//sb3.insert(sb3.indexOf("seoul"),"���");
		//System.out.println(sb3.toString());
		//--==>�ѱ����seoulkorea�츮������ѹα�

		//step 5
		//sb3.insert(sb3.indexOf("seoul")+5,"���");
		//System.out.println(sb3.toString());
		//--==>�ѱ�seoul���korea�츮������ѹα�
		//5�� �����̶�� �ε��� ����

		//step 6
		//sb3.insert(sb3.indexOf("seoul")+("seoul"�� ����),"���");
		//System.out.println(sb3.toString());


		//step 7
		sb3.insert(sb3.indexOf("seoul")+"seoul".length(),"���");
		System.out.println(sb3.toString());
		//--==> �ѱ�seoul���korea�츮������ѹα�


		// �� ���츮���� ���ڿ� ����
		//sb3.delete(14,18);
		sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����")+"�츮����".length());
		//sb3.delete(sb3.indexOf("korea")+"korea".length(),sb3.indexOf("���ѹα�"));
		System.out.println(sb3);
		//--==> �ѱ�seoul���korea���ѹα�


		// �� ��� ���ڿ�(sb3)����
		//	��korea�� ���� ���ڿ� ���� (korea ����)
		//sb3.delete(sb3dml "korea" ���ڿ�������ġ,sb3�� ��);
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--==> �ѱ�seoul���


		// �� ��� ���ڿ�(sb3)����
		//	������� ���� ���ڿ� ���� (��� ����)
		sb3.delete(sb3.indexOf("���"),sb3.length());
		System.out.println(sb3);
		//--==> �ѱ�seoul

		///////////////////////////////////////////////////////////////////////////////////////

		//���� ũ�� Ȯ��
		System.out.println("����ũ�� : "+sb3.capacity());
		//--==> ����ũ�� : 34
		//String���� ����ũ��� �ڵ����� �÷��ش�. ������ ���빰�� �پ������� ����ũ��� �پ�����ʴ´�.  --> �þ ����ũ��� �ڵ����� ���ϼ�������.

		//���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ũ�� : " + sb3.length());
		//--==>���ڿ��� ũ�� : 7

		//���� ũ�� ���� -> ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		sb3.trimToSize();

		//���� ũ�� ���� ���� ���� ũ�� Ȯ��
		System.out.println("����ũ�� : "+sb3.capacity());
		//--==> ����ũ�� : 7
		



	}
}
	