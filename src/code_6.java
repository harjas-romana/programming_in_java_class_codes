import java.io.IOException;
import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    String registerNumber;
    int math;
    int physics;
    int chemistry;
    int java;
    String email;
    String phoneNumber;
    String gender;
    public Student() {
        name = "𝙃𝙖𝙧𝙟𝙖𝙨 𝙋𝙖𝙧𝙩𝙖𝙥 𝙎𝙞𝙣𝙜𝙝 𝙍𝙤𝙢𝙖𝙣𝙖";
        registerNumber = "22𝘉𝘚𝘈10120";
        math = 70;
        physics = 70;
        chemistry = 85;
        java = 100;
        email = "harjas42@icloud.com";
        phoneNumber = "+91 7087760769";
        gender = "Male";
    }

    public void setParameters() throws InterruptedException {
        System.out.print("Hello there! Please enter your name: ");
        name = sc.next();
        Thread.sleep(1000);
        System.out.print("Now, enter your registration number: ");
        registerNumber = sc.next();
        Thread.sleep(1000);
        System.out.println("Welcome! " + name);
        Thread.sleep(1000);
        System.out.print("Enter Mathematics marks: ");
        math = sc.nextInt();
        Thread.sleep(1000);
        System.out.println("Now, enter Physics marks: ");
        physics = sc.nextInt();
        Thread.sleep(1000);
        System.out.println("Good, now enter chemistry marks: ");
        chemistry = sc.nextInt();
        Thread.sleep(1000);
        System.out.println("Enter your Java marks here: ");
        java = sc.nextInt();
        Thread.sleep(1000);
        System.out.println("Enter your email address: ");
        email = sc.next();
        Thread.sleep(1000);
        System.out.println("Enter your phone number: ");
        phoneNumber = sc.next();
        Thread.sleep(1000);
        System.out.println("Enter your gender: ");
        gender = sc.next();
        Thread.sleep(1000);
    }

    public float resultPrint() {
        int total = math + physics + chemistry + java;
        return (float) total / 4;
    }
    public boolean passFailChecker(int math, int physics, int chemistry, int java){
        int total = math+physics+chemistry+java;
        if(total < 160){
            return false;
        }
        return true;
    }
    public String displayDetails() throws InterruptedException {
        System.out.println("Student's name: "+name);
        System.out.println("Registration number: "+registerNumber);
        System.out.println("Phone number: "+phoneNumber);
        System.out.println("Email: "+email);
        System.out.println("Gender: "+gender);
        Thread.sleep(1300);
        System.out.println("Pass: "+ (passFailChecker(math, physics, chemistry, java) ? "YES" : "NO"));
        return null;
    }
}

public class code_6 {
    public static void main(String[] args) throws InterruptedException {
        Student s1 = new Student();
        s1.setParameters();
        System.out.println("Percentage: " + s1.resultPrint()+" %");
        System.out.println(s1.displayDetails());
    }
}
