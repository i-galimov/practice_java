// Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false. 

public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    int count = 0;
    if (a == true)
    {
        count += 1;
    }
    if (b == true)
    {
        count += 1;
    }
    if (c == true)
    {
        count += 1;
    }
    if (d == true)
    {
        count += 1;
    }
    if (count == 2)
    {
        return true;
    }
    return false;
}
