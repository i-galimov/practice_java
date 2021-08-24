// Давайте напишем программу-помощника, который сообщает, сколько у Вас новых сообщений на почте. Формат ввода. На первой строке вводится имя пользователя, на второй имя помощника, на третьей - количество сообщений.

import java.util.Scanner;

class Helper {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);        
        String b = a.nextLine();
        String f = a.nextLine();
        String d = a.nextLine();
        System.out.print("Привет, ");
        System.out.print(b);
        System.out.print(", это твой помощник ");
        System.out.print(f);
        System.out.println(".");
        System.out.print("У тебя ");
        System.out.print(d);
        System.out.print(" новых писем.");
        
    }
}
