// На вход подаются два положительных действительных числа - стороны прямоугольника. Посчитайте его площадь и периметр и выведите на отдельных строках.
import java.util.Scanner;

class SPRectangle {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double b = a.nextDouble();
        double c = a.nextDouble();
        System.out.println(b * c);
        System.out.println(2 * (b + c));
   }
}
