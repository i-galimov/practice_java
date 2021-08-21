// Напишите программу, которая считывает имя пользователя и затем приветствует его.

import java.util.Scanner;

class PrintName {
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);
       String b = a.next();
       System.out.print("Привет, ");
       System.out.print(b);
    }
}
