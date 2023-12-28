import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//시간 입력 받기 (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
		//입력 시간은 24시간 표현을 사용 (24시간 표현에서 하루의 시작은 0:0, 끝은 23:59)
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		scan.close();
		
		//입력 받은 H시 M분에서 45분 앞선 시간 계산
		//M이 45보다 작을 경우 (H에서 한 시간 감소시켜주고 M에 +60 해서 계산)
		if( M < 45) {
			H--;
			M = M +60 -45;
			
			//H가 음수이면 24에서 한 시간 감소시켜 계산
			if( H < 0 ) {
				H = 23;
			}
		}
		
		//M이 45보다 클 경우(45분 감소시켜 계산)
		else {
			M -= 45;
		}
		//입력받은 시간에서 45분 전 시간 출력 
		System.out.println(H +" "+ M);
	}
}