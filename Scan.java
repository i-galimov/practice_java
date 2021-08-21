// Сделайте программу так, чтобы она считывала строку, а затем выводила эту же строку на печать.

import java.util.Scanner;

class Scan {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String st = sc.nextLine();
       System.out.println(st);

   }
}
