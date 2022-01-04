package 문제_01;

public class ex_07 {
	
	enum Week {월,화,수,목,금,토,일}
	
		
	public static void main(String[] args) {
		int [] num = {1,2,3,4,5};
		int sum = 0;
		for(int k : num)//반복될때마다 k는 num[0],num[1]...값으로 설정
			sum+= k;
		System.out.println("합은" + sum);
		
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		for(String s : names) 
			System.out.println(s+"");
		for(Week day : Week.values()) {
			System.out.println(day+"요일");
		}
		
	}
	
 }

