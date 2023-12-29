import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//N값 입력 받기 ( 4 <= N <=100 ; N은 4의 배수)
		int N = scan.nextInt();
		
		scan.close();
		
		//4바이트 마다 long 추가하여 출력
		for (int i = 1; i <= N/4 ; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		
    }
}