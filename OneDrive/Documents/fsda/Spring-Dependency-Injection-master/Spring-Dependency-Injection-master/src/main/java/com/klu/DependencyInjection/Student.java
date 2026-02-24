package com.klu.DependencyInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Student {

// @Autowired // Field Injection
 private Laptop laptop;

 public Student() {}
 
// @Autowired  // Constructor Injection
// public Student(Laptop laptop) {
//  System.out.println("Inside the student constructor");
//  this.laptop = laptop;
// }
 
 @Autowired //setter injection
 public void setLaptop(Laptop laptop) {
  this.laptop = laptop;
 }

 public void build() {
  laptop.compile();
 }

}
