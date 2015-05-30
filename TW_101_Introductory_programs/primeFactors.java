import java.util.Scanner;


public class primeFactors {
	Scanner input = null;
	
	public primeFactors() {
		input = new Scanner(System.in);
		System.out.println("Enter a number to find Prime Factors: ");
		int number = input.nextInt();
		
		generate(number);
	}
	
	private void generate(int number) {
		while(number%2 == 0){
			System.out.print("2 ");
			number /= 2;
		}
		for(int i = 3; i< number; i+=2){
			while(number % i == 0){
				System.out.print(i+" ");
				number /=i;
			}
		}
		if(number>2){
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		new primeFactors();
	}
}
