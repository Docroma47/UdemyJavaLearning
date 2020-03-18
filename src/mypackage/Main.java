package mypackage;

public class Main {
    public static void main(String[] args) {
        String[] names;
        names = new String[3];

        String[] name = new String[3];
        int[] arr = new int[10];

        name[0] = "Boris";
        name[1] = "Senya";
        name[2] = "Vova";

        System.out.println(name[0]);
        System.out.println(name[2]);

        arr[3] = 15;
        arr[3] = 10;
        System.out.println(arr[3]);

        int[] array = {10, 13, 200};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println();
        for (int i = 0; i < 5; i++) System.out.println(i);

        int[] array2 = new int[15];
        System.out.println();
        for (int j = 0; j < 15; j++) {
            array2[j] = j * 10;
            System.out.println(array2[j]);
        }

        System.out.println();
        System.out.println(array2.length);

        System.out.println(array2[array2.length - 1]);


    }

}
