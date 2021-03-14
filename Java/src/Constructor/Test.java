package Constructor;

public class Test {
	
	public static void main(String[] args) {
		
	Teacher jak = new Teacher();
	Teacher jak1 = new Teacher(10);
	Teacher jak2=new Teacher(50,50);
	Teacher jak3= new Teacher("david",26);
	//System.out.println(jak3.name);
	//System.out.println(jak3.phone);
	Teacher jak4= new Teacher(10,4.5,1234567);
	Teacher jak5=new Teacher("bmw","A10",100);
	System.out.println(jak5.carname+" "+jak5.modelname+" "+jak5.carprice);
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
