package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings, 2. Add five Strings to your list

        ArrayList<String> donuts = new ArrayList<String>();

        donuts.add("Cake");
        donuts.add("Jelly");
        donuts.add("Glazed");
        donuts.add("Frosted");
        donuts.add("Cream");

        // 3. Print all the Strings using a standard for-loop

        System.out.print("This is the for loop");
        for (int i = 0; i < donuts.toArray().length; i++) {
            System.out.println(donuts.get(i));
        }
        System.out.print("\n");

        // 4. Print all the Strings using a for-each loop

        System.out.println("This is the for each loop");
        for (String donut : donuts) {
            System.out.println(donut);
        }
        System.out.print("\n");

        // 5. Print only the even numbered elements in the list.

        System.out.println("printing out only the even numbered elements");
        for (int i = 0; i < donuts.toArray().length; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ". " + donuts.get(i));
            }
        }
        System.out.print("\n");

        // 6. Print all the Strings in reverse order.

        System.out.println("printing out in reverse order");
        for (int i = donuts.toArray().length - 1; i > -1; i--) {
            System.out.println(i + ". " + donuts.get(i));
        }
        System.out.print("\n");

        // 7. Print only the Strings that have the letter 'e' in them.

        System.out.println("printing out only words that have e in them");
        for (String donut : donuts) {
            int j = donuts.indexOf('e');
            if (j > -1) {
                System.out.println(donut);
            }
        }
    }
}
