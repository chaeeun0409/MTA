package ����_01;

public class ex_13 {

	String title;
	String author;
	void show() {System.out.println(title+" "+author); }
	
	public ex_13() {
		this("","");
		System.out.println("������ ȣ��");
	}
	public ex_13(String title) {
		this(title,"���ڹ̻�");
	}
	public ex_13(String title, String author) {
		this.title = title; this.author = author;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex_13 littlePrince = new ex_13("�����","�������丮");
		ex_13 lovestory = new ex_13("������");
		ex_13 emptyBook = new ex_13();
		lovestory.show();
	}

}
