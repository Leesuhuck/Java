class Box1Sub {
	// �Ӽ� ���� �ܰ�
	// ����� �����ڴ� Ŭ������ �̸��� ���ƾ��Ѵ�.
	// ����� �����ڴ� ��ȯ�� ���� �ʴ´�.
	
	private int number1;
	int number2;
	int number3;
	private int num;
	
	// ������ ���� �ܰ�
	public Box1Sub(int horizontal, int Vertical, int Height) {
		number1 = horizontal;
		number2 = Vertical;
		number3 = Height;
	}
	// ��� ���� �ܰ�
	
	public void setNum(int n) {
		num = n;
	}
	
	int getValue() {
		return number1*number2*number3;
	}
}