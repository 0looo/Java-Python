
public class Ex14Test {
	public static void main(String[] args) {
		Ex13 ex13 = new Ex13(); // 객체생성
		ex13.setAge(35);        // 필드(인스턴스변수)에 값 넣음
		ex13.setHeight(177.5);  
		ex13.setName("JECK");
		
		System.out.println(ex13.getage());
		System.out.println(ex13.getHeight());
		System.out.println(ex13.getName());
		
		// 생산자는 객체를 생성시키기 위해 실행
		// 메서드를 사용하지 않고 필드에 값을 초기화
		// 필드에 값을 저장하기 위해 메서드를 대신에 필드를 초기화하기 위해 사용
		Ex13 ex14 = new Ex13("Jeck",25,177.5);
		System.out.println(ex14.getage());
		System.out.println(ex14.getHeight());
		System.out.println(ex14.getName());
	}
}
