import java.util.*;
public class Employee {
    protected String name;
    protected double salary;
    protected Date birthdate;

    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return this.name;}
    /*public String toString(){
        return "Name of the Employee:" + this.name + ", "
                + "Salary of the Employee:" + this.salary + "," + "Birthdate:"
                + this.birthdate;
    }*/
   
    public String toString(){
        return "Name of the Employee:" + this.getName();

    }
}