
public class Ex08Test {

	public static void main(String[] args) {
		// ��ü ���� : class������ ���� ����� �� ������ ��ü�����̴�.
		
		int i = 10;
		Ex07 ex07 = new Ex07();
		ex07.age = 10;
		ex07.height = 177.1;
		ex07.name = "abbc";
		
		System.out.println(ex07.age);
		System.out.println(ex07.height);
		System.out.println(ex07.name);
				
		int age = 10;
		double height = 177;
		String name = "abbc";
		
		Ex07 ex071 = new Ex07();
		ex071.age = 15;
		ex071.height = 170.2;
		ex071.name = "kkkk";
		
		// new �����ڸ� ����ϴ� ��� �͵��� ��ü��� �Ѵ�.
		// new : heap ������ ���� �ִ� ��.
		// ���� heap ������ ������ ��ü��.
		String str = new String("abc");
		
		String str1 = new String("aaaa");
		String str2 = "aaaa";
		String str3 = "aaaa";
	}

}
