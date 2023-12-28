import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//불기연도 y입력 받기. (1000 ≤ y ≤ 3000)
		int y = scan.nextInt();
		
		scan.close();

		//불기연도를 서기연도로 변환한 결과를 출력
		System.out.println(y-543);
	}
}
