class Box3Sub {

	//�Ӽ�
	protected int horizontal;
	protected int Vertical;
	protected double sosuhorizontal;
	protected double sosuVertical;
	protected int Area;
	protected double sosuArea;
	
	//������
	//�����ڿ� ����� ������ �ؾߵǱ⿡ public �����ϴ�.
	public Box3Sub(int H, int V){
		
		horizontal 		= H;
		Vertical 		= V;

	}
	
	public Box3Sub(double H, double V) {
		
		sosuhorizontal 	= H;
		sosuVertical 	= V;
		
	}
	
	//���
	
	public int getValue() {
		
		Area = horizontal*Vertical;
		
		return Area;
	}
	
	public double getValuetoDouble() {
		
		sosuArea = sosuhorizontal*sosuVertical;
		return sosuArea;
		
	}
	
	
}
