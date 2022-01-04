package 문제_01;

import java.util.Scanner;
public class test_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBirthdate();
	}
	private static String getBirthdate() {
		System.out.println("생일 입력");
		Scanner sc = new Scanner(System.in);
		String birthdate = sc.next();
		sc.close();
		return birthdate;
	}

}
