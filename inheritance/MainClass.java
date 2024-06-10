package inheritance;

public class MainClass {
public static void main(String args[]) {
		
		Rectangle rec = new Rectangle(6,1.1);
		System.out.println("\nFor Rectangle: ");
		rec.printArea();
		rec.printPerimeter();
		
		System.out.println("\nFor Square: ");
		Square sq = new Square(3.2);
		sq.printArea();
		sq.printPerimeter();
		
	}

}
