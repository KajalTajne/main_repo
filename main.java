import java.util.Scanner;

class Calculator
{
  public static void main(String[] args)
{
	Scanner sr=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
	double num1=sr.nextDouble();
	double num2=sr.nextDouble();
	System.out.println("Enter your command");
  	String operation=sr.next();
        boolean  exit=false;

while(!exit)
{
	switch(operation)
	{
	
		case "add":System.out.println(num1+num2);
			break;
	        case "sub":System.out.println(num1-num2);
		         break;
		case "mul":System.out.println(num1*num2);
		         break;
                case "div":System.out.println(num1/num2);
		         break;
      		case "quit":exit=false;
			 break;


	}
}

}
}
