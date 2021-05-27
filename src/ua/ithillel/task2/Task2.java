package ua.ithillel.task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        File users = new File("C:\\java-new-homework\\practical-work-serialize\\Users.txt");
        User john = new User("John", "Smith", 20);
        User mary = new User("Mary", "Brown", 30);
        User james = new User("James", "Black", 40);
        User nicole = new User("Nicole", "Cooper", 50);
        User david = new User("David", "White", 60);
        User[] usersToAdd = {john, mary, james, nicole, david};
        addUsers(users, usersToAdd);
        readUsers(users);
    }

    public static void addUsers(File users, User[] usersToAdd) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(users))) {
            System.out.println("Adding users to the file...");
            for (User user : usersToAdd) {
                output.writeObject(user);
            }
            System.out.println("Users added.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readUsers(File users) {
        try (ObjectInputStream input = new ObjectInputStream((new FileInputStream(users)))) {
            User user;
            boolean read = true;
            while(read){
                try {
                    user = (User) input.readObject();
                    System.out.println(user);
                    System.out.println("-----------------------------------------");
                } catch (EOFException e){
                    read = false;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}