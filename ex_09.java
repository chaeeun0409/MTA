package 문제_01;

public class ex_09 {

	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i = 0; i<temp.length; i++)
			temp[i] = i; // 배열의 원소를 0,1,2,3으로 초기화
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		intArray = makeArray();  //메소드로 부터 배열 전달 받음
		for(int i =0; i<intArray.length; i++)
			System.out.println(intArray[i]+""); //배열 모든 원소 출력
	}

}
