// Напишите программу, которая считывает целое число t - температуру воздуха, и выводит фразу: Температура воздуха сегодня: t градусов.

import java.util.Scanner;

class PrintT {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String t = a.next();
        System.out.print("Температура воздуха сегодня: " + t + " градусов." );   
    }
}
