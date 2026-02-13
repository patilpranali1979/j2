package q3;

public class Employe {
	private String name;
	private int id;
	
	private String department;
	
	
public Employe(String name) {
		super();
		this.name = name;
	}



public Employe(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}





	



public Employe(String name, int id,  String department) {
	super();
	this.name = name;
	this.id = id;
	
	this.department = department;
}



public void displayInfo() {
	// TODO Auto-generated method stub
System.out.println("name "+name);
if (id!=0) {
	System.out.println("id "+id);
}
if (department!=null) {
	System.out.println("department "+department);
}

}


public static void main(String[] args) {
	Employe employe=new Employe("pranali");
	employe.displayInfo();
	
	Employe employe2=new Employe("shreya", 1);
	employe2.displayInfo();
	
	
	
	
	Employe employe3=new Employe("tom", 3, "IT");
	employe3.displayInfo();
}

}
