import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 문장 입력받기
		String A = scan.nextLine();
		String B = "??!";

		//scanner 닫기
		scan.close();

		// 입력 받은 문장에 ??! 추가하기 == (A+"??!")
		String C = A.concat(B);

		//합친 문장 출력하기
		System.out.println(C);
	}
}
