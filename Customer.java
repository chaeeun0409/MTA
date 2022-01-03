package 문제_01;

public class Customer {
	private int id = 3; //public 으로 수정하지 않아도됨
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.id = 5; //id = 5 ==> customer.을 추가해야함
		customer.ShowId(); //메서드 호출
	}
	private void ShowId() { //public 으로 수정하지 않아도됨
		System.out.println(id);
	}

}
