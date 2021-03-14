package Constructor;

import java.awt.geom.Arc2D.Double;

public class Teacher {
	String name;
	int phone;
	String carname;
	String modelname;
	int carprice;
	
	
	
	
	public Teacher() {
		
		System.out.println("print  nothing ");
	}
	
	public Teacher(int a) {
		System.out.println(a);
		
	}
	
	public Teacher(int b, int c) {
		
		System.out.println(b+c);
		//System.out.println(c);
	}
	public Teacher(String name, int phone) {
		this.name=name;
		this.phone=phone;
		System.out.println(name);
		System.out.println(phone);
		
	}
	public Teacher(int a, double b,long c ) {
		
		System.out.println(a+c*b);
		
		
	}
	 public Teacher(String carname, String carmodelname,int carprice ){
		 this.carname=carname;
		 this.modelname=carmodelname;
		 this.carprice=carprice;
		 
		
	}
	
	
	
	
	
	
	
}
