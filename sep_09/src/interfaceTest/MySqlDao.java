package interfaceTest;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MtSql DB���� �˻�");

	}

	@Override
	public void insert() {
		System.out.println("MtSql DB���� ����");

	}

	@Override
	public void update() {
		System.out.println("MtSql DB���� ����");

	}

	@Override
	public void delete() {
		System.out.println("MtSql DB���� ����");

	}

}
