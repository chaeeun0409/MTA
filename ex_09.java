package ����_01;

public class ex_09 {

	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i = 0; i<temp.length; i++)
			temp[i] = i; // �迭�� ���Ҹ� 0,1,2,3���� �ʱ�ȭ
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		intArray = makeArray();  //�޼ҵ�� ���� �迭 ���� ����
		for(int i =0; i<intArray.length; i++)
			System.out.println(intArray[i]+""); //�迭 ��� ���� ���
	}

}
