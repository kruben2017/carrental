/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.carrental.domain;

/**
 *
 * @author krubennaidoo
 */
public class Customer {
    
    private String name;
    private String username;
    private int age;
    private int custNum;

    public Customer() {
    }

    public Customer(String name, String username, int age, int custNum) {
        this.name = name;
        this.username = username;
        this.age = age;
        this.custNum = custNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCustNum() {
        return custNum;
    }

    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", username=" + username + ", age=" + age + ", custNum=" + custNum + '}';
    }
    
    
    
    
    
    
}
