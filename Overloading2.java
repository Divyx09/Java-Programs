

public class Overloading2{
    public void m1(String s){
        System.out.println("String version");
    }
    public void m1(Object o){
        System.out.println("Object version");
    }
    public static void main(String[] args) {
        Overloading2 ol = new Overloading2();
        ol.m1(new Object());
        ol.m1("deep");
        ol.m1(null);
    }
}
