import java.util.Arrays;

import shape.*;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        System.out.println("sort using compareTo");
        ComparableCircle temp;
        for (int j = 0; j < circles.length; j++) {
            for (int i = 1; i < circles.length; i++) {
                if (circles[i - 1].compareTo(circles[i]) == -1) {
                    temp = circles[i - 1];
                    circles[i - 1] = circles[i];
                    circles[i] = temp;
                }
            }
        }


        System.out.println("After use compareTo:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}