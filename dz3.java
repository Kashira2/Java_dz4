import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.logging.*;

public class dz3 {
    public static void main(String[] args) throws IOException {
        Logger ll = Logger.getLogger(dz3.class.getName());
        String logsPath = "logcalc.txt";
        FileHandler fh = new FileHandler(logsPath, true);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        // XMLFormatter form = new XMLFormatter();
        fh.setFormatter(formatter);

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Integer num1 = reader.nextInt();

        LinkedList link = new LinkedList<>();
        link.add(num1);

        calc(link, num1, reader, ll);

        reader.close();
    }

    private static void calc(LinkedList link, Integer num1, Scanner reader, Logger ll) {

        System.out.print("Введите второе число: ");
        String num2 = reader.next();

        while (!num2.equals("exit")) {

            if (num2.equals("cancel")) {
                link.remove(link.size() - 1);
                num1 = (Integer) link.get(link.size() - 1);

            } else {
                Integer num = Integer.parseInt(num2);

                System.out.println("Введите знак (+ - / *): ");
                char sign = reader.next().charAt(0);
                Integer tempLog = num1;
                if (sign == '+')
                    num1 = num1 + num;
                else if (sign == '-')
                    num1 = num1 - num;
                else if (sign == '*')
                    num1 = num1 * num;
                else if (sign == '/')
                    num1 = num1 / num;

                link.add(num1);

                StringBuilder sb = new StringBuilder();
                sb.append(tempLog + " " + sign + " " + num + " = " + num1);
                ll.log(Level.INFO, sb.toString());
            }
            System.out.println(num1);
            System.out.printf("Введите число: ");
            num2 = reader.next();

        }
    }
}
