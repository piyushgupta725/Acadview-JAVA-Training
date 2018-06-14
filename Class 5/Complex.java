class Complex{
int real;
int imag;
void getreal(int x){
real=x;
}
void getimag(int y){
imag=y;}
void print(){
	System.out.println(real+"+"+ imag + "j");
}
public static void main(String[] args){
Complex c = new Complex();
c.getreal(3);
c.getimag(5);
c.print();
}
}
