import java.util.Scanner;

public class Sungjuk
{
	/*
	int num;

	Record[] arr;

	
	 void input()
	{

		Scanner sc = new Scanner(System.in);//class�� ��������!!

		do
		{
			System.out.print("�ο� �� �Է�(1~100) :");
			num = sc.nextInt();
		}
		while (num<1 || num>100);

	}

	 void names()
	{


		 arr =new Record[num];
		 for (int i=0; i<num; i++ )
		{
			
		 arr[i]=new Record();


		System.out.printf("%d��° �л��� �̸� �Է� : \n",i+1);
		arr[i].name = sc.next();

		System.out.print("���� ���� : ");
		arr[i].kor = sc.nextInt();

		System.out.print("���� ���� : ");
		arr[i].eng = sc.nextInt();

		System.out.print("���� ���� : " );
		arr[i].mat = sc.nextInt();

		}

	}

	void cla ()
	{
		for (int i=0; i<num ;i++ )
		{
			arr[i].tot = arr[i].kor +arr[i].eng + arr[i].mat;
			arr[i].avg = arr[i].tot/3; 
		}

	}
	

	void print()
	{
		for (int i=0; i<num ;i++ )
		{
			System.out.printf("%s %d %d %d %d %.2f\n",arr[i].name,arr[i].kor,arr[i].eng,arr[i].mat,arr[i].tot ,arr[i].avg);
		}		
	}
	*/

	//�ֿ� �Ӽ� ����
	int inwon;//--�ο���
	Record[] recArr;   //-���ڵ� �迭
						//(�л� 1�� �� ���ڵ� �迭�� �� 1�� Ȱ��)

	//���(�޼ҵ� ����)
	//1.�ο��� ����
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~100) :");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);  //1���� �۰ų� 100���� ũ��
		

		//üũ!�ڡ�
		//Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		//�迭���� inwon ��ŭ ������ ������,
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		recArr = new Record[inwon];
	}


	//���(�޼ҵ� ����)
	//2.�� ������ �Է� + 3.����/��� ����
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String [] subTitle ={"���� ���� : ", "���� ���� : ","���� ���� : "};

		for (int i=0; i<inwon; i++ )  //1���� �Է� �޴°� �ƴ϶� �ݺ��ؼ� �Է� �޾ƾ� �ϴϱ� �ݺ����ȿ� //�ο��� ��ŭ �ݺ�~!!!(==recArr.length)
		{

			//üũ �ڡ�
			//Record Ŭ���� ����� �ν��Ͻ� ����
			recArr[i] = new Record();

			System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			recArr[i].name = sc.next();

			for (int j=0; j<subTitle.length; j++ )
			{
				// �ȳ� �޼��� ���
				System.out.print(subTitle[j]);

				//����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				recArr[i].score[j]=sc.nextInt();

				//����,����,���� ���� �����͸� �ݺ������� �Է¹޴� ����
				//�� �������� ���� �����ϱ�
				recArr[i].tot += recArr[i].score[j];

			}

			//��� �����ϱ�
			recArr[i].avg = recArr[i].tot/3.0; //�׷��� �Ǽ������ ���� ����


		}

	} //end input()


	//���(�޼ҵ� ����)
	//4.��� ���
	
	public void print()
	{
		//���� ���� �޼ҵ� ȣ�ⱸ�� �߰�~!!
		ranking();

		//����
		System.out.println();

		//�л� 1�� �� �ݺ� ��� ����
		for (int i=0; i<inwon; i++  ) //�л� �ο� �� ��ŭ �ݺ� (==recArr.length)
		{
			//�̸� ���
			System.out.printf("%5s",recArr[i].name);

			//����(����,����,����)�ݺ� ���
			for (int j=0; j<inwon; j++ )
				System.out.printf("%4d",recArr[i].score[j]);

			//����, ��� ���
			System.out.printf("%5d",recArr[i].tot);
			System.out.printf("%8.2f",recArr[i].avg);

			//���� ���
			System.out.printf("%5d",recArr[i].rank);

			//����
			System.out.println();  

		}
	}//end print();


	//���(�޼ҵ� ����)
	//4.���� ���� �޼ҵ� �߰�~!!!

	private void ranking()   //������ ����Ʈ������ �ҷ����ϱ� private ���� 
	{
		//���� ����
		int i,j;

		//��� �л����� ���(����)�� 1�� �ʱ�ȭ
		for (i=0; i<inwon; i++ )
			recArr[i].rank =1;

		//���(����)����
		for (i=0; i<inwon-1; i++ )  // i => �� ������ �����ϴ� �ε���
		{
			for (j=i+1; j<inwon; j++ ) // j => �� ����� �����ϴ� �ε���
			{
				if (recArr[i].avg>recArr[j].avg) //���� �����Ͱ� �� �����ͺ��� ũ�ٸ�...
				{
					//�� �������� rank�� 1��ŭ ����  (����� �������� ���� ����)
					recArr[j].rank++;
				}
				else if (recArr[j].avg>recArr[i].avg) //�� �����Ͱ� ���� ������ ���� ũ�ٸ�...
				{
					//���� �������� rank�� 1��ŭ ����
					recArr[i].rank++;
				}
			}
		}

	}//end ranking



	


}
