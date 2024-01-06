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
        ArrayList<Stuff> dirtlessYard = new ArrayList<Stuff>();
        for (Stuff thing: yard) {
            System.out.println(thing.type);
            if(thing.type != "dirt") {
                dirtlessYard.add(thing);
            }
        }
        return dirtlessYard;
    }
    
    // 2. Write a method that removes the hash tag ('#') characters from the
    //    ArrayList and returns it
    public static ArrayList<Character> removeHashTags(ArrayList<Character> list) {
        ArrayList<Character> noHashBrowns = new ArrayList<Character>();
        for (Character character: list) {
            System.out.println(character.charValue());
            if(character!='#') {
                noHashBrowns.add(character);
            }
        }
        return noHashBrowns;
    }
}
