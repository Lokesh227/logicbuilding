package Excersice;

public class stringPalindrome {

	public static void main(String[] args) {
		String str= "malayalam";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--){
			rev= rev+str.charAt(i);
		}
		
		if(str.equals(rev)){
			System.out.println("It are palindrome");
		}
		else{
			System.out.println("It are not palindrome");
		}

	}

}
