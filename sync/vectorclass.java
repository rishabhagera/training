package sync;

import java.util.Iterator;
import java.util.Vector;

public class vectorclass {

    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();

        animals.add("Pig");
        animals.add("Sloth");
        animals.add("Cat");

        String element = animals.get(2);
        System.out.println("Element at position 2: " + element);

        Iterator<String> i = animals.iterator();
        while (i.hasNext()) {
            String nm = i.next();
            System.out.println(nm);

            if (nm.equals("Cat")) {
                i.remove();
            }
        }
        System.out.println("List of animals after removal: " + animals);
    }
}
