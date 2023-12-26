import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//세자리인 두수를 입력 받음
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		scanner.close();
		
		//B의 일의 자리수
		int x = B%10;
		
		//B의 십의 자리수
		int y = (B/10) % 10;
		
		//B의 백의 자리수
		int z = B/100;
	
		//계산한 값 출력
		System.out.println( A*x );
		System.out.println( A*y );
		System.out.println( A*z );
		System.out.println( A*B );
	}
}