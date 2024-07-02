package sync;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class deque {

	    public static void main(String[] args) {
	       
	        Deque<Integer> deque = new ArrayDeque<>();
	        Scanner scanner = new Scanner(System.in);
	        int i = 0;
	        
	        while (i < 5) {
	            System.out.println("Enter a number greater than 50:");
	            int number = scanner.nextInt();

	        
	            if (number > 50) {
	                deque.addFirst(number);
	                i++;
	            } else {
	                System.out.println("Number must be greater than 50. Please try again.");
	            }
	        }
	        System.out.println("Numbers in the Deque: " + deque);
	        
	        scanner.close();
	    }
	}

