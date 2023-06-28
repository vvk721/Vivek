package JavaExample; 
class AA{
	int a=10;
	int b=20;
	public void m1() {
		System.out.println("m1 executed");
	}
}

class BB extends AA{
	int x=30;
	int y=40;
	public void m2() {
		System.out.println("m2 executed");
		System.out.println(a+b);
	}
}
public class CC extends BB{
	public void m3() {
		System.out.println("m3 executed");
		System.out.println(x+y); //classBB
		System.out.println(a+b); //classAA
	}
public static void main(String args[]) {
	CC obj = new CC();
	obj.m1();
	obj.m2();
	obj.m3();
}
}
