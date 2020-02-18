package array;
//Leader Element in array
public class HomeWork4 {
	static void leaderElement1(int array[]) {
		int flag=0;
		for(int i=0; i<array.length; i++) {//O(n^2)
			flag=0;
			for(int j=i+1; j<array.length ; j++)
				if(array[i]<array[j])
					flag=1;
			if(flag==0)
				System.out.println(array[i]);	
		}
		
	}
	static void leaderElement2(int array[]) {
		int leaderElement=array[array.length-1];
		System.out.println(leaderElement);
		for(int i=array.length-2; i>=0 ; i--) {
			
			if(array[i]>leaderElement) {
				leaderElement=array[i];
				System.out.println(leaderElement);
			}
		}
	}

	public static void main(String[] args) {
		 int arr[] = {16, 17, 4, 3, 5, 2};
		 leaderElement1(arr);
		 System.out.println("2nd method call");
		 leaderElement2(arr);

	}

}
