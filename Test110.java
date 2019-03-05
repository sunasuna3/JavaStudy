/*========================
���� Ŭ���� ��� ����
- �߻� Ŭ����(Abstract)
=========================*/

/*
 �� �߻� Ŭ����(abstract)��
	���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
    ���� Ŭ�������� �������̵��� ������ ����Ǵ� �޼ҵ忡 ����
	�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

 �� ���� �� ����
    [��������������] abstract class Ŭ������
    {
	   [��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
    }

 �� Ư¡ 
    Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
	�� Ŭ������ Ŭ���� �̸� �տ� ��abstract��Ű���带 �ٿ�
	�߻� Ŭ������ ����ؾ� �ϸ�
	�߻� Ŭ������ ������ ��쿡��
	�ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
	�߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
	��ü�� ������ �� ���� ���̴�.

	��, �߻� Ŭ������ ���������� ������ �� ���� ������
	����� ���ؼ��� �����ϸ�
	�߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
	�ݵ�� �߻� �޼ҵ带 �������̵�(overriding) �ؾ��Ѵ�.

�� ��abstract�� Ű�����
	Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� ���������� ��� �Ұ��ϴ�.
*/
//�߻� Ŭ����
abstract class SortInt
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	//�߻� �޼ҵ�(abstract)
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	//compare() �޼ҵ�� ũ�� �� �޼ҵ�
	// ��final�� Ű����� ���� �� Ŭ������ ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 �������� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
		{
			return 0;
		}
		else if (x>y)
		{
			return 1;
		}
		else
			return -1;
	}
	// swap() �޼ҵ�� �ڸ� �ٲ� �޼ҵ�
	// ��final�� Ű����� ���� �� Ŭ������ ��ӹ޴� Ŭ��������
	// ��� �� �޼ҵ常ŭ�� overriding �ؼ� ������� ���ƶ�~!!!
	// ��� �ǹ� ����
	protected void swap(int i, int j)
	{
		int temp=value[i];
		value[i]=value[j];
		value[j]=temp;
	}



}
//SortInt(�߻� Ŭ����)�� ��ӹ��� Ŭ���� -> �߻� Ŭ���� -> �߻� �޼ҵ� ������ -> �Ϲ� ���� Ŭ���� 
public  class Test110 extends SortInt
{
	
	int i,j;
	static int[] data ={7, 10, 3, 8, 7};
	
	//--------------------------------------------
		/*@Override
		protected void sorting()
		{			
			 for (i=0; i<data.length; i++ )
		 {
			 for (j=i+1; j<data.length; j++ )
			 {
				 if (data[i] > data[j] )
				 {
					 data[i] = data[i]^data[j];
					 data[j] = data[j]^data[i];
					 data[i] = data[i]^data[j];
				 }
			 }
		 }

		}
		*/

		//protected abstract void sorting()
		@Override
		protected void sorting()
		{
			//Seletion sort
			for (i=0;i<dataLength()-1; i++ )
			{
				for (j=i+1; j<dataLength(); j++ )
				{
					if (compare( i,j)>0)  //ũ���(���� ����)
					{
						swap(i,j);
					}
				}

				//�߰�
				System.out.print((i+1) +"Round Data : ");
				for (int n : data )
				{
					System.out.print(n + " ");
				}
				System.out.println();
			}
		}




		
	//-------------------------------------------


	public static void main(String[] args)
	{
		//SortInt ob = new SortInt(); 
		//Test110 ob = new Test110();

		System.out.print("Source Data : ");
		for (int n:data)
			System.out.print(n + " ");
		System.out.println();

		Test110 ob = new Test110();
		ob.sort(data);

		System.out.print("Source Data : ");
		for (int n:data)
			System.out.print(n + " ");
		System.out.println();
		
	}
}