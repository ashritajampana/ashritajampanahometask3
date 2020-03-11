package epam.calci;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    	double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        a = scanner.nextDouble();
        System.out.print("Enter second number:");
        b = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = a + b;
                break;

            case '-':
            	output = a - b;
                break;

            case '*':
            	output = a * b;
                break;

            case '/':
            	output = a / b;
                break;
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(a+" "+operator+" "+b+": "+output);
    }
}