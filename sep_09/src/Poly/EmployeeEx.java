package Poly;

public class EmployeeEx {

	public static void main(String[] args) {

		Worker worker = new Worker();
		
		
		Employee e1 = new Employee();
		e1.setName("ȫ�浿");
		e1.setPosition("���");
		worker.work(e1);
		
		Ceo ceo= new Ceo();
		ceo.setName("�ں���");
		ceo.setPosition("������");
		worker.work(ceo);
		
		Manager manager = new Manager();
		manager.setName("���ϴ�");
		manager.setPosition("�Ŵ���");
		worker.work(manager);
		
		Parttime part = new Parttime();
		part.setName("������");
		part.setPosition("�Ƹ�����Ʈ");
		worker.work(part);

	}

}
