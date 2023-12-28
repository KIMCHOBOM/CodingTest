import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//좌표를 입력 받는다!
		int x = scan.nextInt();	//(−1000 ≤ x ≤ 1000; x ≠ 0)
		int y = scan.nextInt();	//(−1000 ≤ y ≤ 1000; y ≠ 0)
		
		scan.close();
		
		//x좌표가 양수 일 때
		if( x>0 ) {
			//x좌표가 양수이며, y좌표가 양수 일 때
			if( y>0 ) {
				System.out.println(1);
			}
			//x좌표가 양수이며, y좌표가 음수 일 때
			else {
				System.out.println(4);
			}
		}
		
		//x좌표가 음수 일 때
		else {
			//x좌표가 음수이며, y좌표가 양수 일 때
			if ( y>0 ) {
				System.out.println(2);
			}
			//x좌표가 음수이며, y좌표가 음수 일 때
			else {
				System.out.println(3);
			}
		}
		
	}
}
