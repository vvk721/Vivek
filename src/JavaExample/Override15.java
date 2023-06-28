package JavaExample;
 class Override1A{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}
public class Override15 extends Override1A{
	public void add(int a, int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Override15 obj = new Override15();
obj.add(10,20);
	}

}
