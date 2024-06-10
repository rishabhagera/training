package exception;
import java.util.*;
public class exchhandle {


	    public static void main(String[] args) {
	        Scanner a1 = new Scanner(System.in);

	        try {
	            int a = 30;
	            int b = 0;
	            int c = a / b;
	        } catch (ArithmeticException e) {
	            System.out.println("Division by zero is not allowed: " + e.getMessage());
	        }

	        System.out.print("Enter data: ");
	        int input = a1.nextInt();

	        try {
	            if (input % 2 == 0) {
	                throw new Exception("Even number entered.");
	            } else {
	                System.out.println("You entered an odd number: " + input);
	            }
	        } catch (Exception e) {
	            System.out.println("Exception: " + e.getMessage());
	        } finally {
	            a1.close();
	        }
	    }
	}
