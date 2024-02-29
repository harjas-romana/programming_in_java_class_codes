import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class code_2 {
//    public static void main(String[] args)  {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter total subjects");
//        float A = sc.nextInt();
//        System.out.println("Enter marks of physics:");
//        float a= sc.nextFloat();
//        System.out.println("Enter marks of maths");
//        float b=sc.nextFloat();
//        System.out.println("Enter marks of bio");
//        float c=sc.nextFloat();
//        float per = (a+b+c)/3;
//        System.out.println(per);
//
//    }
//}
public class code_2 {
    public static void main(String[] args) {
        int pid;
        pid = fork();

        if (pid < 0) {
            System.err.println("Fork failed");
            System.exit(1);
        } else if (pid == 0) {
            System.out.println("This is the child process, with PID: " + getpid());
        } else {
            System.out.println("This is the parent process, with PID: " + getpid());
            System.out.println("Child process ID: " + pid);
        }
    }

    private static int fork() {
        // Simulating fork in Java
        return 0; // Return 0 for child process and non-negative value for parent process
    }

    private static int getpid() {
        // Simulating getpid in Java
        return 12345; // Return a unique process ID
    }
}

