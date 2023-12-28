import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//A와 B값 입력받기(0 < A, B < 10)
		double A = scan.nextDouble();
		double B = scan.nextDouble();

		//scanner 닫기!
		scan.close();

		// A/B값 출력(출력값의 절대오차 또는 상대오차가 10^(-9) 이하여야 함!)
		System.out.println(A/B);
	}
}
