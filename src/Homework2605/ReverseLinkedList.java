package Homework2605;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList <String> cities = new LinkedList<>();

        cities.add("Burgas");
        cities.addFirst("Albena");
        cities.add("Varna");
        cities.add("Gabrovo");
        cities.addLast("Pleven");
        cities.add("Dobrich");

        System.out.println("Linked list:");
        System.out.println(cities);

        LinkedList <String> reversedList = new LinkedList<>();

        for (int i = cities.size()-1; i >= 0 ; i--) {
            reversedList.add(cities.get(i));

        }

        System.out.println("Reversed linked list:");
        System.out.println(reversedList);

    }
}
