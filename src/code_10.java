class A{
    int a;
    int b;
    String name;
    A(int a, int b, String name){
        this.a = a;
        this.b = b;
        this.name = name;
    }
    void printA() {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("name = "+name);
    }
}
public class code_10 {
    public static void main(String[] args){
        A a1 = new A(2,4,"Harjas");
        a1.printA();
    }
}