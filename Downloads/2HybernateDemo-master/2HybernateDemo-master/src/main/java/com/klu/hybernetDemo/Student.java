package com.klu.hybernetDemo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	//attributes 
	
	@Id
	private String registerNo;
	
	private String name;
	
	private String department;
	
	private int age;

	public Student() {
		super();
	}
	//constructor 
	public Student(String registerNo, String name, String department, int age) {
		super();
		this.registerNo = registerNo;
		this.name = name;
		this.department = department;
		this.age = age;
	}
	// getters and setters 
	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [registerNo=" + registerNo + ", name=" + name + ", department=" + department + ", age=" + age
				+ "]";
	}
		
	
}
