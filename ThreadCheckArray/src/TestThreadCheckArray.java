import java.util.ArrayList;
import java.util.Scanner;

public class TestThreadCheckArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Thread thread1, thread2;

            System.out.println("Enter array size");
            int num = input.nextInt();
            ArrayList<Integer> array = new ArrayList<>();

            System.out.println("Enter numbers for array");
            for (int i = 0; i < num; i++) {
                array.add(input.nextInt());
            }

            System.out.println("Enter number");
            int target = input.nextInt();

            SharedData sd = new SharedData(array, target);

            thread1 = new Thread(new ThreadCheckArray(sd), "thread1");
            thread2 = new Thread(new ThreadCheckArray(sd), "thread2");
            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!sd.getFlag()) {
                System.out.println("Sorry");
                return;
            }

            System.out.println("Solution for b : " + sd.getB() + ", n = " + sd.getArray().size());
            System.out.print("I:    ");
            for (int i = 0; i < sd.getArray().size(); i++) {
                System.out.print(i + "    ");
            }

            System.out.println();
            System.out.print("A:    ");
            for (int value : sd.getArray()) {
                System.out.print(value);
                int counter = 5;
                int temp = value;
                while (true) {
                    temp = temp / 10;
                    counter--;
                    if (temp == 0)
                        break;
                }
                for (int i = 0; i < counter; i++)
                    System.out.print(" ");
            }

            System.out.println();
            System.out.print("C:    ");
            for (boolean b : sd.getWinArray()) {
                System.out.print(b ? "1    " : "0    ");
            }
        }
    }
}
