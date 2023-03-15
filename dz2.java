import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class dz2 {
    public static void main(String[] args) {
        Deque link = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            link.add(i);
        }

        System.out.println(link.toString());

        Integer x = 99;

        enqueue(link, x);
        dequeue(link);
        first(link);
        System.out.println(link);
    }

    private static void first(Deque link) {
        System.out.println(link.element());
    }

    private static void dequeue(Deque link) {
        System.out.println(link.pollFirst());
    }

    private static void enqueue(Deque link, Integer x) {
        link.add(x);
    }
}
