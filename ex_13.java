package 문제_01;

public class ex_13 {

	String title;
	String author;
	void show() {System.out.println(title+" "+author); }
	
	public ex_13() {
		this("","");
		System.out.println("생성자 호출");
	}
	public ex_13(String title) {
		this(title,"작자미상");
	}
	public ex_13(String title, String author) {
		this.title = title; this.author = author;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex_13 littlePrince = new ex_13("어린왕자","생택쥐페리");
		ex_13 lovestory = new ex_13("춘향전");
		ex_13 emptyBook = new ex_13();
		lovestory.show();
	}

}
