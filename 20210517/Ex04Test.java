
public class Ex04Test {

	public static void main(String[] args) {
		Ex03 ex01 = new Ex03();
		ex01.age = 18;
		ex01.name = "�̻��";
		// static(class����)�� Ȱ��
		// ���������� ��Ģ������ ��ȭ�� ��� ����.
		// ex) num������ ���
		Ex03.idx = Ex03.idx + 1;
		ex01.num = Ex03.idx;
		System.out.println(ex01.num);
		
		Ex03 ex02 = new Ex03();
		ex02.name = "�����";
		ex02.age = 17;
		// numbering�� Ȱ���.
		Ex03.idx += 1;
		ex02.num = Ex03.idx;
		System.out.println(ex02.num);
		
		Ex03 ex03 = new Ex03();
		ex03.name = "�谡��";
		ex03.age = 10;
		// numbering�� Ȱ���.
		Ex03.idx += 1;
		ex03.num = Ex03.idx;
		System.out.println(ex03.num);

		

	}

}
