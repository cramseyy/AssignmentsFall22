import java.util.Scanner;

public class lab11 {
	public static void main(String[] args)	{
	
	Scanner input1 = new Scanner(System.in);
	int n = input1.nextInt();
	
	int[] numbers;
	
	for(int i=0;i<numbers.length;i++) {
		numbers[i]= input1.nextInt();  
	}
	int total=0;
	
	for(int i=0;i<numbers.length;i++) {
		total=total+Integer.parseInt(numbers[i]);
	}
	
	System.out.println("You entered " +(args.length)+ " numbers");
	System.out.println("The sum of these numbers is "+total);
	
	}
}

