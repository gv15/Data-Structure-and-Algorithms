package recursion;

public class HomeWork15 {
	
	static int countNoofZeroes1(int number) {
		int result;
		if(number==0)
			return 0;
		else
		{
			if(number%10==0)
				//int result=1+countNoofZeroes1(number/10);
			result=1+countNoofZeroes1(number/10);
			else
				result=countNoofZeroes1(number/10);
		}
		return result;
	}
	static int countNoofZeroes2(int number, int count) {
		int result;
		if(number==0)
			return count;
		else
		{
			if(number%10==0)
				 result=countNoofZeroes2(number/10, count+1);
			else
				result=countNoofZeroes2(number/10, count);
		}
		return result;
	}

	public static void main(String[] args) {
		int count=countNoofZeroes1(1000006);
		System.out.println(count);
		count = countNoofZeroes2(100060, 0);
		System.out.println(count);

	}

}
