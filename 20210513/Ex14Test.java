
public class Ex14Test {
	public static void main(String[] args) {
		Ex13 ex13 = new Ex13(); // ��ü����
		ex13.setAge(35);        // �ʵ�(�ν��Ͻ�����)�� �� ����
		ex13.setHeight(177.5);  
		ex13.setName("JECK");
		
		System.out.println(ex13.getage());
		System.out.println(ex13.getHeight());
		System.out.println(ex13.getName());
		
		// �����ڴ� ��ü�� ������Ű�� ���� ����
		// �޼��带 ������� �ʰ� �ʵ忡 ���� �ʱ�ȭ
		// �ʵ忡 ���� �����ϱ� ���� �޼��带 ��ſ� �ʵ带 �ʱ�ȭ�ϱ� ���� ���
		Ex13 ex14 = new Ex13("Jeck",25,177.5);
		System.out.println(ex14.getage());
		System.out.println(ex14.getHeight());
		System.out.println(ex14.getName());
	}
}
