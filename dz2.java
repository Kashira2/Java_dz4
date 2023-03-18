import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class dz2 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            link.add(i);
        }

        System.out.println(link);

        Integer x = 99;

        enqueue(link, x);
        System.out.println(link);

        System.out.println(dequeue(link));
        System.out.println(link);

        System.out.println(first(link));
        System.out.println(link);
    }

    private static Object first(LinkedList link) {
        return link.get(0);
    }

    private static Object dequeue(LinkedList link) {
        Object x = link.get(0);
        link.remove(0);
        return x;
    }

    private static void enqueue(LinkedList link, Integer x) {
        link.add(x);
    }
}
