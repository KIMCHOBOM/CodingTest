import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//A와 B는 공백 한 칸으로 구분해서 받는다! (-10,000 ≤ A, B ≤ 10,000)
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		scan.close();
		
		//A가 B보다 큰 경우에는 '>'를 출력
		if(A>B) {
			System.out.println(">");
		}
		//A가 B보다 작은 경우에는 '<'를 출력
		else if(A<B) {
			System.out.println("<");
		}
		//A와 B가 같은 경우에는 '=='를 출력
		else {
			System.out.println("==");
		}
		
	}
}