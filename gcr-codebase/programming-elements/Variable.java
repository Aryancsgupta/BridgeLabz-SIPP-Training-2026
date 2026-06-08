public class Variable{
    static int x=1;
    int y;
    void m1(){
       
        System.out.println("m1");
        System.out.println(x);
    }
    void m2(){
        System.out.println("m2");
    }
    public static void main(String[] args) {
        int x = 10;
        int e = 1;
        Variable obj = new Variable();
        System.out.println(x);
        System.out.println(e);
        obj.m1();
        obj.m2();
        System.out.println(Variable.x);
    }
}