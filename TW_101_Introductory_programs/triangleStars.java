import java.util.Scanner;


public class triangleStars {

	public static void printTriangleStars(int number){
		for(int i=0; i<=number; i++){
			for(int j=0; j<number-i; j++){
				System.out.print(" ");
			}
			
			for(int j=1; j<i*2; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int numberOfStars = input.nextInt();
		
		printTriangleStars(numberOfStars);
	}
}
