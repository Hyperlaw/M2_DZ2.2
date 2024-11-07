import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();


        System.out.println("Введите 5 строк для списка А:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println("Список А: " + listA);


        ArrayList<String> listB = new ArrayList<>();


        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println("Список B: " + listB);


        ArrayList<String> listC = new ArrayList<>();

        Collections.reverse(listB);

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println("Список С: " + listC);

        listC.sort(Comparator.comparingInt(String::length));

        System.out.println("От меньшего к большему: "+ listC);

    }
}
