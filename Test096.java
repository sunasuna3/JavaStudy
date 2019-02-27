/*===============================
  ■■■ 메소드 중복정의(Method Overloading) ■■■
================================*/ 

public class Test096
{
	public static void main(String[] args)
	{
		print();
		print(10);
		print('a');
		print(10,20);
		print(10, 3.14);
		print(3.14, 10);
		double result = print(3.14);
	}

	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}			 //--(X)
	public static void print(char c){}			 //--※ 자동 형변환 규칙 체크★
	public static void print(int i, int j){}
	public static void print(int i, double d){}	 //--※ 자동 형변환 규칙 체크★
	public static void print(double d, int i){}  //--※ 자동 형변환 규칙 체크★
	public static double print(double d){return 3.14;}
	//public static void print(double d){}

}