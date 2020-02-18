package recursion;
//Find the Last Occurrence of letter
public class HomeWork8 {
static int lastOccur(int list[],int data,int index) {
	int result;
	if(index==-1)//BASE_CONDITION
		return -1 ;
	else
	{
		if(list[index]==data)
			return index;
		else
			result=lastOccur(list, data, index-1);
	}
	return result;
}
public static void main(String args[]) {
	int a[]= {1,3,5,7};
	int pos=lastOccur(a,3,a.length-1);
	if(pos==-1)
		System.out.println("element not present");
	else
		System.out.println("found at "+(pos+1));
}
}
