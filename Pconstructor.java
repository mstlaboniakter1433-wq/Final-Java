class Car {
    String brand;
    Car(String brand){
        this.brand = brand;
    }
    void show(){
        System.out.println("Brand : "+brand);
    }
}
public class Pconstructor {
    public static void main(String[] args) {
        Car c = new Car("Toyota");
        c.show();
    }
}
