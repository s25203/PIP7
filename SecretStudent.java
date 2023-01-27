package pip7;

import java.util.Scanner;

public class SecretStudent {
    private String name = "default";
    private String surname = "name";
    private int number = 939393;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        if(name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("name has 0 length");
        }
    }

    public void readFromScanner() {
        Scanner in = new Scanner(System.in);
        System.out.println("input name:");
        String name = in.nextLine();
        System.out.println("input surname:");
        String surname = in.nextLine();
        System.out.println("input number");
        int number = in.nextInt();

        this.setName(name);
        this.surname = surname;
        this.number = number;
    }

    public void print(){
        System.out.println("student name, surname, number: " + this.name + ", " + this.surname + ", " + this.number);
    }
}
