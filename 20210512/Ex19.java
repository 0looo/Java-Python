
public class Ex19 {

	public static void main(String[] args) {
		if(args[0].contentEquals("/?")) {
			System.out.println("도움말");
		}else if(args[0].equals("+")) {
			System.out.println(Integer.parseInt(args[1]) 
					+Integer.parseInt(args[2]));
		}else if(args[0].equals("-")){
			System.out.println(Integer.parseInt(args[1]) 
					- Integer.parseInt(args[2]));
		}
	}

}
