package advancedrecursion;
import java.util.ArrayList;

public class Permutation {
 static ArrayList<String> permutation(String string){
	 if(string.length() == 0) {
		 ArrayList<String> emptyList = new ArrayList<>();
		 emptyList.add("");
		 return emptyList;
		 
	 }
	 else
	 {
		 char holdChar = string.charAt(0);
		 ArrayList<String> result = new ArrayList<>();
		 ArrayList<String> temp = new ArrayList<>();
		 temp = permutation(string.substring(1));
		 for(String str : temp)
			 for(int i=0; i<=str.length(); i++) {
				 StringBuffer strng = new StringBuffer(str);
				 strng.insert(i, holdChar);
				 result.add(strng.toString());
			 }
		 return result;
	 }
 }
 public static void main(String args[]) {
	 String string = "abc";
	 ArrayList<String> catchPermutation = permutation(string);
	 System.out.println(catchPermutation);
 }
}
