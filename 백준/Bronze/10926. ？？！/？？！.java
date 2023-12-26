import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String A = scanner.nextLine();
		String B = "??!";
		
		scanner.close();
		
		String C = A.concat(B);
		
		System.out.println(C);
	}
}