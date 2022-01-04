package 문제_01;

public class ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sum = 0.0;
		for(int i = 0; i<args.length; i++) {
			sum += Double.parseDouble(args[i]); //문자열을 실수로 변환하여 합산
		System.out.println("함께" +args[i]);
		}
	}

}
