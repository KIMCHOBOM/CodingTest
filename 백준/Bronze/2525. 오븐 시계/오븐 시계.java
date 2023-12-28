import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//현재 시각 입력 받기 (시: A (0 ≤ A ≤ 23), 분: B (0 ≤ B ≤ 59))
		int A = scan.nextInt();
		int B = scan.nextInt();
		//조리에 필요한시간 입력 (분 : C (0 ≤ C ≤ 1,000))
		int C = scan.nextInt();
		
		scan.close();
		
		//조리 완료 시간(분)
		int x;
		
		//현재시간 + 조리시간
		x = ((A*60) +B ) + C;
		A = x/60;
		B = x%60;
		
		//A가 23시 초과시 0시부터 시작
		if(A>23) {
			A -= 24;
		}
		
		//조리 완료 시간 출력(23시 59분에서 1분이 지나면 0시 0분) 
		System.out.println(A +" "+ B);
	}
}