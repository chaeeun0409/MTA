package ����_01;

public class Customer {
	private int id = 3; //public ���� �������� �ʾƵ���
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.id = 5; //id = 5 ==> customer.�� �߰��ؾ���
		customer.ShowId(); //�޼��� ȣ��
	}
	private void ShowId() { //public ���� �������� �ʾƵ���
		System.out.println(id);
	}

}
