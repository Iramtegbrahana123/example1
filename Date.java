package programm2;
class Student {
    String name;
    int age;
    String DOB;

    Student(String name, int age, String DOB){
        this.name=name;
        this.age=age;
        this.DOB=DOB;
    }
    void display(){
        System.out.println("Student Name:"+name+" Student age:"+age+" Student DOB:"+DOB);
    }
}
public class Date {
    public static void main(String[] args) {
        Student s1= new Student("iram",20,"08-05-2005");
        s1.display();
    }
}

