package ����_01;

import java.util.Scanner;
public class ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(intArray.length + "���� ���� �Է�");
		for(int i = 0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		for(int i = 0; i<intArray.length; i++)
			sum+= intArray[i];
		System.out.print("�����" + (double)sum/intArray.length);
		sc.close();

	}

}
