
public class Ex09 {
	// cmd���� java ����
	// .class ���Ϸ� �����ϹǷ� ���� ��ġ�� �̵�.
	// java ���ϸ�
	
	public static void main(String[] args) {
		if(args[0].equals("/?")) {
			System.out.println("�����Դϴ�.");
			// cmd����� �Է°�
			// java Ex09 /?
			
		}else if(args[0].equals("+")) {
			System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
			// cmd����� �Է°�
			// java Ex09 + in1 in2
		}else if(args[0].equals("-")) {
			System.out.println(Integer.parseInt(args[1]) - Integer.parseInt(args[2]));
		}
			// cmd����� �Է°�
			// java Ex09 - in1 in2
	}
}
