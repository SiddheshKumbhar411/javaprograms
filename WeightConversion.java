import java.util.Scanner;
class WeightConversion{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter weight in pounds");
		double pound=sc.nextDouble();
		double kg=pound*0.454;
		System.out.println("the weight in kg :"+kg);
}}