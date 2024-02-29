class Person{
    int id;
    String name;
    public void setParameters(int id1, String n1){
        id = id1;
        name = n1;
    }
    public void printParameters() {
        System.out.println("Id is: "+id+" and Name is: "+name);
    }
}
class School extends Person{
    String schoolName;
    int studentID;
    public void setSchool(String n2, int id2){
        schoolName = n2;
        studentID = id2;
    }
    public void printSchool() {
        printParameters();
        System.out.println("School name is: "+schoolName+" and roll number is: "+studentID);
    }
}
class College extends School{
    String collegeName;
    int collegeID;
    public void setCollege(String n3, int id3){
        collegeName = n3;
        collegeID = id3;
    }
    public void printCollege() {
        printSchool();
        System.out.println("College name is: "+collegeName+" and Reg. No. is: "+collegeID);
    }
}


public class code_8 {
    public static void main(String[] args) {
        College c1 = new College();
        c1.setParameters(19, "Harjas Partap Singh Romana");
        c1.setSchool("Dasmesh Public School", 123);
        c1.setCollege("VIT Bhopal University", 120);
        c1.printCollege();
    }
}