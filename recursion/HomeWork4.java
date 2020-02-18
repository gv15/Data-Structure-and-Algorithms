package recursion;
// power using recursion
public class HomeWork4 {
	static int power(int a,int b) {
		int power;
		if(a==0)
			return 0;
		if(b==0)
			return 1;
		power=a*power(a,b-1);
		return power;
	}

	public static void main(String[] args) {
		System.out.println(power(2,3));
		

	}

}
