class Test{
    int x = 10;
    {
        System.out.println("IIB: x = " + x);
        x = 20;
    }
    Test(){
        System.out.println("Constructor: x = " + x);
    }
    public static void main(String[] args){
        new Test();
    }
}