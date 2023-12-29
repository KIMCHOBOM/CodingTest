import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//n값 입력 받기 (1 ≤ n ≤ 10,000)
		int n = scan.nextInt();
		
		scan.close();

		int sum = 0;	//계산값을 저장할 변수
		
		//1~n 까지의 합 구하기
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		//1~n 까지의 합 출력
		System.out.println(sum);
		
    }
}