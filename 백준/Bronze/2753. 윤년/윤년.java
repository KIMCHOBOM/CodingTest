import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//년도를 입력 받는다!
		int year = scan.nextInt();

		//scanner 닫기!
		scan.close();
		
		// 윤년O >> 1
		if((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
			System.out.println(1);
		}
		
		// 윤년X >> 0
		else {
			System.out.println(0);
		}
	}
}
