package com.klu.hybernetDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//EXP-2 Hibernate CRUD Demo
public class App 
{
	public static void main(String[] args)
    {
        System.out.println("Hello World!");

        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        
        SessionFactory factory = cfg.buildSessionFactory();

        
        Session session = factory.openSession();

   
        session.beginTransaction();

       
        Student student1=new Student("2400031209","SAIF","CSE",19);
        Student student2=new Student("2400031191","BHUVAN","CSE",19);
        Student student3=new Student("2400032097","DHANUSH","CSE",19);
        

        
        session.persist(student1);
        session.persist(student2);
        session.persist(student3);
	        
	        
	        // fetching the record
	        Student fetchedRecord = session.find(Student.class, "2400031191");
//	        System.out.println("Register No :"+fetchedRecord.getRegisterNo());
//	        System.out.println("Name :"+fetchedRecord.getName());
	        
//	        System.out.println("Before update :\n"+fetchedRecord);
//	        
//	        fetchedRecord.setDepartment("AI&DS");
//	        fetchedRecord.setAge(23);
//	        
//	        System.out.println("After update :\n"+fetchedRecord);
//	        update the record
//	        session.merge(fetchedRecord);
	        
	        // delete the record
	        session.remove(fetchedRecord);
	        
	        
	        System.out.println("Record deleted successfully"+fetchedRecord.getRegisterNo());
	        
	        
	        
	        session.getTransaction().commit();
	        
	        
//	        session.close();
	        
//	        session = factory.openSession();
//	        Student s = session.find(Student.class, "2400031209");
//	        System.out.println("Register No: "+s.getRegisterNo());
//	        System.out.println("Name: "+s.getName());
//	        System.out.println("Department: "+s.getDepartment());
//	        System.out.println("Age: "+s.getAge());
//	        
//	        session.close();
	        
	        
	    }
	}