public class FinalMethodsDemo {

    public static void main(String[] args) {
        FinalMethodsDemo obj = new FinalMethodsDemo();

        Class<?> cls = obj.getClass();
        System.out.println("getClass()        : " + cls);
        System.out.println("getName()         : " + cls.getName());
        System.out.println("getSimpleName()   : " + cls.getSimpleName());

        System.out.println("hashCode()        : " + obj.hashCode());

        System.out.println("toString()        : " + obj.toString());

        Object ref1 = new Object();
        Object ref2 = ref1;
        Object ref3 = new Object();

        System.out.println("\nref1 == ref2 (same ref): " + (ref1 == ref2));
        System.out.println("ref1 == ref3 (diff ref): " + (ref1 == ref3));

        System.out.println("\nNotify/Wait/NotifyAll are final methods");
        System.out.println("They are used in multithreading - cannot be overridden");

        Integer a = 5;
        Integer b = 5;
        System.out.println("\nInteger == (cache range -128 to 127): " + (a == b));
        System.out.println("Integer equals: " + a.equals(b));
    }
}
