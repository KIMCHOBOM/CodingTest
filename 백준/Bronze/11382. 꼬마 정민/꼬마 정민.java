import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//세 수를 입력 받음 (1 ≤ A, B, C ≤ 1012)
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		long C = scanner.nextLong();
		
		scanner.close();
		
		//계산한 값 출력
		System.out.println( A+B+C );
	}
}