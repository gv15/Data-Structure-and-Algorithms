package recursion;
//factorial using recursion
public class HomeWork3{
	static int factorial(int value) {
		int f=1;
		if(value==0||value==1) {
			return 1;
		}
		else
		{
			f*=value*factorial(value-1);
			return f;
		}
		
	}

	public static void main(String[] args) {
		int f=factorial(5);
		System.out.println(f);
		

	}

}
