package geekbrainshomework2;
import java.util.Arrays;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        //№1  Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        byte[] mas = {0, 1, 1, 0, 0, 0, 1};
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                mas[i] = 1;
            } else {
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
        //№2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] mass = new int[8];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i * 3;
        }
        //№3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] s = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < s.length; i++) {
            if (s[i] < 6) {
                s[i] = s[i] * 2;
            }
        }
        System.out.println(Arrays.toString(s));

        //№4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] table = new int[4][4];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
        }
        for (int i = 0, j = 3; i < table.length; i++, j--) {
            table[i][j] = 1;
            System.out.println(Arrays.toString(table[i]));
        }
        //№5
        // Задать одномерный массив и найти в нем минимальный и максимальный элементы
    }
}

