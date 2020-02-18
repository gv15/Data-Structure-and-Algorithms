package array;
//occurence of array
public class HomeWork7 {
	static int max(int a[]) {
		int max=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	static int oneOccurrence(int a[]) {
		int result=-1;
		int[] hash=new int[max(a)+1];
		for(int i=0; i<a.length; i++)
			hash[a[i]]=1+hash[a[i]];
		for(int i=0; i<hash.length; i++)
			if(hash[i]==1) {
				result=i;
				break;
			}
		return result;
	}

	public static void main(String[] args) {
		int a[]= {5,5,6,6,1,7,7};
		int result=oneOccurrence(a);
		System.out.println(result);

	}

}
