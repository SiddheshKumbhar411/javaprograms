import java.util.Scanner;
class Vowels{
		public static void main(String[] args)
			{     Scanner sc=new Scanner(System.in);	
			       System.out.println("enter a alphabet:");
				char ch=sc.next().charAt(0);
				String s=(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='o'||ch=='O'||ch=='u'||ch=='U')?("ch is a vowel"):"ch is a consonant";
			System.out.println(s);
}}