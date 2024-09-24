package uz.pdp.tdd;

public class TwoAndSeven {
    public String convert(int a) {
        if (a % 2 == 0 && a % 7 == 0)
            return "TwoAndSeven";
        if (a % 2 == 0)
            return "Two";
        if (a % 7 == 0)
            return "Seven";
        return String.valueOf(a);
    }
}
