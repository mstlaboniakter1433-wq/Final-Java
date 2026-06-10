class Adder{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
}
public class Moverload{
    public static void main(String[] args) {
        Adder a = new Adder();

        System.out.println(a.add(10, 20));
        System.out.println(a.add(10, 20, 30));
    }
}