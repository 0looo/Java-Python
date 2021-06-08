
public class Ex15 {
	public static void main(String [] args) {
		String location = "서울";
		if(location.equals("서울")) {
			System.out.println("버스요금은 1400원");
		}else if(location.equals("경기")) {
			System.out.println("버스요금은 1450원");
		}else if(location.equals("인천")) {
			System.out.println("버스요금은 1430원");
		}
		
		System.out.println("switch");
		switch(location) {
		case "서울":	System.out.println("버스요금은 1400원"); break;
		case "경기":	System.out.println("버스요금은 1450원"); break;
		case "인천":	System.out.println("버스요금은 1430원"); break;
		}
	}
}
