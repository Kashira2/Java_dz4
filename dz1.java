// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class dz1 {

    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            link.add(i);
        }

        System.err.println(link.toString());

        String res = reverseLink(link).toString();
        System.out.println(res);
    }

    private static LinkedList reverseLink(LinkedList<Integer> link) {
        LinkedList<Integer> link2 = new LinkedList<>();

        for (int i = 0; i < link.size(); i++) {
            link2.addFirst(link.get(i));
        }

        return link2;
    }
}