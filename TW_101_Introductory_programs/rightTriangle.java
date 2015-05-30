import java.util.Scanner;


public class rightTriangle {
	Scanner input = null;
	int numberOfStars;
	
	public rightTriangle() {
		input = new Scanner(System.in);
		System.out.print("Enter number of Stars: ");
		numberOfStars = input.nextInt();
		
		for (int i = 0; i < numberOfStars; i++) {
			for (int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		new rightTriangle();
	}

}
