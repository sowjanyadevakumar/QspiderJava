public class ObjectClassDemo {

    int id;
    String name;

    ObjectClassDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ObjectClassDemo obj1 = new ObjectClassDemo(1, "Alpha");
        ObjectClassDemo obj2 = new ObjectClassDemo(2, "Beta");

        System.out.println("Class of obj1  : " + obj1.getClass());
        System.out.println("Class of obj2  : " + obj2.getClass());

        System.out.println("HashCode obj1  : " + obj1.hashCode());
        System.out.println("HashCode obj2  : " + obj2.hashCode());

        System.out.println("toString obj1  : " + obj1.toString());
        System.out.println("toString obj2  : " + obj2.toString());

        System.out.println("equals (obj1==obj2): " + obj1.equals(obj2));
        System.out.println("equals (obj1==obj1): " + obj1.equals(obj1));
    }
}
