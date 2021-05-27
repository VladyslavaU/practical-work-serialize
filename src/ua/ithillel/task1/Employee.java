package ua.ithillel.task1;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String address;
    private transient int SSN;
    private int number;

    public Employee(String name, String address, int SSN, int number) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getSSN() {
        return this.SSN;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\n" +
                "address: " + this.address + "\n" +
                "SSN: " + this.SSN + "\n" +
                "number: " + this.number;
    }


}
