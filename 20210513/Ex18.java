
public class Ex18 {

	public static void main(String[] args) {
		Ex17 ex17 = new Ex17("무야호", 25, 188.2);
		System.out.println(ex17.getAge());
		System.out.println(ex17.getHeight());
		System.out.println(ex17.getName());

		// 2개만 넣는 별도의 생성자를 만들어서 실행
		Ex17 ex171 = new Ex17("유야호", 30);
		ex171.setHeight(188.2);
		System.out.println(ex17.getAge());
		System.out.println(ex17.getHeight());
		System.out.println(ex17.getName());
		
		Ex17 ex172 = new Ex17("뭉야야야");
		ex172.setAge(33);
		ex172.setHeight(155.7);
		System.out.println(ex17.getAge());
		System.out.println(ex17.getHeight());
		System.out.println(ex17.getName());
		
	}

}
