package ¹®Á¦_01;

public class test_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		int income = 0;
		
		if(((age >= 65) && (income == 10000))||
				((age >= 21)&&(income <= 25000))) {
			System.out.println("Approved");
		}else {
			System.out.println("Declined");
		}
	}

}
