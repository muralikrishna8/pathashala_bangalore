import java.util.Scanner;


public class verticalStars {
	Scanner input = null;
	int numberOfStars;
	
	public verticalStars() {
		input = new Scanner(System.in);
		System.out.print("Enter number of Stars: ");
		numberOfStars = input.nextInt();
		
		for (int i = 0; i < numberOfStars; i++) {
			System.out.println("*");
		}
		
	}
	
	public static void main(String[] args) {
		new verticalStars();
	}

}
