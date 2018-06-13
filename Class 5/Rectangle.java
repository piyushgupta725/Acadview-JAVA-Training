class Rectangle{
	int length;
	int breadth;
	  void getlength(int x){
		 length=x;
	  }
	void getbreadth(int y){
		 breadth=y;
	 }
	void  calculatearea(){
		int z=length*breadth;
		 System.out.println(+z);
	 }
	 public static void main(String[] args){
		 Rectangle obj = new Rectangle();
		 obj.getlength(5);
		 obj.getbreadth(7);
		 obj.calculatearea();
}
	  }