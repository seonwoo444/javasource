package dfdf;
//���� �߻�ȭ => ����ʵ常 ����, �߻�޼��常 ��� ����
//jdk8�� �Ǹ鼭 default, static ���� �� �ִ�


public interface Shop {
	public void setTitle(String name); // public abstract �κ��� ������ ��
	public void genUser();
	public void genProduct();
	public void start();
}
