public class ArraysAndLoops {
    public static void main(String[] args) {
        
        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "East Anglia"};

        System.out.println("The number of elements is: " + kingdoms.length); // print number of elements in the array

        for (int i = 0; i < 4; i++) {
            System.out.println(kingdoms[i]); // print each string in the array, using 'i' as the identifier
        }
    }    
}