package 문제_01;
import java.util.Scanner;
public class ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char grade;
		System.out.print("점수 입력(0~100)");
		int score = scan.nextInt();
		switch(score/10) {
		case 10:
		case 9:
			grade ='A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade ='C';
			break;
		case 6:
			grade ='D';
			break;
			default :
				grade = 'F';
		}
		System.out.println("학점은"+grade+"입니다");
		scan.close();
	}

}
