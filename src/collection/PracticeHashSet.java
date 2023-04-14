package collection;

import java.util.HashSet;
//Unorder No Duplicates//
public class PracticeHashSet {
    public static void main(String[] args) {
        HashSet<String> kidsClothing = new HashSet<String>();
        kidsClothing.add("Coats and Jackets");
        kidsClothing.add("Jeans");
        kidsClothing.add("T-Shirts");
        kidsClothing.add("Joggers");
        kidsClothing.add("Shorts");
        kidsClothing.add("Shirts");
        kidsClothing.add("Swimwear");
        kidsClothing.add("shocks");
        System.out.println(kidsClothing);
        System.out.println(kidsClothing.toArray().length);
        kidsClothing.remove("Jeans");
        System.out.println("HashSet after removing elements: " + kidsClothing);
    }
}
