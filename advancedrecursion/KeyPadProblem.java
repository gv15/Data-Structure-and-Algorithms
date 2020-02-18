package advancedrecursion;
import java.util.ArrayList;
public class KeyPadProblem {
	static String keyPadStrings[] = {"", "", "abc", "def" ,"ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	static ArrayList<String> keyPadPermutation(String keynumbers){
		int temp;
		if(keynumbers.length() == 0) {
			ArrayList<String> emptyPermutation = new ArrayList<>();
			emptyPermutation.add("");
			return emptyPermutation;
		}
		else
			 temp = Integer.parseInt(String.valueOf(keynumbers.charAt(0)));
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> tempr = keyPadPermutation(keynumbers.substring(1));
		String curKeyPadString = keyPadStrings[temp];
		for(int i=0 ; i<curKeyPadString.length() ; i++) {
			 for(String string : tempr) {
				result.add(curKeyPadString.charAt(i)+string);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<String> result = keyPadPermutation("7896");
		System.out.println(result);

	}

}
