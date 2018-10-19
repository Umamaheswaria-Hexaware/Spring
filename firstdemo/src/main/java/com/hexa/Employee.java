package com.hexa;

public class Employee {
	private int id =101;
	private String name ="Uma";
	private String desig = "Training Manager";

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Employee(int id, String name, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
	}

	public Employee() {

	}
	public String display() {
		return "Employee Id : "+id+"  Employee Name"+"  name"+"  Designation :"+desig;
	}

}
