class Student{
    String name;
    int ID;

    Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
    void show(){
        System.out.println("Student name is : "+name);
        System.out.println("Student ID is : "+ID);
    }
}
public class Thiskeyword {
    public static void main(String[] args) {
        Student s = new Student("Laboni", 69);
        s.show();
    }
}
