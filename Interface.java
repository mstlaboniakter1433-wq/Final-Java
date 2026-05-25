interface Bike {
    void print();
}
class Honda implements Bike{
    public void print(){
        System.out.println("Bike is running");
    }
}
public class Interface {
    public static void main(String[] args) {
        Bike b = new Honda();
        b.print();
    }
    
}
