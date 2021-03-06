import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Исправляем ошибки юности
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "Max is 25".


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить результат на экран.
3. Текст выведенный на экран должен начинаться с «Max is».
4. Текст выведенный на экран должен заканчиваться максимумом из 2х введенных чисел.
*/

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "Max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        Solution.max = a > b ? a : b;

        System.out.println(max + Solution.max);
    }

}
