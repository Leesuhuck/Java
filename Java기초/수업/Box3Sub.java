class Box3Sub {

	//속성
	protected int horizontal;
	protected int Vertical;
	protected double sosuhorizontal;
	protected double sosuVertical;
	protected int Area;
	protected double sosuArea;
	
	//생성자
	//생성자와 기능은 접근을 해야되기에 public 지정하다.
	public Box3Sub(int H, int V){
		
		horizontal 		= H;
		Vertical 		= V;

	}
	
	public Box3Sub(double H, double V) {
		
		sosuhorizontal 	= H;
		sosuVertical 	= V;
		
	}
	
	//기능
	
	public int getValue() {
		
		Area = horizontal*Vertical;
		
		return Area;
	}
	
	public double getValuetoDouble() {
		
		sosuArea = sosuhorizontal*sosuVertical;
		return sosuArea;
		
	}
	
	
}
