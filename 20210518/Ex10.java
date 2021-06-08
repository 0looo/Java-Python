
public class Ex10 {
	String color;
	String gearType;
	int door;
	public Ex10() {}	// default 생성자 :  매개변수가 없는 생성자
	public Ex10(String color) {
		this(color,"자동",4);  // 3개 변수를 받는 생성자를 사용하게 됨.
		/*this.color = color;
		this.door = 4;
		this.gearType = "자동";*/
	}
	public Ex10(String color, String gearType) {
		this(color, gearType, 4);
		/*this.color = color;
		this.gearType = gearType;
		this.door = 4;*/
	}
	public Ex10(String color, String gearType, int door) {
		this.color = color;
		this.door = door;
		this.gearType = gearType;
	}
	
}
