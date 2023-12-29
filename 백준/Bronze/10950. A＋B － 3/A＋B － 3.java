import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//테스트 케이스 개수
		int T = scan.nextInt();
		
		//테스트 케이스 개수만큼 입력받기
		for (int i = 1; i <= T; i++) {
			// 숫자 입력받기 (0 < A, B < 10)
			int A = scan.nextInt();
			int B = scan.nextInt();
			
            //A+B 결과값 출력
			System.out.println(A+B);
			
		}
		
		scan.close();
		
    }
}