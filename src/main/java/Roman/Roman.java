package Roman;

public class Roman {

    public String convertFromInt(int number) {
        String result = "-1";


        if (number == 1)
            result = "I";
        if (number == 2)
            result = "II";
        if (number == 3)
            result = "III";
        if (number == 4)
            result = "IV";
        if (number == 5)
            result = "V";
        if (number == 6)
            result = "VI";
        if (number == 7)
            result = "VII";
        if (number == 8)
            result = "VIII";
        if (number == 9)
            result = "IX";



        if (number == 10)
            result = "X";
        if (number == 11)
            result = "XI";
        if (number == 12)
            result = "XII";
        if (number == 13)
            result = "XIII";
        if (number == 14)
            result = "XIV";
        if (number == 15)
            result = "XV";
        if (number == 16)
            result = "XVI";
        if (number == 17)
            result = "XVII";
        if (number == 18)
            result = "XVIII";
        if (number == 19)
            result = "XIX";



        return result;
    }
}
