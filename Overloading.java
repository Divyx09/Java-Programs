public class Overloading {
    public void m1(int i)
    {
        System.out.println("int-arg");
    }
    public void m1(float i)
    {
        System.out.println("float-arg");
    }

    public static void main(String[] args) {
        Overloading ol = new Overloading();
        ol.m1(10);
        ol.m1(10.2f);
        ol.m1('a');
        ol.m1(10l);
//        ol.m1(10.2);
    }
}
