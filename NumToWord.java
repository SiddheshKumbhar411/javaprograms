import java.util.Scanner;
class NumToWord 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter a no: ");
		int no=sc.nextInt();
		String word="";
		for(int i=no; i!=0;i/=10){
			int id =i%10;
			switch(id){
				case 0:word="zero "+word;break;
				case 1:word="one "+word;break;
				case 2:word="two "+word;break;
				case 3:word="three "+word;break;
				case 4:word="four "+word;break;
				case 5:word="five  "+word;break;
				case 6:word="six "+word;break;
				case 7:word="seven "+word;break;
				case 8:word="eight "+word;break;
				case 9:word="nine "+word;break;
			}
		}
		
		
		System.out.println(word);
	}
}
