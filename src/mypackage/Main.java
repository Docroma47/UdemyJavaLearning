package mypackage;

public class Main {
    public static void main(String[] args) {
        //Lesson 1
        System.out.print("Hello World! ");
        System.out.println("I'ts my first Programme! ");
        System.out.println("Good bye!");

        //Lesson 2
        byte a = 5; // -128 127
        short b = -100; // -32768 32767
        int c;
        c = 10000;
        long d = -122335544;

        System.out.println(a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        double double1 = 133.155;
        System.out.println();
        System.out.println("double double1: " + double1);
        float float1 = 150.32f;
        System.out.println(float1);

        boolean boolean1 = true;
        boolean boolean2 = false;

        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;

        System.out.println();
        System.out.println(boolean3);
        System.out.println(boolean4);

        System.out.println();
        String str = "Hello ";
        System.out.println(str);
        String str2 = "World!";
        String str3 = str + str2;
        System.out.println(str3);

        System.out.println();
        char char1 = 'q';
        System.out.println(char1);
    }

}
