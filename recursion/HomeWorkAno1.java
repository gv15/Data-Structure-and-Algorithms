package recursion;
//count the number of ocurrence of a number in the array
public class HomeWorkAno1 {
	static int retCount(int list[], int data, int index, int count) {
		if(index==list.length) {
			return count;
		} 
		else {
			if(list[index]==data)
				count=retCount(list, data, index+1, count+1);
			else
				count=retCount(list, data, index+1, count);
		}
		return count;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,1,5,1,6,1};
		int count=retCount(a,1,0,0);
		System.out.println(count);
	}

}
