// Напишите программу, которая принимает три числа - год, месяц и день и выводит на печать фразу: DD:MM:YYYY.

import java.util.Scanner;

class PrintDate {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);        
        String b = a.next();
        String c = a.next();
        String d = a.next();
        System.out.print(d);
        System.out.print(":");
        System.out.print(c);
        System.out.print(":");
        System.out.print(b);
        
    }
}
