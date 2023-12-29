import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 숫자 입력받기 ( N >= 1 && N <= 9 )
		int N = scan.nextInt();

		scan.close();

		//구구단 출력!
		for (int i = 1; i <= 9; i++) {
			System.out.println( N + " * " + i + " = " + N*i);
		}
    }
}