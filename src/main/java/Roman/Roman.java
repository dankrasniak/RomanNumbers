package Roman;

public class Roman {

    public String convertFromInt(int number) throws UnderFlowException {
        String result = "";
        if (number <= 0)
            throw new UnderFlowException();
        // M == 1000
        // D == 500
        // C == 100
        // L == 50
        // X == 10
        // V == 5
        // I = 1

        if ((number % 10000) / 1000 >= 1)
            result += getConstruction((number % 10000) / 1000, "", "", "M");
        if ((number % 1000) / 100 >= 1)
            result += getConstruction((number % 1000) / 100, "M", "D", "C");
        if ((number % 100) / 10 >= 1)
            result += getConstruction((number % 100) / 10, "C", "L", "X");
        if ((number % 10) >= 1)
            result += getConstruction((number % 10), "X", "V", "I");

        return result;
    }

    private String getConstruction(int number, String big, String bigger, String lower) {
        String result = "";
        if (number == 1)
            result = lower;
        if (number == 2)
            result = lower + lower;
        if (number == 3)
            result = lower + lower + lower;
        if (number == 4)
            result = lower + bigger;
        if (number == 5)
            result = bigger;
        if (number == 6)
            result = bigger + lower;
        if (number == 7)
            result = bigger + lower + lower;
        if (number == 8)
            result = bigger + lower + lower + lower;
        if (number == 9)
            result = lower + big;
        return result;
    }
}
