import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 주사위 3개의 눈값 입력
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		scan.close();

		// 최고값
		int max = 0;
		// 상금
		int prize = 0;

		// A와 B가 같을 경우 中
		if (A == B) {
			// A,B,C 모두 같은 경우 (A==B==C)
			if (B == C) {
				prize = 10000 + (A * 1000);
			}

			// A와 B만 같은 경우 (A==B=/=C)
			else {
				prize = 1000 + (A * 100);
			}
		}

		// A와 B가 다른 경우 中
		else {
			// A와 C가 같고 B만 다른 경우(A==C=/=B)
			if (A == C) {
				prize = 1000 + (A * 100);
			} else {
				// A와 B가 다르고 B와 C는 같은 경우 (A=/=B==C)
				if (B == C) {
					prize = 1000 + (B * 100);
				}
				// A와 B와 C 모두 다른 경우(A=/=B=/=C)
				else {
					// 세 수중 최고 값 구하기
					max = A;
					if (max <= B) {
						max = B;
						if (max <= C) {
							max = C;
						}
					} else {
						if (max <= C) {
							max = C;
						}
					}
					prize = max * 100;
				}
			}
		}
		
		//상금 출력
		System.out.println(prize);

	}
}