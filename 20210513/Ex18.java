
public class Ex18 {

	public static void main(String[] args) {
		Ex17 ex17 = new Ex17("����ȣ", 25, 188.2);
		System.out.println(ex17.getAge());
		System.out.println(ex17.getHeight());
		System.out.println(ex17.getName());

		// 2���� �ִ� ������ �����ڸ� ���� ����
		Ex17 ex171 = new Ex17("����ȣ", 30);
		ex171.setHeight(188.2);
		System.out.println(ex17.getAge());
		System.out.println(ex17.getHeight());
		System.out.println(ex17.getName());
		
		Ex17 ex172 = new Ex17("���߾߾�");
		ex172.setAge(33);
		ex172.setHeight(155.7);
		System.out.println(ex17.getAge());
		System.out.println(ex17.getHeight());
		System.out.println(ex17.getName());
		
	}

}
