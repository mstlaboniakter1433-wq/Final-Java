public class Student {
    public String name = "Laboni";
    public void display(){
        System.out.println("Name : "+name);
    }
    public static void main(String[] args) {
       Student s = new Student();
       s.display();
    }
    
}
