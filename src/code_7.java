class BookManagementSystem{
    String bookName;
    int issNumber;
    int volNumber;
    int yearOfPublication;
    //Default constructor
    BookManagementSystem(){
        bookName = "Computer Network";
        issNumber = 1;
        volNumber = 10;
        yearOfPublication = 2023;
    }
    //Parameterised constructor
    BookManagementSystem(String a, int b, int c, int d){
        bookName = a;
        issNumber = b;
        volNumber = c;
        yearOfPublication = d;
    }
    //Copy Constructor
    BookManagementSystem(BookManagementSystem b1){
        String bookName1 = b1.bookName;
        int issNumber1 = b1.issNumber;
        int volNumber1 = b1.volNumber;
        int yearOfPublication1 = b1.yearOfPublication;
    }
    public void printValues(){
        System.out.println("Book name: "+bookName);
        System.out.println("Iss Number: "+issNumber);
        System.out.println("Volume Numeber: "+volNumber);
        System.out.println("Year of Publication: "+yearOfPublication);
    }
}
public class code_7 {
    public static void main(String[] args){
        System.out.println("Default: ");
        BookManagementSystem b1 = new BookManagementSystem();
        b1.printValues();
        System.out.println("\n\n");
        System.out.println("Parameterised: ");
        String n = "OS";
        int a = 10;
        int b = 11;
        int c = 2024;
        BookManagementSystem b2 = new BookManagementSystem(n,a,b,c);
        b2.printValues();
        System.out.println("\n\n");
        System.out.println("Copy: ");
        BookManagementSystem b3 = new BookManagementSystem(b2);
        b3.printValues();
    }
}
