package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.sun.javafx.beans.IDProperty;

@Entity
@Table(name="webapptable")
public class Employee {
	
@Id
@GenericGenerator( name="madhu",strategy="increment") 
@GeneratedValue(generator="madhu")
private int employeeId=0;

private String employeeName;
private double employeeSalary;
private int employeeAge;
public int getEmployeeAge() {
	return employeeAge;
}
public void setEmployeeAge(int employeeAge) {
	this.employeeAge = employeeAge;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
