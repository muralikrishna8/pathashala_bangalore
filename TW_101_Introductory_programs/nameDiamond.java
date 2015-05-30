import java.util.Scanner;


public class nameDiamond {

	Scanner input = null;
	int numberOfStars;
	
	public nameDiamond() {
		input = new Scanner(System.in);
		System.out.print("Enter number of stars: ");
		numberOfStars = input.nextInt();
		
		for(int i=0; i<numberOfStars; i++){
			for(int j=0; j<numberOfStars-i; j++){
				System.out.print(" ");
			}
			
			for(int j=1; j<i*2; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Murali");
		for(int i=numberOfStars-1; i>0; i--){
			for(int j=0; j<numberOfStars-i; j++){
				System.out.print(" ");
			}
			
			for(int j=1; j<i*2; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		new nameDiamond();
	}

}
