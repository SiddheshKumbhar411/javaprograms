import java.util.Scanner;
class Vowel2 
{
	public static void main(String[] args) 
	{ Scanner sc=new Scanner(System.in);
	
		char ch=sc.next().toLowerCase().charAt(0);
		switch(ch){
					case 'a','e','i','o','u':System.out.println(ch+" is a vowel");break;
					default:System.out.println(ch+" is a consonant"); break;
		}
	}
}
