/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.carrental.domain;

/**
 *
 * @author Dumisane MADONDO
 */
public class Employee {
    private String employeeID; 
    private String employeeName; 
    private String employeeSurname;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeSurname=" + employeeSurname + '}';
    }
    
    
}
