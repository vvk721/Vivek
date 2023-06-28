package javaExamples;

public class Dt_Var {
int b=30;//instance Var
static int empid=101;//static Var
//non-static
public void m1() {
	//Dt var VV--To Represent Data
	int a=10;//local Var
	System.out.println("m1 executed");
	//      int String 
	System.out.println(a+"Local Var");//
	System.out.println(empid+"Static Var");
}
public void m2() {
	System.out.println("m2 executed");
	System.out.println(b+"instance Var");
}
public void m3() {
	System.out.println("m3 executed");
	System.out.println(b+"instance Var");
}
//static method
public static void st() {
	System.out.println("static method executed");
}
public static void main(String args[]) {
	System.out.println("main method executed");
	//Non_static methods:Access by using Object
	Dt_Var m=new Dt_Var();
	m.m1();
	m.m2();
	m.m3();
	//static methods: access by using class name,no need of to create object.
	Dt_Var.st();
}
}