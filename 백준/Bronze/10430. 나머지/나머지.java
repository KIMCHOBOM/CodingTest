import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//A, B, C 변수를 차례로 받는다(2 ≤ A, B, C ≤ 10000)
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		//scanner 닫기
		scan.close();
	
		//계산한 값 출력
		System.out.println( (A+B)%C );
		System.out.println( ((A%C) + (B%C)) %C );
		System.out.println( (A*B)%C );
		System.out.println( ((A%C)*(B%C)) %C );
	}
}
