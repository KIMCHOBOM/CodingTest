import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 주사위 3개의 눈값 입력
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		scan.close();

		//A와 B와 C가 모두 같은 경우
		if(A == B && B == C) {
			System.out.print(10000 + A*1000);
		}
		
		//A와 B가 같거나 A와 C가 같은 경우
	        else if(A == B || A == C) {
	        	System.out.print(1000 + A*100);
	        }
		
		//B와 C가 같은 경우
	        else if(B == C) {
	        	System.out.print(1000 + B*100);
	        }
		
		//A와 B와 C가 모두 다른 경우
	        else {
	        	System.out.print((Math.max(Math.max(A, B), C)*100));	//Math.max함수로 최댓값 찾기
	        }
    }
}
