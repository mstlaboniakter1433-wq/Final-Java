class Car {   // Default
    public String brand = "BMW";
    public void display(){
        System.out.println("Brand : " + brand);
    }
}
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}