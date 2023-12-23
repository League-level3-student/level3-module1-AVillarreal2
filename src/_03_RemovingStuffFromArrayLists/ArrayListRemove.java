package _03_RemovingStuffFromArrayLists;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListRemove {

    class Stuff {
        public String type;
    }
    
    class Worm extends Stuff {
        public Worm() {
            type = "worm";
        }
    }
    
    class Dirt extends Stuff {
        public Dirt() {
            type = "dirt";
        }
    }

    // 1. Write a method that removes the dirt in the yard and returns the
    //    ArrayList
    public static ArrayList<Stuff> cleanOutTheYard( ArrayList<Stuff> yard ) {
        ArrayList<Stuff> dirt = new ArrayList<Stuff>();
        dirt.add("dirt");
        for (Stuff thing: yard) {
            System.out.println(thing.type);
            if("dirt".equals(thing.type)) {
                yard.remove(thing);
            }
        }
        Stuff Dirt;
        yard.remove(Dirt);
        for (Stuff thing: yard) {
            System.out.println(thing);
        }
        return yard;
    }
    
    // 2. Write a method that removes the hash tag ('#') characters from the
    //    ArrayList and returns it
    public static ArrayList<Character> removeHashTags(ArrayList<Character> list) {

        return list;
    }
}
