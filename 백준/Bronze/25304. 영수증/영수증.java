import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//영수증에 적힌 총 금액 (1 ≤ X ≤ 1,000,000,000)
		int X = scan.nextInt();
		
		//영수증에 적힌 구매한 물건의 종류의 수 (1 ≤ N ≤ 100)
		int N = scan.nextInt();
	
		int sum = 0;	//계산값을 저장할 변수
		
		//물건 종류의 수에 맞춰 a,b값 입력 받기
		for (int i = 1; i <= N; i++) {
			//물건의 가격 a, 물건의 개수 b (1 ≤ a ≤ 1,000,000), (1 ≤ b ≤ 10) 
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			sum = sum + (a * b);
		}
		scan.close();

		//영수증에 적힌 총합과 계산한 총합이 같은지 비교 ( 일치하면 Yes, 일치하지 않으면 No )
		if( X == sum ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
    }
}