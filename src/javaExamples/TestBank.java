package javaExamples;
abstract class Bank{
	abstract void credit();
	abstract void debit();
}
class Hdfc extends Bank{
	public void credit() {
		System.out.println("HDFC Credit");
	}
	public void debit() {
		System.out.println("HDFC Debit");
	}
}
class Icici extends Bank{
	public void credit() {
		System.out.println("Icici Credit");
}
	public void debit () {
		System.out.println("Icic Debit");
	}
	}

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hdfc hd = new Hdfc();
hd.debit();
hd.credit();
Icici ic = new Icici();
ic.debit();
ic.credit();
	}

}
