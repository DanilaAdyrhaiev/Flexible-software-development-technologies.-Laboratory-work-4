package org.nau.Task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("A\tB\tC");
        System.out.println("-----------------");

        for (boolean A : new boolean[] {false, true}) {
            for (boolean B : new boolean[] {false, true}) {
                for (boolean C : new boolean[] {false, true}) {
                    System.out.println(A + "\t" + B + "\t" + C);
                }
            }
        }
    }
}
