import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        	
		//A와 B값 입력받기
		int A = scan.nextInt();
		int B = scan.nextInt();

		//scanner 닫기
		scan.close();

		//AxB값 출력
		System.out.println(A*B);
	}
}
