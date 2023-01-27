package pip7;

public class Main {
    public static void main(String[] args) {
        //1
        Student s0 = new Student();
        Student s1 = new Student();

        s0.number = 666;
        s0.name = "Lord of Darkness";

        s0.printStudent();
        s1.printStudent();

        //2
        SecretStudent ss = new SecretStudent();

        System.out.println(ss.getName() + ", " + ss.getSurname() + ", " + ss.getNumber());

        //3
        ss.setName("");
        System.out.println(ss.getName());
        ss.setName("Chloe Sevigny");
        System.out.println(ss.getName());

        //4
        SecretStudent ss0 = new SecretStudent();
        SecretStudent ss1 = new SecretStudent();
        ss0.readFromScanner();
        ss1.readFromScanner();
        ss0.print();
        ss1.print();



    }
}
