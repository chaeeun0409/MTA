package ����_01;

public class ex_07 {
	
	enum Week {��,ȭ,��,��,��,��,��}
	
		
	public static void main(String[] args) {
		int [] num = {1,2,3,4,5};
		int sum = 0;
		for(int k : num)//�ݺ��ɶ����� k�� num[0],num[1]...������ ����
			sum+= k;
		System.out.println("����" + sum);
		
		String names[] = {"���","��","�ٳ���","ü��","����","����"};
		for(String s : names) 
			System.out.println(s+"");
		for(Week day : Week.values()) {
			System.out.println(day+"����");
		}
		
	}
	
 }

