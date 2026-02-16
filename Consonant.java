import java.util.Scanner;
class Consonant	
	{ public static void main(String[] args)
		{     Scanner sc=new Scanner(System.in);
			System.out.println("exe starts");
			System.out.println("enter a char:");
			char ch=sc.next().charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I')
				{     System.out.println("it is vowel");
				}
			else{
				System.out.println("it is consonant");
			    }
			System.out.println("exe ends");
		}	
	}
			 
