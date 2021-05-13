
public class Ex08Test {

	public static void main(String[] args) {
		// 객체 지향 : class파일을 만들어서 사용할 수 있으면 객체지향이다.
		
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
		
		// new 연산자를 사용하는 모든 것들을 객체라고 한다.
		// new : heap 영역에 값을 넣는 것.
		// 따라서 heap 영역의 모든것이 객체다.
		String str = new String("abc");
		
		String str1 = new String("aaaa");
		String str2 = "aaaa";
		String str3 = "aaaa";
	}

}
