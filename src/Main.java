/*
Сортировка массива интов из 10 чисел
 */

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int tab[] = new int[10];

        if (args.length != 10){
            System.out.println("Кол-во аргументов не равно 10");
            return;
        }
        try {
            while (i < args.length){
                tab[i] = Integer.parseInt(args[i]);
                i++;
            }
        } catch (NumberFormatException e){
            System.out.println("Неверный формат ввода данных");
            return;
        }
        sortTab(tab);
        printTab(tab);
    }

    private static void sortTab(int[] tab) {
        int i = 0;
        int swap;
        while (i < tab.length - 1){
            if (tab[i] > tab[i + 1]){
                swap = tab[i];
                tab[i] = tab[i + 1];
                tab[i + 1] = swap;
                i = 0;
            }
            else
                i++;
        }
    }

    private static void printTab(int[] tab) {
        int i = 0;
        while (i < tab.length){
            System.out.print(tab[i] + " ");
            i++;
        }
    }
}
