package JavaExample;

import java.security.PublicKey;

public class Dt_Var {
int b=30; //intance Var
static int empid =101;//Static Var 
public void m1() {
	//DT Var VV__To Represent Data
	int a=10;//local Var
	System.out.println("m1 executed");
	//       int String
	System.out.println(a+"Local Var");//10
	System.out.println(empid+"Static Var");
}
public void m2() {
	System.out.println("m2 excuted");
	System.out.println(b+"instance Var");
}
public void m3() {
	System.out.println("m3 executed");
	System.out.println(b+"instance Var");
}
public static void main(String args[]) {
	System.out.println("main method executed");
	Dt_Var m=new Dt_Var();
	m.m1();
	m.m2();
	m.m3();
}
}
