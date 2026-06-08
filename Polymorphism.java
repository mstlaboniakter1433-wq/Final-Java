public class Polymorphism {    
    public int add(int a, int b) {    
        return a + b;    
    }    
    public double add(double a, double b) {    
        return a + b;    
    }    
    public static void main(String[] args) {    
        Polymorphism obj = new Polymorphism();    
        int sum1 = obj.add(55, 10);    
        System.out.println("Sum of 55 and 10 is: " + sum1);    
        double sum2 = obj.add(10.5, 40.9);    
        System.out.println("Sum of 10.5 and 40.9 is: " + sum2);    
    }    
}    