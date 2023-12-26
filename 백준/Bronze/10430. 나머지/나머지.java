import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//A, B, C 변수를 차례로 받는다(2 ≤ A, B, C ≤ 10000)
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		scanner.close();
	
		//계산한 값 출력
		System.out.println( (A+B)%C );
		System.out.println( ((A%C) + (B%C))%C );
		System.out.println( (A*B)%C );
		System.out.println( ((A%C)*(B%C))%C );
	}
}