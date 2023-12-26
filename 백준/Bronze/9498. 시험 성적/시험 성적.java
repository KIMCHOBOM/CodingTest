import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//시험 성적을 받는다! ( 0 <= A, A <= 100)
		int A = scan.nextInt();
		char grad;
		
		scan.close();
		
		switch (A/10) {
		//90~100점 : A
		case 10:
		case 9:
			grad = 'A';
			break;
			
		//80~89점 : B
		case 8:
			grad = 'B';
			break;
			
		//70~79점 : C
		case 7:
			grad = 'C';
			break;
			
		//60~69점 : D
		case 6:
			grad = 'D';
			break;

		//0~59점 : F
		default:
			grad = 'F';
			break;
		}
		
		System.out.println(grad);
		
	}
}