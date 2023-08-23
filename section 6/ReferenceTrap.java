import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        // String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        // System.out.println(Arrays.toString(staffLastYear));

        // String[] staffThisYear = staffLastYear;
        // staffThisYear[1] = "Abbey";     // will affect both arrays

        // System.out.println(Arrays.toString(staffLastYear));
        // System.out.println(Arrays.toString(staffThisYear));

        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        // creating a new array avoids the trap
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}