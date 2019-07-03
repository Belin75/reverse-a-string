public class ReverseString{
	static String str = "belinda";
	public static String reverseAString(String a){
		String rev = "";
		for(int i = (a.length() - 1); i >= 0; i--){
			rev = rev + a.charAt(i);
		}
		return rev;		
	}
	public static void main(String args[]){
		String result = reverseAString(str);
		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + result);
	}		
}
