
public class Ex20 {

	public static void main(String[] args) {
		Ex19 ex1 = new Ex19();
		Ex19.idx += 1;
		ex1.num = Ex19.idx;
		ex1.age = 20;
		ex1.name = "±Ë∞°∞°";
		
		Ex19 ex2 = new Ex19();
		Ex19.idx += 1;
		ex2.num = Ex19.idx;
		ex2.name = "√÷πŸπŸ";
		ex2.age = 11;
		System.out.println(Ex19.idx);
		
		Ex19 ex3 = new Ex19();
		Ex19.idx += 1;
		ex3.num = Ex19.idx;
		ex3.age = 22;
		ex3.name = "¿±∂Ã∂Ã";
		System.out.println(Ex19.idx);
		
		Ex21 ex4 = new Ex21();
		Ex19.idx += 1;
		ex4.num = Ex19.idx;
		System.out.println(ex4.num);

	}

}
