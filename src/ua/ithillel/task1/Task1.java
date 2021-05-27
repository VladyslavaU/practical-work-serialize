package ua.ithillel.task1;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File employees = new File("C:\\java-new-homework\\practical-work-serialize\\Employees.txt");
        Employee john = new Employee("John Smith", "123 Main Street", 325859943, 818123123);
        addEmployee(employees, john);
        readEmployee(employees);

    }

    public static void addEmployee(File employees, Employee employee) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(employees))) {
            output.writeObject(employee);
            System.out.println("Adding employee");
            output.writeObject(employee);
            System.out.println("Employee " + employee.getName() + " added to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readEmployee(File employees) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(employees))) {
            Employee johnRestored = (Employee) input.readObject();
            System.out.println(johnRestored);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
