package ����_01;

public class ex_12 {
	int radius;
	String name;
	
	public ex_12() {
		radius = 1; name = "";
	}
	public ex_12(int r, String n) {
		radius =r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex_12 pizza = new ex_12(10,"�ڹ�����");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������" + area);
		
		ex_12 dount = new ex_12();
		dount.name="��������";
		area = dount.getArea();
		System.out.println(dount.name + "�� ������" + area);
	}

}
