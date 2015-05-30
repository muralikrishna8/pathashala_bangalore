import java.util.Scanner;


public class horizontalStars {
	Scanner input = null;
	int numberOfStars;
	
	public horizontalStars() {
		input = new Scanner(System.in);
		System.out.print("Enter number of Stars: ");
		numberOfStars = input.nextInt();
		
		for (int i = 0; i < numberOfStars; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new horizontalStars();
	}

}
